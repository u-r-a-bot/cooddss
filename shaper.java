import java.util.Scanner;
import java.lang.Math.*;
abstract class shape{
    abstract float rectangleArea(float l,float b);
    abstract float squareArea(float side);
    abstract double circleArea(double r);
}
class rect extends shape{
    float rectangleArea(float l,float b){
        return l*b;
    }
    float squareArea(float side){return 0;}
    double circleArea(double r){return 0;}
}
class square extends shape{
    float squareArea(float side){
        return side*side;
    }
    double circleArea(double r){return 0;}
    float rectangleArea(float l,float b){
        return 0;}
}
class circle extends shape{
    double circleArea(double r){ 
        //System.out.println("radius is: "+r);
        return Math.PI*r*r;
    }
    float rectangleArea(float l,float b){
        return 0;
    }
    float squareArea(float side){return 0;}
}

class shaper{
    public static void main(String[] args) {
        square sq[] = new square[5];
        rect rect[] = new rect[4];
        circle circ[] = new circle[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<sq.length;i++){
            sq[i] = new square();
            System.out.println("Enter length of side of square "+(i+1));
            float side = sc.nextFloat();
            System.out.println("Area of the square is: "+ sq[i].squareArea(side));
        }
        for(int i=0 ;i<rect.length;i++){
            rect[i] = new rect();
            System.out.println("Enter length of rectangle "+(i+1));
            float length = sc.nextFloat();
            System.out.println("Enter Breadth of rectangle "+(i+1));
            float breadth = sc.nextFloat();
            System.out.println("Area of the rectangle is: "+rect[i].rectangleArea(length,breadth));;
        }
        for(int i=0 ;i<circ.length;i++){
            circ[i] = new circle();
            System.out.println("Enter radius of the circle of "+(i+1));
            double radius = sc.nextDouble();
            //System.out.println("Radius is: "+radius);
            System.out.println("Area of the circle is: "+circ[i].circleArea(radius));
        }
    }
}