package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ExceptionHome {
        //System.out.println(HomeExceptionWithMyCustomClassTwo(20));//тут просто виконується задача множення, яка в циклі
        //System.out.println(HomeExceptionWithMyCustomClassTwo(-100));//а тут викидується помилка, бо умова помилки спрацьовує, число менше 0
        TaskTwq();
    }
    private static void HomeExceptionWithMyCustomClass() throws ExceptionHome {
        throw new ExceptionHome("введено число менше 0");
    }

    private static int HomeExceptionWithMyCustomClassTwo(int i) throws ExceptionHome {
        try {
            if (i >= 0) {
                return i * i;
            }
            throw new ExceptionHome("введено число менше 0");
        } catch (ExceptionHome e) {
            throw new RuntimeException();
        }
    }//створена помилка з моїм класом, вивожу мій метод і його знечення з мінусовими цифрами

    private static void TaskTwq() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("веддіть число");
            int i = scanner.nextInt();
            System.out.println(i);
        //} catch (ArithmeticException e) {
           // System.out.println("you введите not число"); // этот кусок кода у меня не работает..
        } catch (InputMismatchException e) {
            System.out.println("введите число еще раз");
            TaskTwq();
        }
    }


    // } finally {
    //            scanner.close(); // чтобы закрыть сканер, но у меня не работает
}



