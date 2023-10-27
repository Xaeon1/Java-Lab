import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            ## Задача 7 - допълнително точки
    Комбинирайте горните задачи в програма с меню.
    Използвайте допълните методи.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose exercise to preview: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                System.out.println("Choose exercise variant to preview: ");
                int type = scan.nextInt();
                switch (type) {
                    case 1:
                        findSumInArray();
                        break;
                    case 2:
                        findSumOfEvenElementsInArray();
                        break;
                    case 3:
                        findSumOfOddElementsInArray();
                        break;
                }
                break;
            case 2:
                reverseArray();
                break;
            case 3:
                minAndMaxValueOfArray(scan);
                break;
            case 4:
                ifNumberIsPrimeNumber(49);
                break;
            case 5:
                sumOfMatrixDiagonals();
                break;
            case 6:
                triangle(scan);
                break;
        }
    }

    /*
     Задача 1 - 1 точка
    Да се напишат методи, в който се инициализира масив с 5 елемента от тип int, за които
    трябва да се изпълнят следните условия.
            1. Намиране на сумата на елементите на масив.
                - [1, 2, 3, 4, 5]
                - Принт: 15
            2. Намиране на сумата на елементите на масив, които са четни.
                - [1, 2, 3, 4, 5]
                - Принт: 6
            3. Намиране на сумата на елементите на масив, които са нечетни.
                - [1, 2, 3, 4, 5]
                - Принт: 9
    Метода няма входни параметри и принтира резултатите.
    */

    public static void findSumInArray(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("SUM: " + sum);
    }

    public static void findSumOfEvenElementsInArray(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("SUM: " + sum);
    }

    public static void findSumOfOddElementsInArray(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println("SUM: " + sum);
    }

    /*
    Задача 2 - 1 точка
    Да се напише метод, в който се инициализира масив с 10 елемента от тип int, за които
    трябва да се изпълнят следните условия.
            1. Обръщане на масив обратно
                - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
                - Принт: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    След това обхождаме масива и принтираме резултатите.

     */

    public static void reverseArray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int temp = 0;
        for (int i = 0; i < (arr.length/2); i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }
    /*
    Задача 3 - 1 точка
    Да се напише метод, която намира и отпечатва максималните и минималните стойности в
    масив от цели числа.
    Инициализирайте масива от конзолата, като първо въведем броя на елементите, а после
    самите стойности.
    Накрая принтирайте резултатите.
     */

    public static void minAndMaxValueOfArray(Scanner scan){
        System.out.println("Enter size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Enter value at %d position: " , i);
            arr[i] = scan.nextInt();
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i >= maxValue){
                maxValue = i;
            }
            if (i <= minValue){
                minValue = i;
            }
        }
        System.out.println("Min: " + minValue);
        System.out.println("Max: " + maxValue);
    }
    /*
    ## Задача 4 - 1 точка
    Да се напише метод в които като аргументи подаваме 1 число и изпълняваме следните
    условия.
        1. Проверка дали едно число e просто
            - Вход: 7
            - Изход: true
     */

    public static void ifNumberIsPrimeNumber(int number){
        for (int i = 2; i < number; i++){
                if( number % i == 0) {
                    System.out.println("false");
                    break;
                }else {
                    System.out.println("true");
                }
        }
    }

    /*
    ## Задача 5 - 1 точка
    Да се напишат методи, в който се инициализира матрица с 3 реда и 3 колони тип int, за
    които трябва да се изпълнят следните условия.
        1. Сумиране на елементите по диагоналите на масива
        - [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
            ]
        - Принт: 30
    След това принтираме резултатите.
            2. Сумиране на елементите по диагоналите на масива, без повтарящият елемент
            (централният елемент се сумира само веднъж)
        - [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
        ]
        - Принт: 25
    След това принтираме резултатите.
 */

    public static void sumOfMatrixDiagonals(){
        int[][] arr = { { 8, 2, 13, 4 },
                        { 9, 16, 17, 8 },
                        { 1, 22, 3, 14 },
                        { 15, 6, 17, 8 } };

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int midElement = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    primaryDiagonal += arr[i][j];
                }
                if ((i + j) == (arr.length - 1)) {
                    secondaryDiagonal += arr[i][j];
                }
                if(i == j){
                    midElement = arr[i][j];
                }
            }
        }

        System.out.println("Primary diagonal sum: " + primaryDiagonal);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonal);
        System.out.println("Combined value: " + (primaryDiagonal + secondaryDiagonal));
        System.out.println("Combined without cloned mid element: " + ((primaryDiagonal+secondaryDiagonal) - midElement));

    }

    /*
    ## Задача 6 - допълнително точки
    Създайте програма, която приема цяло число n като вход и извежда правоъгълен
    триъгълник с височина n, използвайки звездички (*).
    Например, ако n е 3, изходът трябва да изглежда така:
            *
            **
            ***

     */
    public static void triangle(Scanner scan){
        System.out.println("Enter height of triangle: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}