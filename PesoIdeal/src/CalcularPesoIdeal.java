/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class CalcularPesoIdeal {

    public String calculoIndiceindiceMasaCorporal(String estatura, String peso) {

        double masaCorporal;
        String masaCorporalStr = "";
        masaCorporal = Double.parseDouble(peso) / (Double.parseDouble(estatura) * Double.parseDouble(estatura));
        masaCorporalStr = String.valueOf(masaCorporal);

        return masaCorporalStr;
    }

    
    
    
    
}
