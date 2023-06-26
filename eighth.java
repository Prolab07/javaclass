import java.util.Random;
import java.util.Arrays;
public class eighth {
    private final static int range = 10;
    private final static Random random = new Random();

    // створення і заповнення масиву

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = random.nextInt(range);
        }
        System.out.println(Arrays.toString(array));
    }
}


    // сумма всех элементов масива
/*
    public static void main(String[] args) {
        int sum = 0;
        int[] array1 = new int[4];
        for (int i = 0; i < 4; i++) {
            array1[i] = random.nextInt(range);
            sum = sum + array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(sum);
    }
}

    /*
    public static void main(String[] args) {
        int sum = 0;
        int [] array = {1,2,3,4};
        for (int i = 0; i < 4; i ++);{
            sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
*/

    //пошук середнього значення
    /*
    public static void main(String[] args) {
        int sum = 0;
        int[] array2 = {1, 8, 6, 5};
        for (int i = 0; i < 4; i++) {
            sum = sum + array2[i];
        }
        sum = sum / 4;
        System.out.println(Arrays.toString(array2));
        System.out.println(sum);
    }
}
*/
// поиск минимального и максимального значения элемента массива

    /*
    public static void main(String[] args) {
        int[] array3 = new int[5];
        for (int i = 0; i < 5; i++) {
            array3[i] = random.nextInt(range);
        }
        int min = array3[0];
        int max = array3[0];
        for (int i = 0; i < 5; i++) {

            if (array3[i] < min) {
                min = array3[i];
            }
            if (array3[i] > max) {
                max = array3[i];
            }
        }

        System.out.println(Arrays.toString(array3));
        System.out.println(min);
        System.out.println(max);
    }
}
*/

