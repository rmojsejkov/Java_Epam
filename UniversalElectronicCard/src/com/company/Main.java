package com.company;

import com.company.Decorator.*;

import java.text.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        List<UEC> uecs = new ArrayList<>();
        boolean menu = true;
        while (true) {
            System.out.println("1. Добавить универсальную электронную карту");
            System.out.println("2. Просмотреть все карты");
            System.out.println("3. Выход");
            System.out.println("Введите номер меню");

            boolean flag = true;
            int index = in.nextInt();
            switch (index) {
                case 1:
                    System.out.println("Введите индивидуальный номер карты: ");
                    int inNumber = in.nextInt();
                    System.out.println("Введите штрихкод: ");
                    int barCode = in.nextInt();
                    System.out.println("Введите пинкод: ");
                    int pinCode = in.nextInt();
                    UEC card = new Card(inNumber, barCode, pinCode);
                    while (flag) {
                        boolean firstCase = true;
                        boolean secondCase = true;
                        boolean thirdCase = true;
                        System.out.println("Выберите функцию для добавления к карте: ");
                        System.out.println("1. Привязка банковской карты ");
                        System.out.println("2. Паспорт");
                        System.out.println("3. Страховой полис");
                        System.out.println("4. Вернуться");
                        int func = in.nextInt();
                        switch (func) {
                            case 1:
                                if (firstCase) {
                                    System.out.println("Введите номер банковской карты: ");
                                    int bankNumber = in.nextInt();
                                    System.out.println("Введите срок действия карты(yyyy-MM-dd): ");
                                    String bankShelf = in.next();
                                    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                                    Date dateShelf = ft.parse(bankShelf);
                                    System.out.println("Введите тип карты: ");
                                    String type = in.next();
                                    card = new BankCard(card, bankNumber, dateShelf, type);
                                    firstCase = false;
                                } else {
                                    System.out.println("Банковкая карта уже добавлена!");
                                }
                                break;
                            case 2:
                                if (!secondCase) {
                                    System.out.println("Паспорт уже привязан!");
                                } else {
                                    System.out.println("Введите имя: ");
                                    String name = in.next();
                                    System.out.println("Введите фамилию: ");
                                    String surname = in.next();
                                    System.out.println("Введите отчество: ");
                                    String fatherName = in.next();
                                    System.out.println("Введите дату рождения(yyyy-MM-dd): ");
                                    String date = in.next();
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                    Date birthDate = dateFormat.parse(date);
                                    System.out.println("Введите место жительства: ");
                                    String birthPlace = in.next();
                                    System.out.println("Введите идентификационный номер: ");
                                    String idenNumber = in.next();
                                    System.out.println("Введите код страны: ");
                                    String countryCode = in.next();
                                    card = new Passport(card, name, surname, fatherName,
                                            birthDate, birthPlace, idenNumber, countryCode);
                                    secondCase = false;
                                }
                                break;
                            case 3:
                                if (!thirdCase) {
                                    System.out.println("Страховой полис уже добавлен!");
                                } else {
                                    System.out.println("Введите дату окончания полиса(yyyy-MM-dd): ");
                                    String policyEnd = in.next();
                                    SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
                                    Date policyDate = sp.parse(policyEnd);
                                    System.out.println("Выберите тип страхового полиса(CUSTOM" +
                                            ", STANDART, PREMIUM): ");
                                    String typePolicy = in.next();
                                    System.out.println("Введите номер страхового полиса: ");
                                    int policyNumber = in.nextInt();

                                    card = new Insurance(card, policyDate,
                                            Insurance.TypeInsurance.valueOf(typePolicy), policyNumber);
                                    thirdCase = false;
                                }
                                break;
                            case 4:
                                flag = false;
                                firstCase = false;
                                secondCase = false;
                                thirdCase = false;
                                System.out.println(card.getInfo());
                                uecs.add((UEC)card);
                        }
                    }
                    break;
                case 2:
                    for (UEC uec : uecs) {
                        System.out.println(uec.getInfo());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Введён неверный пункт меню!");
                    break;

            }
        }
    }
}
