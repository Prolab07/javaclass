package oop;

public class Staff {
    private String category;
    private String username;
    int age;

    public Staff (String category, String username) {
        this.category = category;
        this.username = username;
    }

    public Staff (String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
