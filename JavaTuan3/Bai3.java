public class Bai3 {
    public static void main(String[] args) {
        usingForLoop();
        usingWhileLoop();
        usingDoWhileLoop();
    }

    public static void usingForLoop() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến 10000 là " + sum);
    }

    public static void usingWhileLoop() {
        int sum = 0;
        int i = 1;
        while (i <= 10000) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
            i++;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến 10000 là " + sum);

    }

    public static void usingDoWhileLoop() {
        int sum = 0;
        int i = 1;
        do {
            if (isPrimeNumber(i)) {
                sum += i;
            }
            i++;
        } while (i < 10000);
        System.out.println("Tổng các số tự nhiên từ 1 đến 10000 là " + sum);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
