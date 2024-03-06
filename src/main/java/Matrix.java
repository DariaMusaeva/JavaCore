//Создать класс "Матрица". Класс должен иметь следующие переменные:
//двумерный массив вещественных чисел;
//количество строк и столбцов в матрице.

//Класс должен иметь следующие методы:
//сложение с другой матрицей;
//умножение на число;
//вывод на печать;
//умножение матриц.
public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new double[rows][columns];//инициализация нового массива
    }

    public Matrix addMatrixtoMatrix(Matrix secondMatrix) {
        if (this.rows == secondMatrix.rows && this.columns == secondMatrix.columns) {// Проверка соответствия размеров матриц
            Matrix result = new Matrix(this.rows, this.columns); // Создание новой матрицы для хранения результата
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    result.array[i][j] = this.array[i][j] + secondMatrix.array[i][j]; // Сложение соответствующих элементов матриц
                }
            }
            return result;
        } else {
            System.out.println("Матрицы разных размеров");
            return null;
        }
    }

    public Matrix multiplyByNumber(int num) {
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.array[i][j] = this.array[i][j] * num; // умножение каждого элемента на число
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.println(this.array[i][j] + " ");
            }
        }
    }

    public Matrix matrixMultiply(Matrix secondMatrix) {
        if (this.columns == secondMatrix.rows) { //проверка возможности умножения матриц
            Matrix result = new Matrix(this.rows, secondMatrix.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < secondMatrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result.array[i][j] += this.array[i][k] * secondMatrix.array[k][j];
                    }
                }
            }
            return result;
        } else {
            System.out.println("Несовместимые для умножения матрицы");
            return null;
        }
    }

    // найти 2 самых больших значения в массиве
    public static int[] getTwoMaxValues(int[] nums) {
        int first = 0; // устанавливаем минимальное значение для первого и второго числа
        int second = 0;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) { //если num больше второго максимального, но меньше первого
                second = num;
            }
        }
        int[] result = {first, second};
        return result;
    }
}
