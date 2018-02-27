/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class FXMLDocumentController implements Initializable {
    
//     Partido partido = new Partido("Todos Somos Pueblo ","TSP", 250000);
   Eleccion eleccion = new Eleccion();
   int i =0;
     //Eleccion eleccion;
     
    
    @FXML   private Label label;
    @FXML   private TextField txtEscanos;
    @FXML   private TextField txtPartido;
    @FXML   private TextField txtVotos;
    @FXML   private TextField txtDiputados;
    @FXML   private RadioButton rbtAgregar;
    @FXML   private RadioButton rbtModificar;
    @FXML   private RadioButton rbtEliminar;
    @FXML   private Button btnAccion;

    @FXML   private ListView<String> lstvPartidos;
        
    
            
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

       //Eleccion.populatePartido();
        
        
    }    

    @FXML
    private void rbtAgregarHandler(ActionEvent event) {
        
     //   partido = new Partido("Todos Somos Pueblo ","TSP", 250000);
        
     }

    @FXML
    private void rbtModificarHandler(ActionEvent event) { 
        
    }

    @FXML
    private void rbtEliminarHandler(ActionEvent event) {
        
    }

    @FXML
    private void btnAccionHandler(ActionEvent event) {
        System.out.println("Estoy en ActionHandler");
      //  ObservableList<Partido> dataLine =FXCollections.concat();
      //   ObservableList<Partido> dataLine =FXCollections.observableArrayList(Eleccion.partido);
         Eleccion.agregarPartido("El Zorro","ZZZ", 2500);
      //   dataLine.add(Eleccion.partido.getindex());
         Eleccion.agregarPartido("Star Trek","ST", 38000);
         Eleccion.agregarPartido("Star Wars","SW",25500);
         Eleccion.agregarPartido("GeoMundo","Geo",36000);
                  Eleccion.agregarPartido("Gold FIlled","ST", 38000);
         Eleccion.agregarPartido("Perfect Storm","SW",25500);
         Eleccion.agregarPartido("Perfect Life","Geo",36000);
                           Eleccion.agregarPartido("Alice in Wonderland","ST", 38000);
         Eleccion.agregarPartido("Peter Pan","SW",25500);
         Eleccion.agregarPartido("Unknown","Geo",36000);
       //  lstvPartidos.setItems(dataLine.add(partido.getNombre()));
       //  lstvPartidos.getItems().addAll(Eleccion.partido.get(Eleccion.partidosPoliticos).getNombre());
        // Eleccion.partido.forEach(element-> lstvPartidos.setItems(dataLine));
//         lstvPartidos.getItems().add(Eleccion.partido
//                                                .forEach(e -> {
//            return e.getNombre();
//        }));
           // lstvPartidos.getItems(Eleccion.partido.forEach(e -> e.getNombre()));
           
//           ObservableList<String> myObservableListData = FXCollections.observableArrayList(getList(Eleccion.partido));
//                     
//           Eleccion.partido.forEach(e -> lstvPartidos.setItems((ObservableList)e.getNombre())); 

               String[] myList = new String[Eleccion.partidosPoliticos];
               
               Eleccion.partido.forEach(element -> {
                                            myList[i]=element.getNombre();
                                            i++;
                                            });
               
               ObservableList<String> myObservableListData = FXCollections.observableArrayList(myList);
               //myObservableListData.addAll(myList);
               lstvPartidos.setItems(myObservableListData);
               
              // Eleccion.partido.forEach(e -> lstvPartidos.setItems());
    }          
    
}
