import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int result = 1;
        int count = 1;

        while(count <= number) {
            result = result * count;
            count++;
        }

        System.out.println("Factorial: " + result);

        sc.close();
    }
}