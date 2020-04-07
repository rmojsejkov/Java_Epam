package com.company.Decorator;

import java.util.Date;

/**
 * Created class BankCard, which describe entity 'Passport'.
 * @author Moiseikov R.A
 * @version 1.0
 */
public class Passport extends FunctionType {
    private String name;
    private String surname;
    private String fatherName;
    private Date birthDate;
    private String birthPlace;
    private String id;
    private  String countyCode;

    public Passport(UEC uec,
                    String name, String surname,
                    String fatherName, Date birthDate,
                    String birthPlace, String id,
                    String countyCode) {
        super(uec);
        this.countyCode = countyCode;
        this.id = id;
        this.birthDate = birthDate;
        this.fatherName = fatherName;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
    }

    @Override
    public String getInfo() {
        return uec.getInfo() + " Passport: " + name + '\'' +
                "," + surname + '\'' + "," + fatherName + '\'' +
                "," + birthPlace + '\'' + "," + birthDate + '\'' +
                "," + id + '\'' + "," + countyCode;
    }
}
