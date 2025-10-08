import java.util.*; // import scanner

public class RoundThingsDriver {
  public static void main(String[]args) { //Main runable method 
        Scanner input = new Scanner(System.in); //Create scanner object
        System.out.println("Radius?: ");// Ask for radius
        double radius = input.nextDouble();// get radius
        double circleArea = RoundThing.calcAreaCircle(radius);// calc Area
        double circleCircum = RoundThing.calcCircumCircle(radius); // calc Circumference
        double sphereArea = RoundThing.calcAreaSphere(radius); //cal sphere Area
        double sphereVolume = RoundThing.calcVolumeSphere(radius); //calc spher Volume

        outPut(radius, circleArea, circleCircum, sphereArea, sphereVolume);
  }  
  public static void outPut(double r,double cA,double cC,double sA,double sV){ // takes all these args
      System.out.println("The area of a circle with the radius of "+r+" is "+cA); // Prints with values

      System.out.println("The circumfrence of a circle with the radius of "+r+" is "+cC);

      System.out.println("The area of a sphere with the radius of "+r+" is "+sA);

      System.out.println("The volume of a sphere with the radius of "+r+" is "+sV);
  }
}


class RoundThing{ //Round things class
    
   
  //Methods acording to google 
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
