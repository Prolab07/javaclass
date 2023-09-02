package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<Car> carClass = Car.class;

        System.out.println(carClass.getName());
        System.out.println(Modifier.toString(carClass.getModifiers()));
        System.out.println(carClass.getSuperclass());
        System.out.println(Arrays.toString(carClass.getInterfaces()));

        Field[] fields = carClass.getDeclaredFields();
        Arrays.stream(fields).forEach(
                field -> {
                    System.out.println(field.getName());
                    System.out.println(field.accessFlags());
                    System.out.println(field.getType());
                    System.out.println(Modifier.toString(field.getModifiers()));
                }
        );

        Method[] methods = carClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

    }
}
