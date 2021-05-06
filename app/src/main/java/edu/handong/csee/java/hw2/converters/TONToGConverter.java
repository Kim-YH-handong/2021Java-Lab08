package edu.handong.csee.java.hw2.converters;
/**
This class is made to convert ton to g.

 */
public class TONToGConverter implements Convertible {

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

    /** Convert  ton to g.*/
    public void convert(){
        convertedValue=(originalValue*1000000);
    }

}