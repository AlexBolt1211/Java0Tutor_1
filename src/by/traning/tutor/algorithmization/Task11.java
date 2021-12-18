package by.traning.tutor.algorithmization;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }

        for (int i = 1; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                System.out.println("Column №" + i + ": ");
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i] + ", ");
                }
                System.out.println();
            }
        }
    }
}
