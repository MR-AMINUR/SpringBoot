import java.util.Scanner;

public class JavaBasics {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Drop your name here: ");
        String str = sc.nextLine();

        System.out.println("Hi, "+ str);

        sc.close();
    }
}
