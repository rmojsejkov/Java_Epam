package com.company.Decorator;

import java.util.Date;

/**
 * Created class BankCard, which describe entity 'BankCard'.
 * @author Moiseikov R.A
 * @version 1.0
 */
public class BankCard extends FunctionType {
    private int cardNumber;
    private Date shelflife;
    private String type;

    public BankCard(UEC uec, int cardNumber, Date shelflife, String type) {
        super(uec);
        this.cardNumber = cardNumber;
        this.shelflife = shelflife;
        this.type = type;
    }

    @Override
    public String getInfo() {
        return uec.getInfo() + " BankCard: " + cardNumber + '\'' +
                "," + shelflife + '\'' + "," + type;
    }
}
