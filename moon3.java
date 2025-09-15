public class moon3 {
    public static void main(String[] args) {
        double r = 1731 * 1000; 
        double pi = 3.14;
        double area = 4 * pi * r * r;
         double volume = area * 0.001; 
        double mass1 = volume * 3000; 
        double massTons = mass1/ 1000;
        double waterTons = mass1 * 0.25;
          double waterLiters = waterTons * 1000; 

        System.out.println(volume);
        System.out.println( massTons);
        System.out.println( waterLiters);
    }
}