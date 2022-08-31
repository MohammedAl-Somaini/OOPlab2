import java.util.Scanner;
public class SecondQ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Write The Radius of The Circle ");
        double radius= input.nextDouble();
        double perimeter=2*Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println("The Area Of The Circle Is "+area);
        System.out.println("The Perimeter Of The Circle IS "+perimeter);
    }
}
