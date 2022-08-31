import java.util.Scanner;
public class FourthQ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Write Three Numbers ");
        float num1=input.nextFloat();
        float num2=input.nextFloat();
        float num3=input.nextFloat();
        float avg=(num1+num2+num3)/3;
        System.out.println("The Average Of The Numbers Is "+avg);
    }
}
