package Reflection;

import java.util.Objects;

public class Car extends PerentCar implements CarInterfase {
    private String model;
    private String serial;
    @DzAnnotation(validate = false)
    private int yearexit;


    public Car(String model, String serial, int yearexit) {
        this.model = model;
        this.serial = serial;
        this.yearexit = yearexit;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getYearexit() {
        return yearexit;
    }

    public void setYearexit(int yearexit) {
        this.yearexit = yearexit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearexit != car.yearexit) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(serial, car.serial);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + yearexit;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", yearexit=" + yearexit +
                '}';
    }
}
