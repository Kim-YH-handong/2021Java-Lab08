package edu.handong.csee.java.hw2.converters;
/** 
This class is made to convert km to mile and m or ton to g and kg. */

public class AllConverter{

    private double fromValue;
    private String originalMeasure;
    private double convertedValue1;
    private double convertedValue2;

    /** This is a constructor. */
    public AllConverter(){};

    /** Set value in local variable. */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;
        return this;
    }

    /** Set type of measure in local variable. */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure=originalMeasure;
        return this;
    }

    /** Decide whether input measure is km or ton. 
        And, convert the decided measure into two other measurements.  */
    public AllConverter convertAndPrintOut(){
        if(originalMeasure.equals("KM")){
            convertedValue1 = fromValue/1.6; //mile
            convertedValue2 = fromValue*1000; //m
            System.out.println(fromValue + " KM to " + convertedValue2 + " M\n" +
            fromValue + " KM to " + convertedValue1 +" MILE");
        }
        else if (originalMeasure.equals("TON")){
            convertedValue1 = fromValue*1000000; //g
            convertedValue2 = fromValue*1000; //kg
            System.out.println(fromValue + " TON to " + convertedValue2 + " KG\n" +
            fromValue + " TON to " + convertedValue1 + " G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }


}
