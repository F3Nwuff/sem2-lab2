import java.util.Scanner;

abstract class shape {
    String color;
    abstract int getarea();
    public void Color(String color) {
        this.color = color;
    }
}
class Rectangle extends shape{
    int width;
    int height;
    int area;
    public void inputwidth(){
        int m;
        Scanner w = new Scanner(System.in);
        System.out.println("enter width :");
        m = w.nextInt();
        width = m;
    }
    public void inputheight(){
        int n;
        Scanner h = new Scanner(System.in);
        System.out.println("enter height :");
        n = h.nextInt();
        height = n;
    }
    public void inputcolor(){
        String b;
        Scanner c = new Scanner(System.in);
        System.out.println("enter color :");
        b = c.nextLine();
        color = b;
    }
    public Rectangle(int width, int height, String color) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    public int getarea(){
        area = width * height;
        return area;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle (50, 50 , "red");
        rect.inputwidth();
        rect.inputheight();
        rect.inputcolor();
        System.out.println("the area is " + rect.getarea());
        System.out.println("the color is " + rect.color);
    }
}