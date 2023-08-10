package Stream.Api.One;

import java.util.Objects;

public class Student {
   private String lastname;
   private float averagemark;

    public Student(String lastname, float averagemark) {
        this.lastname = lastname;
        this.averagemark = averagemark;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public float getAveragemark() {
        return averagemark;
    }

    public void setAveragemark(float averagemark) {
        this.averagemark = averagemark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", averagemark=" + averagemark +
                '}';
    }

}
