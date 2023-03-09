package com.mycompany.calcuperson;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcuController implements Initializable {


    @FXML
    private ComboBox ComboBoxProvince;
    @FXML
    private ComboBox ComboBoxFirstPerson;
    @FXML
    private ComboBox ComboBoxSecondPerson;
    @FXML
    private Button BtnPerson;
    @FXML
    private Button BtnSuma;
    @FXML
    private Button BtnResta;
    @FXML
    private Button BtnMulti;
    @FXML
    private Button BtnDiv;
    @FXML
    private TextField TxtName;
    @FXML
    private TextField TxtAge;
    @FXML
    private Label LabelResult;
    
    int operation;
    List ListaNombre = new ArrayList();
    List ListaAge = new ArrayList();
    int ind;
    int ind2;
    
    /**
     * Esta función lo que hace es que al inicializar el programa muestre de un solo las cosas que se quieran mostrar sin necesidad de eventos.
    **/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ObservableList<String> list = FXCollections.observableArrayList("San José","Alajuela","Cartago","Heredia","Guanacaste","Puntarenas","Limón");
      ComboBoxProvince.setItems(list);
      ListaNombre.add(0,TxtName.getText());
      ListaAge.add(0,TxtAge.getText());
      
    }    
  
    /**
     * Esta función sirve para cuando se le de click al botón +Person haga una serie de instrucciones
     * 
     * @param event Funciona para especificar que es nuestro evento
     **/
    @FXML
    private void ClickPerson(ActionEvent event) {
        try {
            ListaNombre.add(0,TxtName.getText());
            ListaAge.add(0,TxtAge.getText());
            ObservableList<String> list2 = FXCollections.observableArrayList(ListaNombre);
            ComboBoxFirstPerson.setItems(list2);
            ObservableList<String> list1 = FXCollections.observableArrayList(ListaNombre);
            ComboBoxSecondPerson.setItems(list1);
        }
        catch (NumberFormatException e){
		System.out.println("Enter only numbers plis");
            }
        catch (Exception e) {
            System.out.println("Error");
            }
	
    }

    /**
     * Esta función sirve para cuando se le de click al botón Suma haga una serie de instrucciones para que sume la edad de las personas
     * @param event Funciona para especificar que es nuestro evento
     */
    @FXML
    private void ClickSuma(ActionEvent event) {
        ind = ComboBoxFirstPerson.getSelectionModel().getSelectedIndex();
        ind2 = ComboBoxSecondPerson.getSelectionModel().getSelectedIndex();
        operation = Integer.parseInt((String) ListaAge.get(ind)) + Integer.parseInt((String) ListaAge.get(ind2));
        LabelResult.setText(String.valueOf(operation));
    }

    /**
     * Esta función sirve para cuando se le de click al botón Resta haga una serie de instrucciones para que reste la edad de las personas
     * @param event Funciona para especificar que es nuestro evento
     */
    @FXML
    private void ClickResta(ActionEvent event) {
        ind = ComboBoxFirstPerson.getSelectionModel().getSelectedIndex();
        ind2 = ComboBoxSecondPerson.getSelectionModel().getSelectedIndex();
        operation = Integer.parseInt((String) ListaAge.get(ind)) - Integer.parseInt((String) ListaAge.get(ind2));
        LabelResult.setText(String.valueOf(operation));
    }

    /**
     * Esta función sirve para cuando se le de click al botón Multiplicación haga una serie de instrucciones para que multiplique la edad de las personas
     * @param event Funciona para especificar que es nuestro evento
     */
    @FXML
    private void ClickMulti(ActionEvent event) {
        ind = ComboBoxFirstPerson.getSelectionModel().getSelectedIndex();
        ind2 = ComboBoxSecondPerson.getSelectionModel().getSelectedIndex();
        operation = Integer.parseInt((String) ListaAge.get(ind)) * Integer.parseInt((String) ListaAge.get(ind2));
        LabelResult.setText(String.valueOf(operation));
    }

    /**
     * Esta función sirve para cuando se le de click al botón División haga una serie de instrucciones para que divida la edad de las personas
     * @param event Funciona para especificar que es nuestro evento
     */
    @FXML
    private void ClickDiv(ActionEvent event) {
        ind = ComboBoxFirstPerson.getSelectionModel().getSelectedIndex();
        ind2 = ComboBoxSecondPerson.getSelectionModel().getSelectedIndex();
        operation = Integer.parseInt((String) ListaAge.get(ind)) / Integer.parseInt((String) ListaAge.get(ind2));
        LabelResult.setText(String.valueOf(operation));
    }


}
