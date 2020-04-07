package com.company.Decorator;

/**
 * Class, which describes the entity "card".
 * @author Moiseikov R.A
 * @version 1.0
 */
public class Card extends UEC{

    public Card(int individualNumber, int barcode, int pincode){
        super(individualNumber, barcode, pincode);
    }

    @Override
    public String getInfo(){
        return "UEC card: Barcode = " + getBarcode() +", Individual number = " + getIndividualNumber() +
                ", Pincode = " + getPincode() +". functions: ";
    }
}
