import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int limit = sc.nextInt();

        int total = 0;

        System.out.println("Even numbers:");

        for(int num = 2; num <= limit; num += 2) {
            System.out.print(num + " ");
            total++;
        }

        System.out.println();
        System.out.println("Count: " + total);

        sc.close();
    }
}