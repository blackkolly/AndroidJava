public static double rectangleArea(double length, double width)
public static double rectanglePerimeter(double length, double width)
public static double circleArea(double radius)
public static double circleCircumference(double radius)
public static double rightTriangleArea(double base, double height)package mooc.vandy.java4android.shapes.logic;

import mooc.vandy.java4android.shapes.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 *
 */
public class Logic 
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = 
        Logic.class.getName();

    /*
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough)
     */
    private OutputInterface mOut;

    /**
     * These are the numeric values that you will receive from the
     * User Interface and use in your calculations.
     */
    private static double mRadius = 0;
    private static double mLength = 0;
    private static double mWidth = 0;
    private static double mHeight = 0;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance
     * (which implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    @Override
    public void process() {
        // Get which calculation should be computed.  Do not worry
        // about the specifics of this right now.
        Shapes shapeForCalculations = mOut.getShape();

        // Store the values returned by the User Interface.
        mLength = mOut.getLength();
        mWidth = mOut.getWidth();
        mHeight = mOut.getHeight();
        mRadius = mOut.getRadius();

        // Determine which calculation to process right now.  Again,
        // do not worry about the specifics of how this works for now.
        switch (shapeForCalculations) {
            case Box:
                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a volume of: ");
                mOut.println("" 
                             + String.format("%.2f",
                                             boxVolume(mLength, mWidth, mHeight)));
                mOut.println("");

                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " by " 
                           + mHeight 
                           + " box has a surface area of: ");
                mOut.println("" 
                             + String.format("%.2f",
                                             boxSurfaceArea(mLength, mWidth, mHeight)));
                mOut.println("");
                // If you are paying attention, you will notice that
                // there is no 'break;' here like there is in other
                // places, meaning that if 'Box' was selected, it will
                // run the two sets of print statements above and the
                // two statements below until the 'break;' statement.
            case Rectangle:
                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " rectangle has a perimeter of: ");
                mOut.println("" + String.format("%.2f", 
                                                rectanglePerimeter(mLength, mWidth)));
                mOut.println("");

                mOut.print("A " 
                           + mLength 
                           + " by " 
                           + mWidth 
                           + " rectangle has area of: ");
                mOut.println("" + String.format("%.2f", rectangleArea(mLength, mWidth)));
                mOut.println("");
                break;
            case Sphere:
                mOut.print("A sphere with radius " + mRadius + " has a volume of: ");
                mOut.println("" + String.format("%.2f", sphereVolume(mRadius)));
                mOut.println("");

                mOut.print("A sphere with radius " + mRadius + " has surface area of: ");
                mOut.println("" + String.format("%.2f", sphereSurfaceArea(mRadius)));
                mOut.println("");
                // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
                // two sets of print statements above and the two below until the 'break;'
            case Circle:
                mOut.print("A circle with radius " + mRadius + " has a perimeter of: ");
                mOut.println("" + String.format("%.2f", circleCircumference(mRadius)));
                mOut.println("");

                mOut.print("A circle with radius " + mRadius + " has area of: ");
                mOut.println("" + String.format("%.2f", circleArea(mRadius)) );
                mOut.println("");
                break;
            case Triangle:
                mOut.print("A right triangle with base " 
                           + mLength 
                           + " and height " 
                           + mWidth + " has a perimeter of: ");
                mOut.println("" 
                             + String.format("%.2f", rightTrianglePerimeter(mLength,
                                                                       mWidth)));
                mOut.println("");

                mOut.print("A right triangle with base " 
                           + mLength 
                           + " and height " 
                           + mWidth 
                           + " has area of: ");
                mOut.println("" 
                             + String.format("%.2f", rightTriangleArea(mLength,
                        mWidth)));
                mOut.println("");
                break;
            default:
                break;
        }
    }

    // TODO -- add your code here
    public class Logic{
    	private static Scanner sc;
    	public static void main (String [] args) {
    		int lenght, width,area,perimeter;
    		scanner in = new Scanner (System.in);
    		system.out.println(" Please Enter the Lenght of Rectangle:");
    		length = in.nextInt();
    		system.out.println(" Please Enter the Width of Rectangle:");
    		width  = in.nextInt();
    		//Area of rectangle = length x width
    	    area = lenght * width ;
    	    //perimeter of rectangle = 2 x (length + width)
    	    perimeter = 2 *(lenght + width);
    		system.out.println("Area of Rectangle  is :" +  area)
    		system.out.println("Perimeter of Rectangle  is :" +  perimeter)
    	}
    public static double rectangleArea(double length, double width) {
    	int area;
    	area = length * width;
    	return area;
    }    
    public static double rectanglePerimeter(double length, double width) {
    	double perimeter;
    	perimeter = 2 *(lenght + width);
    	return perimeter;
    }
    }   
    import java.util.Scanner;
    private static Scanner sc;
    public static void main (String [] args) {
		double width,Area,height,perimeter ;
		sc = new Scanner(system in);
		
		system.out.println("\n Please Enter the width of a rectangle :");
		width = sc.nextDouble();
		system.out.println("\n Please Enter the height of a rectangle :");
		height = sc.nextDouble();
		areaOfARectangle = new areaOfARectang();
		perimetr = vs.perimeterOfRectangle(height,width);
		surfaceArea = vs.SurfaceAreaOfRectangle(height,width);
		
		system.out.format("\n The  area of a rctangle = %.2f",area);
		system.out.format("\n The perimeter of a box = %.2f",perimeter);
	} 
    public static double rectangleArea(double length, double width){
    	area = width * height;
    	return area;		
    }
    public static double rectanglePerimeter(double length, double width) {
    	perimeter = 2* (width + height);
    	return perimeter;
    }
    
    public static void main (String [] args) {
		int radius = 3;
		double area = Math.PI * (radius * radius);
		system.out.println("Area of Circle  is :" +  area);
		double circumference = Math.PI * 2 * radius;
		system.out.println("The Circumference  is :" +  Circumference);
	}
    public static double circleArea(double radius) {
    	double radius;
    	double area = Math.PI * (radius * radius);
    	return area;
    }
    public static double circleCircumference(double radius) {
    	double radius;
    	double circumference = Math.PI * 2 * radius;
    	return circumference;
    	
    }
   
    
    public static void main (String [] args) {
		double base, height,area,perimeter,hypotenus;
		scanner s = new Scanner (System.in);
		system.out.println(" Please Enter the base of rightTriangle:");
		double base = s.nextDouble();
		system.out.println(" Please Enter the height of rightTriangle:");
		double height = s.nextDouble();
		double area = rightTriangleArea(base,height);
		system.out.println("Area of rightTriangle  is :" +  area);
		double perimeter = rightTrianglePerimeter(base,height);
		system.out.println("Perimeter of rightTriangle  is :" +  perimeter);
		double hypotenus = (base,height);
    }	
    public static double rightTriangleArea(double base, double height){
    	return((base * height)/2);
    }
    public static double rightTrianglePerimeter(double base, double height) {
    	double hypotenus = Math.pow(Math.pow(base, 2) + Math.pow(height,  2),0.5);
    	double perimeter = base + height + hypotenous;
    }
    
    private static Scanner sc;
	public static void main (String [] args) {
		double lenght,SA,Volume ;
		sc = new Scanner(system in);
		system.out.println("\n Please Enter the lenght of any side of the box:");
		lenght = sc.nextDouble();
		width = sc.nextDouble();
		height = sc.nextDouble();
		
		VolumeOfaCube = new VolumeOfaCube();
		SA = vs.SurfaceAreaOfBox(lenght,width,depth);
		Volume = vs.VolumeOfaBox(lenght,width,depth);
		
		system.out.format("\n The Surface area of a box = %.2f",SA);
		system.out.format("\n The Volume of a box = %.2f",Volume);
	}
    public static double boxVolume(double length, double width, double depth){
    	Volume = lenght * width * height;
    	return Volume;
    }
    public static double boxSurfaceArea(double length, double width) 
    double depth) {
    	SA = 2 * ((lenght*width) + (lenght*height) + (width*height));
    	return SA;
    }
    
    private static Scanner sc;
	public static void main (String [] args) {
		double radius,surfaceArea,volume ;
		sc = new Scanner(system in);
		system.out.println("\n Please Enter the radius of a sphere :");
		radius = sc.nextDouble();
	
		
		volumeOfASphere = new volumeOfASphere();
		volume = vs.volumeOfSphere(radius);
		surfaceArea = vs.SurfaceAreaOfSphere(radius);
		
		system.out.format("\n The Surface area of a box = %.2f",SA);
		system.out.format("\n The Volume of a box = %.2f",volume);
	}
	
    public static double sphereVolume(double radius){
    	volume = (4.0/3) * Math.PI* radius * radius *radius;
    	return volume;
    }
    public static double sphereSurfaceArea(double radius){
    	surfaceArea  = 4 * Math.PI* radius * radius;
    	return surfaceArea;
    }
    
    
}
