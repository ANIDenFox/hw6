public class Main {
    public static void main(String[] args) {
        int[][] ar ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] ar1= {{1,-2,3},
                {4,-5,6},
                {7,8,9}};
        int[][] ar2= {{0,2,3},
                {4,0,6},
                {7,8,0}};
        int[][] arr ={{9,2,4},
                {3,5,8},
                {7,6,1}};
        sum(ar);
        average(ar);
        max(ar);
        System.out.println();
        min(ar);
        System.out.println();
        sum1(ar);
        System.out.println();
        diagonal(ar);
        swap(ar);
        sumWithNegative(ar1);
        pairedNum(ar);
        findNegative(ar1);
        replaceZero(ar2);
        diagonalSum(arr);
        sumLeft(arr);
        count(arr, 5);
    }
    public static void sum(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
        }
        System.out.println("Сума елементів: " + sum);
    }
    public static void average(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];

            }
        }
        int average = sum / (ar.length * ar[0].length);
        System.out.println("Середнє значення: " + average);
    }
    public static void max(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            int max =0;
            for (int j = 1; j < ar[i].length; j++) {
                if (ar[i][j] > max) {
                    max = ar[i][j];
                }
            }

            System.out.print("Найбільший елемент у рядку " + (i + 1) + ": " + max + "; ");
        }
    }

    public static void min(int[][] ar) {
        for (int j = 0; j < ar[0].length; j++) {
            int min = ar[0][j];

            for (int i = 1; i < ar.length; i++) {
                if (ar[i][j] < min) {
                    min = ar[i][j];
                }
            }

            System.out.print("Найменший елемент у стовпці " + (j + 1) + ": " + min + "; ");
        }
    }
    public static void sum1(int[][] ar){
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
            System.out.print("Сума елементів у рядку " + (i + 1) + ": " + sum + "; ");
        }
    }

    public static void diagonal(int[][] ar){
        boolean positive = true;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] <= 0) {
                positive = false;
                break;
            }
        }

        if (positive) {
            System.out.println("Всі елементи головної діагоналі масиву додатні");
        } else {
            System.out.println("Не всі елементи головної діагоналі масиву додатні");
        }
    }
    public static void swap (int[][] ar){
        int row1 = 0;
        int row2 = 1;

        int[] a = ar[row1];

        ar[row1] = ar[row2];
        ar[row2] = a;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumWithNegative(int [][] ar1){
        int rows = ar1.length;
        int columns = ar1[0].length;

        int[] rowSum = new int[rows];

        for (int i = 0; i < rows; i++) {
            boolean negative = false;
            for (int j = 0; j < columns; j++) {
                rowSum[i] += ar1[i][j];

                if (ar1[i][j] < 0) {
                    negative = true;
                }
            }
            if (negative) {
                System.out.println("Сума елементів рядка " + (i + 1) + " (з від'ємними числами): " + rowSum[i]);
            }
        }
    }
    public static void pairedNum(int[][] ar){
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if (ar[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Кількість парних чисел: " + count);
    }

    public static void findNegative(int[][] ar1){
        int count = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                if (ar1[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Кількість від'ємних чисел: " + count);
    }

    public static void replaceZero(int[][] ar2) {
        int count = 1;
        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[0].length; j++) {
                if (ar2[i][j] == 0) {
                    ar2[i][j] = count++;
                }
            }
        }

        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[0].length; j++) {
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void diagonalSum(int[][] arr) {

        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i==j)
                    right+=arr[i][j];

            }

        }

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1)
                    left+=arr[i][j];

            }

        }

        if (left == right) {
            System.out.println("Сума лівої та правої діагоналі є однаковою.");
        } else {
            System.out.println("Сума лівої та правої діагоналі не є однаковою.");
        }
    }

    public static void sumLeft(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1)
                    sum+=arr[i][j];

            }

        }
        System.out.println("Сума лівої діагоналі: "+sum);
    }

    public static void count(int[][] ar, int num) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] > num) {
                    count++;
                }
            }
        }
        System.out.println("Чисел, які більше за задане: "+ count);
    }

    public static void unique(int[][] arr){
        int notUnique =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    notUnique = 1;
                }
            }
        }
        if (notUnique==1){
            System.out.println("Значення не є унікальними");
        } else {
            System.out.println("Значення унікальні");
        }
    }
}