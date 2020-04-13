import java.util.Scanner;
 
   public class TriangleDemo{
   
      //create a Scanner object
      static Scanner scan = new Scanner(System.in);
      
      public static void main(String [] args){
      
         //create a triangle object 
         Triangle trg = new Triangle();
         
         //prompt user to input value for height and base
         System.out.print("Enter the value of height\t:");
         double height=scan.nextInt();
         System.out.print("Enter the value of base\t:");
         double base= scan.nextInt();
         
         //set the height and base (use mutator)
         trg.set(height,base);
         
         //display the height,base and area (use accessor)
         System.out.println("The pyramid's height is "  +trg.getHeight());
         System.out.println("The pyramid's base is "  +trg.getBase());
         System.out.println("The pyramid's area is "  +trg.getArea());
         }//end main
        }//end TriangleDemo class
         
         
   //The Tringale class stores and manipulates date for triangle. 
   class Triangle{
   
     private double height;
     private double base;

     // The setHeight method accepts an argument which is    
     //stored in the height field.

     public void setHeight(double len)
     {
          height = len;
     }

     // The setBase method accepts an argument which is 
     //stored in the base field. 
    
     public void setBase(double b)
     {
          base = b;
     }

     //The set method accepts two arguments which are 
     //stored in the height and base fields.
  
     public void set(double len, double b)
     {
          height = len;
          base = b;
     }

    // The getHeight method returns the value stored in the 
    //  height field.

     public double getHeight()
     {
          return height;
     }

     // The getBase method returns the value stored in the   
     //base field

     public double getBase()
     {
          return base;
     }

     // The getArea method returns the value of area
    // with formula : 0.5 * height * base

     public double getArea()
     {
          return 0.5 * height * base;
     }
}//end class Triangle

