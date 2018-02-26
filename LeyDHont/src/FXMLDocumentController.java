/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class FXMLDocumentController implements Initializable {
    
     Partido partido = new Partido("Todos Somos Pueblo ","TSP", 250000);
     Eleccion eleccion;
     
    
     
             
             
             
     
    
    @FXML
    private Label label;
    @FXML
    private TextField txtEscanos;
    @FXML
    private TextField txtPartido;
    @FXML
    private TextField txtVotos;
    @FXML
    private TextField txtDiputados;
    @FXML
    private RadioButton rbtAgregar;
    @FXML
    private RadioButton rbtModificar;
    @FXML
    private RadioButton rbtEliminar;
    @FXML
    private Button btnAccion;
   @FXML
    private TextArea txaListado;
        
    
            
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       eleccion = new Eleccion(3500000, 20000,"ZZZ","ZZZ");
       eleccion = new Eleccion(3500000, 250000,"STP","STP");
       
       txaListado.appendText(partido.getNombre());
       eleccion.populatePartido();
        
        
    }    

    @FXML
    private void rbtAgregarHandler(ActionEvent event) {
        
        partido = new Partido("Todos Somos Pueblo ","TSP", 250000);
        
        
    }

    @FXML
    private void rbtModificarHandler(ActionEvent event) {
    }

    @FXML
    private void rbtEliminarHandler(ActionEvent event) {
    }

    @FXML
    private void btnAccionHandler(ActionEvent event) {
    }
    
}
