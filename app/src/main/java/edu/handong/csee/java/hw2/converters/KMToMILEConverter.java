package edu.handong.csee.java.hw2.converters;
/**
This class is made to convert km to mile.

 */
public class KMToMILEConverter implements Convertible {

    private double originalValue;
    private double convertedValue;

    /** Set value in local variable. */
    public void setFromValue(double fromValue){
        originalValue = fromValue;
    }

    /** Return converted value. */
    public double getConvertedValue(){
        return convertedValue;
    }

    /** Convert  km to mile.*/
    public void convert(){
        convertedValue=originalValue/1.6;
    }

}
