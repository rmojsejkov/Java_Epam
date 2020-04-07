package com.company.Decorator;

/**
 * This is an abstract class, which is the base class
 * of the decorator.
 * @author Moiseikov R.A
 * @version 1.0
 */
public abstract class UEC {
    private int individualNumber;
    private int barcode;
    private int pincode;

    public UEC(int individualNumber, int barcode, int pincode) {
        this.barcode = barcode;
        this.individualNumber = individualNumber;
        this.pincode = pincode;
    }

    public UEC(){}

    public String getInfo(){
        return "Universal electronic card: individualNumber= " + individualNumber +", barcode= " + barcode +". limbs: ";
    }

    @Override
    public String toString() {
        return "UEC{" +
                "individualNumber='" + individualNumber + '\'' +
                ", barcode=" + barcode + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public int getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(int individualNumber) {
        this.individualNumber = individualNumber;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getPincode() {
        return  pincode;
    }

    public void setPincode(int pincode){
        this.pincode = pincode;
    }
}


