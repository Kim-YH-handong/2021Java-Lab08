package edu.handong.csee.java.hw2.converters;
/** This is an interface for all the converter. */
public interface Convertible {
    /**Set fromValue to originalValue. */
    public void setFromValue(double fromValue);
    /**Return convertedValue. */
    public double getConvertedValue();
    /**Convert fromValue to convertedValue. */
    public void convert();

}