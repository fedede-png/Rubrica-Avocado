/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.edu.gastaldiabba.rubrica.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

/**
 * FXML Controller class
 *
 * @author ernec
 */
public class FXMLAggiungiController implements Initializable {

    private ChoiceBox scelteAff; 
    
    ObservableList<Integer> scelteAffList = FXCollections.observableArrayList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scelteAff.setValue("N.D.");
        scelteAff.setItems(scelteAffList);
        
       
    } 
    
}
