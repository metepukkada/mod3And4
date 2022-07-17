import java.util.Scanner;

public class mod3And4 {
    public static void main(String[] args) {
        int i, time = 0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        i = input.nextInt();

        for (int a = 1; a <= i; a++) {
            if ((a % 3 == 0) && (a % 4 == 0)) {
                total += a;
                time++;
            }

        }
        if (time == 0) {
            System.out.println("0'a Bölünemez!");
        } else {
            System.out.println(total / time);
        }
    }
}