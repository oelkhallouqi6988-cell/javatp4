package point;
import java.util.Scanner;
public class TestPoint {
	
	

	
	    public static void main(String[] argv) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donner x1 : ");
	        double x1 = sc.nextDouble();

	        System.out.print("Donner y1 : ");
	        double y1 = sc.nextDouble();

	        System.out.print("Donner x2 : ");
	        double x2 = sc.nextDouble();

	        System.out.print("Donner y2 : ");
	        double y2 = sc.nextDouble();

	        Point p1 = new Point(x1, y1);
	        Point p2 = new Point(x2, y2);

	        System.out.print("Donner a : ");
	        double a = sc.nextDouble();

	        System.out.print("Donner b : ");
	        double b = sc.nextDouble();

	        Point p3 = p1.translation(a, b);

	        double d = Point.distance(p1, p2);

	        System.out.println("p1 = " + p1);
	        System.out.println("p2 = " + p2);
	        System.out.println("p3 = " + p3);
	        System.out.println("Distance = " + d);

	        sc.close();
	    }
	

}
