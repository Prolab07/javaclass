package oop;

public class Student {
    private String name;
    private String surname;
    private String numberTicket;

    public Student() {
        this.name = name;
        this.surname = surname;
        this.numberTicket = numberTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("please not empty name this");
        }else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(String numberTicket) {
        if (isNumeric(numberTicket)) {
            this.numberTicket = numberTicket;
        }else {
            System.out.println("pleas enter number");
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}

