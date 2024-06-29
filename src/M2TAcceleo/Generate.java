package M2TAcceleo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Generate {
    public static void main(String[] args) {
        String filePath = "path/to/source.txt";
        EPackage myLangPackage = createPackage();
        EObject model = createModelFromSource(filePath, myLangPackage);

        // Save the model to an XMI file
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("model.xmi"));
        resource.getContents().add(model);

        try {
            resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static EPackage createPackage() {
        EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
        EPackage myLangPackage = ecoreFactory.createEPackage();
        myLangPackage.setName("myLang");
        myLangPackage.setNsPrefix("myLang");
        myLangPackage.setNsURI("http://www.example.org/myLang");

        EClass myLangModelClass = ecoreFactory.createEClass();
        myLangModelClass.setName("MyLangModel");

        EAttribute titre = ecoreFactory.createEAttribute();
        titre.setName("titre");
        titre.setEType(EcorePackage.Literals.ESTRING);
        myLangModelClass.getEStructuralFeatures().add(titre);

        EClass grandTitreClass = ecoreFactory.createEClass();
        grandTitreClass.setName("GrandTitre");
        EAttribute grandTitreValue = ecoreFactory.createEAttribute();
        grandTitreValue.setName("value");
        grandTitreValue.setEType(EcorePackage.Literals.ESTRING);
        grandTitreClass.getEStructuralFeatures().add(grandTitreValue);

        EClass paragrapheClass = ecoreFactory.createEClass();
        paragrapheClass.setName("Paragraphe");
        EAttribute paragrapheValue = ecoreFactory.createEAttribute();
        paragrapheValue.setName("value");
        paragrapheValue.setEType(EcorePackage.Literals.ESTRING);
        paragrapheClass.getEStructuralFeatures().add(paragrapheValue);

        myLangPackage.getEClassifiers().add(myLangModelClass);
        myLangPackage.getEClassifiers().add(grandTitreClass);
        myLangPackage.getEClassifiers().add(paragrapheClass);

        return myLangPackage;
    }

    private static EObject createModelFromSource(String filePath, EPackage myLangPackage) {
        EClass myLangModelClass = (EClass) myLangPackage.getEClassifier("MyLangModel");
        EClass grandTitreClass = (EClass) myLangPackage.getEClassifier("GrandTitre");
        EClass paragrapheClass = (EClass) myLangPackage.getEClassifier("Paragraphe");

        EObject model = myLangPackage.getEFactoryInstance().create(myLangModelClass);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim().replace("\"", "");

                    switch (key) {
                        case "titre":
                            model.eSet(myLangModelClass.getEStructuralFeature("titre"), value);
                            break;
                        case "grand-titre":
                            EObject grandTitre = myLangPackage.getEFactoryInstance().create(grandTitreClass);
                            grandTitre.eSet(grandTitreClass.getEStructuralFeature("value"), value);
                            model.eContents().add(grandTitre);
                            break;
                        case "paragraphe":
                            EObject paragraphe = myLangPackage.getEFactoryInstance().create(paragrapheClass);
                            paragraphe.eSet(paragrapheClass.getEStructuralFeature("value"), value);
                            model.eContents().add(paragraphe);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return model;
    }
}
