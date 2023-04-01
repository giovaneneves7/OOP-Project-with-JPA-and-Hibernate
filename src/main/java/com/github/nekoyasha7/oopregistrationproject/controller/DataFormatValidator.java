package com.github.nekoyasha7.oopregistrationproject.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author GiovaneNeves
 */
public class DataFormatValidator {
    
    /**
     * 
     * @param textFieldContent with the text to be checked.
     * @return true if the textField is null, false otherwise.
     */
    public static boolean isNull(String textFieldContent){
        
        return textFieldContent.isEmpty();
        
    }
    
    /**
     * 
     * @param textFieldContents with strings to be checked.
     * @return true if at least one of the strings in the array equals null.
     */
    public static boolean isNull(String[] textFieldContents){
        
        for(String content : textFieldContents)
            if(content.isEmpty()) return true;
        
        return false;
    }
    
    /**
     * 
     * @param string to be converted to float
     * @return -1 if the string is null or or in a format that cannot be converted to float, or the converted number otherwise.
     */
    public static float convertToFloat(String string){
        
        if(isNull(string)) return -1;
        
        float convertedNumber = -1;
        
        try{
            
            convertedNumber = Float.parseFloat(string);
            
        } catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(null, "Text field with incorrect data types", "Registration!", JOptionPane.ERROR_MESSAGE);
        }
        
        return convertedNumber;
    }
}
