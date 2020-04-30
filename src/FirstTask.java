import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// это ввод с клавы у вас это как-то cin<<
        System.out.println("Введите кол-во строк массива");// это печать в консоль у вас это как-то cout>>

        int n = input.nextInt();// точнее щздесь ввод с клавы, а до этого инициализация
        if (n > 100) {
            System.out.println("Кол-во строк массива не должно превышать 100");
            return;
        }
        System.out.println("Введите кол-во столбцов массива");
        int m = input.nextInt();
        if (m > 100) {
            System.out.println("Кол-во столбцов массива не должно превышать 100");
            return;
        }

        int[][] array = new int[n][m];

//        Здесь я хз как тебе нужно его заполнить, ну здесь крч я заполняю массив случайными числами в
//        в диапозоне от 0 до 9 включительно
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
        //Это вывод массива в консоль для наглядности
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

        int maxElement = array[0][0];
        int numberOfField = 0;
        int numberOfColumn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    numberOfField = i;
                    numberOfColumn = j;

                } else if (array[i][j] == maxElement) {
                    if (numberOfField > i) {
                        numberOfField = i;
                    } else if (numberOfField == i) {
                        if (numberOfColumn > j) {
                            numberOfColumn = j;
                        }
                    }
                }

            }
        }

        System.out.println("Номер строки: " + numberOfField +
                " \n" +
                "Номер столбца: " + numberOfColumn);

    }
}
