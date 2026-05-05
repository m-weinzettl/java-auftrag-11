import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        int counter_1 = 0, counter_2 = 0, counter_3 = 0;

        //int test = rn.nextInt(4);
        // 1 = nicht gut / 2 = gut / 3 = sehr gut

        System.out.println("Für wie viele Menschen soll der Test simuliert werden? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] nicht_gut = new int[n];
        int[] gut = new int[n];
        int[] sehr_gut = new int[n];

        for (int i = 0; i < n; i++) {

            int sim_num = rn.nextInt(3) + 1;

            if (sim_num < 2) {
                nicht_gut[i] = sim_num;

                if (nicht_gut[i] == 1) {
                    counter_1++;
                }

            } else if (sim_num > 2) {
                sehr_gut[i] = sim_num;
                if (sehr_gut[i] == 3) {
                    counter_3++;
                }

            } else {
                gut[i] = sim_num;
                if (gut[i] == 2) {
                    counter_2++;
                }
            }
        }

        double proz_1 = (double) counter_1 / n * 100;
        double proz_2 = (double) counter_2 / n * 100;
        double proz_3 = (double) counter_3 / n * 100;


        System.out.printf("Nicht Gut: %d (%.2f%%)%n", counter_1, proz_1);
        System.out.printf("Gut:       %d (%.2f%%)%n", counter_2, proz_2);
        System.out.printf("Sehr Gut:  %d (%.2f%%)%n", counter_3, proz_3);
    }
}
