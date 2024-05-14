package BOX;

public class BoxRunner {
    public static void main(String[]args){
        Box tosh = new Box(2,6);
        double area = tosh.getArea();
        System.out.println("The area is "+ area+".");
        tosh.bigger(2);
        double peri = tosh.getPerimeter();
        System.out.println("The perimeter is "+peri+".");


    

        


    }
    
}
