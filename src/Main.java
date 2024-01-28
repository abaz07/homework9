public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000 + 1) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        //Задача 1
        System.out.println("Задача 1");
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задача 2
        System.out.println("Задача 2");
        int minSpendPerMonth = arr[0];
        int maxSpendPerMonth = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minSpendPerMonth){
                minSpendPerMonth = arr[i];
            }
            if(arr[i] > maxSpendPerMonth){
                maxSpendPerMonth = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendPerMonth + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpendPerMonth + " рублей");
        //Задача 3
        System.out.println("Задача 3");
        float AverageAmountSpentPerMonth = 0;
        AverageAmountSpentPerMonth = (float) sum /arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + AverageAmountSpentPerMonth + " рублей");
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length - 1; i>=0; i--){
            System.out.print(reverseFullName[i] + " ");
        }
    }
}