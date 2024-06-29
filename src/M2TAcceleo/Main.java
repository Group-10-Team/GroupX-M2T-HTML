package M2TAcceleo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import html.Document;
import html.Element;
import html.HtmlFactory;
import html.HtmlPackage;
import html.GrandTitre;
import html.Paragraphe;
import html.Titre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HtmlPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createURI("output/document.xmi"));
        
        HtmlFactory factory = HtmlFactory.eINSTANCE;
        Document document = factory.createDocument();

        try (BufferedReader br = new BufferedReader(new FileReader("../GroupX-M2T-HTML/src/source.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim().replace("\"", "");
                    
                    switch (key) {
                        case "titre":
                            Titre titre = factory.createTitre();
                            titre.setValue(value);
                            document.getElements().add(titre);
                            break;
                        case "grand-titre":
                            GrandTitre grandTitre = factory.createGrandTitre();
                            grandTitre.setValue(value);
                            document.getElements().add(grandTitre);
                            break;
                        case "paragraphe":
                            Paragraphe paragraphe = factory.createParagraphe();
                            paragraphe.setValue(value);
                            document.getElements().add(paragraphe);
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        resource.getContents().add(document);

        try {
            resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

