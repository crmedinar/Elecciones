/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class ValidateValues {
    
    public static boolean validateKeyPressed(char myInputChar){
        boolean validKey = false;
        if ((myInputChar >=64 & myInputChar <=80) ) {
            validKey=true;
        }
        
        
        return validKey;
    }
    
    
    
    
    
    
}
