public class Task4 {
    public static void main(String[] args) {

        int answer = 0;

        for(int n = 10; n <= 99; n++) {

            int firstDigit = n / 10;
            int secondDigit = n % 10;

            if(firstDigit * 2 == secondDigit) {

                int newNumber = secondDigit * 10 + firstDigit;

                if(newNumber - n == 36) {
                    answer = n;
                }
            }
        }

        System.out.println("Original number: " + answer);
    }
}