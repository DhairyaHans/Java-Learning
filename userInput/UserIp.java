
import java.io.IOException;
import java.util.Scanner;

class UserIp {

    public static void main(String[] args) throws IOException {
        System.out.println("User Input");
        System.out.println("Enter a number: ");

        // Input Using BufferedReader
        // InputStreamReader reader = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(reader);
        // int num = Integer.parseInt(bf.readLine());
        // ##########################################
        // Input Using Scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("You entered: " + num);

        // bf.close();
    }
}
