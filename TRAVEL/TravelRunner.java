package TRAVEL;

public class TravelRunner {
    public static void main(String[]args){
        for(int i = 6; i<=40; i = i+2){
            Travel tata = new Travel(i);
            System.out.print("people = "+i+", ");
            int p = tata.goByVan();
            System.out.print("vans = "+p+", ");
            int t = tata.goByCanoe();
            System.out.print("canoes = "+t+", ");
            int m = tata.goByPlane();
            System.out.println("planes = "+m+", ");
        }


    }

}
