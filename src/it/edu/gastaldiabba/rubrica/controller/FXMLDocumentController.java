
package it.edu.gastaldiabba.rubrica.controller;

import it.edu.gastaldiabba.rubrica.model.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author cerra.federico
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<Cliente> table;
    
    @FXML
    private TableColumn<Cliente, String> ragsoc;
    
    @FXML
    private TableColumn<Cliente, Integer> cap;
    
    @FXML
    private TableColumn<Cliente, String> email;
    
    @FXML
    private TableColumn<Cliente, String> indirizzo;
    
    @FXML
    private TableColumn<Cliente, Integer> numtel;
    
    @FXML
    private TableColumn<Cliente, String> citta;
    
    @FXML
    private TableColumn<Cliente, String> iva;
    
    @FXML
    private TableColumn<Cliente, Integer> affidabilita;
    
    @FXML
    private TableColumn<Cliente, String> note;
    
    ObservableList<Cliente> clientiOss = FXCollections.observableArrayList(
    
     new Cliente("Ernesto",5332,"Ernesto@gmail.com","foresta",21,"genova","05450494594", "prova u u prova", 6 ),
     new Cliente("crisopher",5332,"cristito12@gmail.com","Fiumara",21,"genova","05450494594", "prova u u prova", 6 )
   
     );
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        ragsoc.setCellValueFactory(new PropertyValueFactory<>("ragioneSociale"));
        cap.setCellValueFactory(new PropertyValueFactory<>("cap"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        indirizzo.setCellValueFactory(new PropertyValueFactory<>("indirizzo"));
        numtel.setCellValueFactory(new PropertyValueFactory<>("nTelefono"));
        citta.setCellValueFactory(new PropertyValueFactory<>("citta"));
        iva.setCellValueFactory(new PropertyValueFactory<>("iva"));
        affidabilita.setCellValueFactory(new PropertyValueFactory<>("affidabilita"));
        note.setCellValueFactory(new PropertyValueFactory<>("note"));
        
        table.setItems(clientiOss);
        
    }    
    
}
