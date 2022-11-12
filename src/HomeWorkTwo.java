import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstScroll = scanner.nextInt();
        int secondScroll = scanner.nextInt();

        if (firstScroll == 36 && secondScroll == 17){
            System.out.println("Jackpot");
        }
        else if (firstScroll == 36 || secondScroll == 17){
            System.out.println("50% Of Jackpot");
        }
        else System.out.println("lost");
    }
}
