package circle;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 25, 2013 7:20:42 AM 
 */
public class Circle {

    // fields
    double radius = 2;
    double xCordinate = 3;
    double yCordinate  = 4;
    
    // methods
    void changeRadius(double newRadius)
    {
        radius = newRadius;
    }
    
    void shiftCircle(double X, double Y)
    {
        xCordinate = X;
        yCordinate = Y;
    }
    
    void showCircle()
    {
        System.out.println("Radius : " + radius);
        System.out.println("X Cordinate : " + xCordinate);
        System.out.println("Y Cordinate : " + yCordinate);
    }
    
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();   //creating an object of class Clrcle with name as circle1
        System.out.println("Object - circle1");
        circle1.changeRadius(5);
        circle1.shiftCircle(2, 10);
        circle1.showCircle();

        System.out.println("");
        System.out.println("Object - circle2");
        Circle circle2 = new Circle();
        circle2.changeRadius(50);
        circle2.shiftCircle(22, 110);
        circle2.showCircle();
    }
}
