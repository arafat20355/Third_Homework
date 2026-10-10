import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Height: ");
        int h = sc.nextInt();

        System.out.print("Width: ");
        int w = sc.nextInt();


        for(int row = 0; row < h; row++) {

            for(int col = 0; col < w; col++) {

                if(row == 0 || row == h-1 || col == 0 || col == w-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}