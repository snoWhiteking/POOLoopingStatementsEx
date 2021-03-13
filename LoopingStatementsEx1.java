import java.util.Scanner;

public class LoopingStatementsEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean acceptNum = false;
        int num = 0;
        while (!acceptNum) {
            System.out.print("Type a number from 2 to 1000: ");
            num = scanner.nextInt();

            if (num >= 2 && num <= 1000)
                acceptNum = true;
        }

        System.out.println(" ");

        for (int i = 1; i <= 10; i++)
            System.out.println(String.format("%s x %s = %s", num, i, num * i));
        
        scanner.close();
    }
}
