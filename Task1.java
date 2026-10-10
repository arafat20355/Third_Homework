import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int value = sc.nextInt();

        int i = 1;

        while(i <= 10) {
            System.out.println(value + " x " + i + " = " + (value * i));
            i++;
        }

        sc.close();
    }
}