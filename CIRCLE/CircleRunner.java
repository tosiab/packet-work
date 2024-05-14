package CIRCLE;
public class CircleRunner {
    public static void main(String[]args){
        Circle mama = new Circle(3);
        double circum = mama.getC();
        System.out.println("The circumference is "+circum+".");
        double area = mama.getArea();
        System.out.println("The area is "+area+".");
        mama.changeR(1);
        double area2 = mama.getArea();
        System.out.println("The area is "+area2+".");
    }

    
}
