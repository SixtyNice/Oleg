import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int n = input.nextInt();
        if (n > 15) {
            System.out.println("Размер массива не должен быть больше 15");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Размер массива должен быть четным");
            return;
        }

        char[][] array = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = '.';
            }

        }

        int middle = Math.round(n / 2);

        int lastIndexOfArray = n - 1;
        for (int j = 0; j < n; j++) {
            array[middle][j] = '*';// заполняем среднню строку
            array[j][middle] = '*';// заполняем средний столбец
            array[j][j] = '*';//заполняем главную диагональ
            array[lastIndexOfArray - j][j] = '*';//заполняем побочеую диагональ
        }

//        Вывод массива в консоль
        for (char[] symArr : array) {
            for (char sym : symArr) {
                System.out.print(sym + " ");
            }
            System.out.println();
        }

    }
}
