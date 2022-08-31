import java.util.Scanner;
public class ThirdQ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Write The Width of The Rectangle ");
        double width=input.nextDouble();
        System.out.print("Write The Height of The Rectangle ");
        double height= input.nextDouble();
        double perimeter=2*(width*height);
        double area=width*height;
        System.out.println("The Area Of The Rectangle Is "+area);
        System.out.println("The Perimeter Of The Rectangle IS "+perimeter);
    }
}
