import java.util.Scanner;

public class Road_off_number {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int Hundred = Number / 100;
        int Ten = (Number % 100) / 10;
        int One =  Number % 10;


        System.out.println( Hundred );
        System.out.println( Ten );
        System.out.println( One );

    }
}