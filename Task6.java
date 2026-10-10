import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int range = sc.nextInt();


        for(int number = 2; number <= range; number++) {

            int divisor = 0;

            for(int check = 1; check <= number; check++) {

                if(number % check == 0) {
                    divisor++;
                }
            }

            if(divisor == 2) {
                System.out.print(number + " ");
            }
        }

        sc.close();
    }
}