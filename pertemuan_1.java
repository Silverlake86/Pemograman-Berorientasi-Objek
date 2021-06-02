import java.util.*;
class setiawan_junior{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the side of your cube(m): ");
       float a = sc.nextFloat();
       float volume = a * a * a;
       System.out.println("The side of your cube is: " + a + "m.");
       System.out.println("The volume of your cube is: " + volume + "m^3.");
   }
}