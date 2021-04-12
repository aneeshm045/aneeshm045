import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the range:");
            int input = scanner.nextInt();
            if (input == 0 || input == 1) {
                System.out.println("Enter a number greater than 1" + "\n" + "NOTE: 0 and 1 are not a prime number");
                continue;
            }
            else{
                int x = input * 2;
                int[] prime = new int[x];
                for (int i = 0; i <= input; i++) {
                    if (i == 2 || i == 3)
                        prime[i - 2] = i;
                    else if (i == 0 || i == 1)
                        continue;
                    else {
                        int c = 0, f = 0;
                        for (int j = 2; j <= i / 2; j++) {
                            if (i % j == 0) {
                                c += 1;
                            } else if (i % j != 0)
                                f += 1;
                        }

                        if (c < 1)
                            prime[i + 2] = i;
                    }
                }
                for (int i = 0; i < input; i++) {
                    if (prime[i] != 0)
                        System.out.print(prime[i] + " ");
                }
            }
            break;
        }
        }
    }
