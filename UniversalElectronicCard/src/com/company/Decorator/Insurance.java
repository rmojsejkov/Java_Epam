package com.company.Decorator;

import java.util.Date;

//Страховой полис
public class Insurance extends FunctionType {
    public enum TypeInsurance{
        CUSTOM,
        STANDART,
        PREMIUM
    }
    private Date expirationDate;
    private TypeInsurance type;
    private int insNumber;

    public Insurance(UEC uec, Date expirationDate, TypeInsurance type, int insNumber){
        super(uec);
        this.expirationDate = expirationDate;
        this.insNumber = insNumber;
        this.type = type;
    }

    @Override
    public String getInfo() {
        return uec.getInfo() + " Insurance policy: " + type + '\'' +
                "," + expirationDate + '\'' + "," + insNumber;
    }

}
