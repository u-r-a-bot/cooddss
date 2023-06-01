import java.util.*;
import java.lang.*;
interface Volume{
    double getVolume();
}
interface SurfaceArea{
    double getSurfaceArea();
}
class cylinder implements Volume,SurfaceArea{
    double r,h;
    
    public cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getVolume(){
        return Math.PI*r*r*h;
    }
    public double getSurfaceArea(){
        return (2*Math.PI*r*(r+h));
    }
}
class volarea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h = sc.nextDouble();
        cylinder cyl = new cylinder(r, h);
        System.out.println("The volume of the cylinder is: "+cyl.getVolume());
        System.out.println("The Surface area of the cylinder is: "+cyl.getSurfaceArea());
    }
}