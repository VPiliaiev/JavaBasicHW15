package com.gmail.valeriipiliaiev;
public class Account {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;

    private String surname;
    private int weight;
    private int pressure;
    private int stepsByDay;
    private int age;

    Account(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone, String surname, int weight, int pressure, int stepsByDay) {

        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2023 - yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public int getDayOfBirth() {
        return this.dayOfBirth;
    }

    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getStepsByDay() {
        return this.stepsByDay;
    }

    public int getAge() {
        return this.age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsByDay(int stepsByDay) {
        this.stepsByDay = stepsByDay;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountInfo: " +
                "name=" + this.name +
                ", dayOfBirth=" + this.dayOfBirth +
                ", monthOfBirth=" + this.monthOfBirth +
                ", yearOfBirth=" + this.yearOfBirth +
                ", email=" + this.email +
                ", phone=" + this.phone +
                ", surname=" + this.surname +
                ", weight=" + this.weight +
                ", pressure=" + this.pressure +
                ", stepsByDay=" + this.stepsByDay +
                ", age=" + this.age;
    }

    public static void main(String[] args) {
        Account firstAccount = new Account("Pavel", 5, 3, 2000, "pavel2000@email.com", "+380934594239", "Kolos", 63, 90, 15000);
        firstAccount.printAccountInfo();

        Account secondAccount = new Account("Bogdan", 23, 7, 2001, "bogdan2001@email.com", "+380633213324", "Sagay", 59, 85, 10000);
        secondAccount.printAccountInfo();

        Account thirdAccount = new Account("Sergey", 31, 21, 1998, "sergey@example.com", "+380953947183", "Sagay", 59, 85, 12000);
        thirdAccount.printAccountInfo();

        Account fourthAccount = new Account("Artem", 23, 1, 1999, "artem344@email.com", "+380934513249", "Foresh", 98, 110, 20000);
        fourthAccount.printAccountInfo();


        firstAccount.setWeight(90);
        firstAccount.setPressure(140);
        firstAccount.setStepsByDay(22000);
        firstAccount.printAccountInfo();


        secondAccount.setWeight(80);
        secondAccount.setPressure(110);
        secondAccount.setStepsByDay(5000);
        secondAccount.printAccountInfo();
    }
}

