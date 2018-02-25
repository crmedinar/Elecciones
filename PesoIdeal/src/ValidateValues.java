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
    
    public static boolean validKeyPressed(char myInputChar){
        boolean validKey = false;
        if ((myInputChar >='A'  & myInputChar <='Z') || (myInputChar >='a'  & myInputChar <='z') || (myInputChar==' ')) {
            validKey=true;
        } 
        
        
        return validKey;
    }
    
    public static boolean validNumber(char myInputChar){
        boolean validNumber = false;
        
        if (!(Character.isDigit(myInputChar) )) {
            validNumber = true;
        }
        
        return validNumber;
    }
    
    
    
    
}
