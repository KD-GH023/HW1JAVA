//Вывести все простые числа от 1 до 1000//

public class task_2 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
       
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
       
        return true;
    }

    public static void main(String[] args) {
        int limit = 1000;

        System.out.println("Простые числа от 1 до " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}