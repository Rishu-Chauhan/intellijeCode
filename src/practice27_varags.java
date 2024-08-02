public class practice27_varags {
    public static int sum(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varags tutorial");
        System.out.println("the sum of 4 and 5 is:" + sum(4,5));
        System.out.println("the sum of 4,3,and 5 is:"+ sum(4,3,5));
        System.out.println("the sum of 90,89,87,57 and 57 is :"+sum(90,89,87,57,57));

    }

    }
