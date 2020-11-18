package lab2;

import java.io.Serializable;

import static java.lang.Integer.parseInt;

public class Customer {
    private String surname, name, middleName, address;
    private Integer id, cardNumber;
    private Integer cardMoney;
    Customer(Integer id, String surname, String name, String middleName, String address, Integer cardNumber, Integer cardMoney) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardMoney = cardMoney;
        this.cardNumber = cardNumber;
    }

    public Serializable getValue(String data) {
        switch (data) {
            case "id": {
                return this.id;
            }
            case "surname": {
                return this.surname;
            }
            case "name": {
                return this.name;
            }
            case "middleName": {
                return this.middleName;
            }
            case "address": {
                return this.address;
            }
            case "cardNumber": {
                return this.cardNumber;
            }
            case "cardMoney": {
                return this.cardMoney;
            }
        }
        return data;
    }

    public void setValue(String type, String data) {
        switch (type) {
            case "id": {
                this.id = parseInt(data);
            }
            case "surname": {
                this.surname = data;
            }
            case "name": {
                this.name = data;
            }
            case "middleName": {
                this.middleName = data;
            }
            case "address": {
                this.address = data;
            }
            case "cardNumber": {
                this.cardNumber = parseInt(data);
            }
            case "cardMoney": {
                this.cardMoney = parseInt(data);
            }
        }
    }

    public String toString() {
        return "ID: " + this.id + ", Surname: " + this.surname + ", Name: " + this.name
                + ", Middle name: " + this.middleName + ", Address: " + this.address
                + ", Card number: " +this.cardNumber + ", Card money: " + this.cardMoney;
    }
}

