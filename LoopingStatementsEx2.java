import java.util.Scanner;

public class LoopingStatementsEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantity;

        System.out.print("Quantity of Tests: ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            double[] numbers = new double[3];
            int c = 0;
            double weightedAverage = 0;

            System.out.println("For the " + (i + 1) + "º Test.");

            do {
                System.out.print("Type the " + (c + 1) + "º number: ");
                numbers[c] = scanner.nextDouble();
                c++;

            } while (c < 3);

            weightedAverage = (numbers[0] * 2 + numbers[1] * 3 + numbers[2] * 5) / 10;
            System.out.println(String.format("\nWeighted Average: %.1f\n", (weightedAverage)));
        }

        scanner.close();
    }
}
