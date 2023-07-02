package oop;

public class Teacher {
    private String surname;
    private String post;
    private String degre;
    private int numberRoom;

    public Teacher(String surname, String post, String degre, int numberRoom) {
        this.surname = surname;
        this.post = post;
        this.degre = degre;
        this.numberRoom = numberRoom;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDegre() {
        return degre;
    }

    public void setDegre(String degre) {
        this.degre = degre;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
}
