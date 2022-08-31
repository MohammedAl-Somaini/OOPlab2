import java.util.Scanner;
public class FifthQ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Write Two Numbers ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("After Swaping "+num1+"\n "+num2);
    }
}