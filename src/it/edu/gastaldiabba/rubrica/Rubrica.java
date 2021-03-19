
package it.edu.gastaldiabba.rubrica;

import it.edu.gastaldiabba.rubrica.model.Cliente;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author cerra.federico
 */
public class Rubrica extends Application {
    
private static File xmlFile = new File("personeXml.xml");
ObservableList<Cliente> clientiOss = FXCollections.observableArrayList();    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        launch(args);
       
    }
   
    public void Observable(){
 
        // rag, cap, email, indiriz, num tel, citta, iva(string), note, affidabilita
        
        Cliente c = new Cliente("mucca",5332,"mu","yeah",21,"genova","05450494594", "prova u u prova", 6 );
    
      clientiOss.add(c);
    }
    
    private void creaXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaXmlActionPerformed
 
        try{
          
               try {
            create();
        } catch (ParserConfigurationException | TransformerException | IOException ex) {
            System.out.println(ex.getMessage());
        }
           
        } catch(NullPointerException E){
        }
 
            
    }
    
    public void create() throws ParserConfigurationException, TransformerConfigurationException, TransformerException, IOException {
        
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rubrica = doc.createElement("Rubrica");
        doc.appendChild(rubrica);

       for(int i=0;i<clientiOss.size();i++){
        
        Element cliente = doc.createElement("Cliente");
        rubrica.appendChild(cliente);
        
        Element nome = doc.createElement("Ragione sociale");
        nome.appendChild(doc.createTextNode(clientiOss.get(i).getRagioneSociale()));
        cliente.appendChild(nome);
        
        String intCap=valueOf(clientiOss.get(i).getCap());
        Element cap = doc.createElement("CAP");
        cap.appendChild(doc.createTextNode(intCap));
        cliente.appendChild(cap);
        
        Element email = doc.createElement("Email");
        email.appendChild(doc.createTextNode(clientiOss.get(i).getEmail()));
        cliente.appendChild(email);
        
        Element indirizzo = doc.createElement("Indirizzo");
        indirizzo.appendChild(doc.createTextNode(clientiOss.get(i).getIndirizzo()));  
        cliente.appendChild(indirizzo);
       
        String intTel=valueOf(clientiOss.get(i).getCap());
        Element nTelefono=  doc.createElement("Numero di telefono");
        nTelefono.appendChild(doc.createTextNode(intTel));  
        cliente.appendChild(nTelefono);

        Element citta=  doc.createElement("Città");
        citta.appendChild(doc.createTextNode(clientiOss.get(i).getCitta()));  
        cliente.appendChild(citta);
        
        Element iva=  doc.createElement("IVA");
        iva.appendChild(doc.createTextNode(clientiOss.get(i).getIva()));  
        cliente.appendChild(iva);
        
        Element note=  doc.createElement("Note");
        note.appendChild(doc.createTextNode(clientiOss.get(i).getNote()));  
        cliente.appendChild(note);
        
        String intAffidabilita=valueOf(clientiOss.get(i).getAffidabilita());
        Element affidabilita = doc.createElement("Affidabilità");
        affidabilita.appendChild(doc.createTextNode(intAffidabilita));
        cliente.appendChild(affidabilita);
       }
       
       
       
       
    
          

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
     
         if(xmlFile.createNewFile()){
             StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
             
                      System.out.print("File creato");
         }else{
        xmlFile.delete();
        xmlFile.createNewFile();
        StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
                      System.out.print("File creato");

         }
    }
}
