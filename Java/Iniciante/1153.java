import java.util.Scanner;

public class 1153 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= N; i++)     
            factorial *= i;

        System.out.println(factorial);

        input.close();
        
    }
}
