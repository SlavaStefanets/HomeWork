import java.util.Scanner;

public class HW3Numbers {
    public static void main(String[] args) {

        int Num = getNumber(); //three numbers
        vision(Num);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        return numbers;

    }

    public static void vision(int Num) {
        int first = Num / 100;
        System.out.println(first);
        int second = Num / 10 % 10;
        System.out.println(second);
        int three = Num % 10;
        System.out.println(three);

    }
}
        //(numbers / 100);
        //(numbers / 10 % 10);
        //(numbers % 10);