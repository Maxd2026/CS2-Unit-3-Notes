public class Main {

   public static void main(String []args) {
      
      
      // Create a new String --> SHORTCUT!
      String lebron = "Goat";
      // But Strings are actually OBJECTS
      // The original way to create a string:
      String steph = new String("GOAT");
      
      
      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      // "BuildABear basicBear" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
     System.out.println(basicBear);

     // Create a new object with our own values
     // called the CONSTRUCTOR: ClassName(String, String, int)
     BuildABear kitty = new BuildABear("cat", "Luna", 90);

     // Printing an OBJECT calls the CLASS' toString() method
     System.out.println(kitty);

     // Test our methods below by CALLING them
     // GETTERS are NON-VOID (we need to handle output data)
     System.out.println( kitty.getType() );
     // or, store the return value in a variable
     double price = kitty.getPrice();
     System.out.println ( price );


     kitty.setName("Minnie");
     kitty.setFillLevel(50);
     // setters (mutators) changed values. let's see the effects:
     System.out.println(kitty);



   } // end main() METHOD
} // end Main CLASS

