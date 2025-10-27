import java.util.*;

public class RoundThingsDriver {
  public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius?: ");
        double radius = input.nextDouble();
        input.close();
        double circleArea = RoundThing.calcAreaCircle(radius);
        double circleCircum = RoundThing.calcCircumCircle(radius);
        double sphereArea = RoundThing.calcAreaSphere(radius);
        double sphereVolume = RoundThing.calcVolumeSphere(radius);

        outPut(radius, circleArea, circleCircum, sphereArea, sphereVolume);
  }  
  public static void outPut(double r,double cA,double cC,double sA,double sV){
      System.out.println("The area of a circle with the radius of "+r+" is "+cA);

      System.out.println("The circumfrence of a circle with the radius of "+r+" is "+cC);

      System.out.println("The area of a sphere with the radius of "+r+" is "+sA);

      System.out.println("The volume of a sphere with the radius of "+r+" is "+sV);
  }
}


class RoundThing{
    
    public RoundThing(){

    }

    public static double calcAreaCircle(double radius){
        return Math.PI*Math.pow(radius, 2);
    }

    public static double calcCircumCircle(double radius){
        return 2*Math.PI*radius;
    }

    public  static double calcAreaSphere(double radius){
        return 4*Math.PI*Math.pow(radius, 2);
    }

    public static double calcVolumeSphere(double radius){
        return (4/3)*Math.PI*Math.pow(radius, 3);
    }
}