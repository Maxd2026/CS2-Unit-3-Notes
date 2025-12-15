 public class BuildABear {
         // 3 SECTIONS IN AN OBJECT-CLASS!
         // 1. INSTANCE VARIABLES (data/attributes,fields)
         private String type; // just declare, don't assign
         private String name; // "every BuildABear has a name..."
         private int fillLevel;
         private double price;
         private boolean hasSpeaker;
         private String recording;
         // ENCAPSULATION: keeping variables PRIVATE means



         // 2. CONSTRUCTORS (initialize values)
         // DEFAULT CONSTRUCTOR does not take any arguements (no-arg)
         // what gets called when user says "= new BuildABear()"
         public BuildABear() {
            this.type = "bear"; // WE PICK the initial values!
            this.name = "Quinshon";
            this.fillLevel = 75;
            this.price = 150.00;
            this.hasSpeaker = false;
            this.recording = "";
         }
         // PARAMETERIZED CONSTRUCTOR allows user to provide args
         // user PASSES initial values to the constructor call
         public BuildABear(String t, String n, int fl) {
            this.type = t; // USER picked the value for type!
            this.name = n;
            this.fillLevel = fl;
            this.price = 150.00;
            this.hasSpeaker = false;
            this.recording = "";

         }
   
   
         // 3. METHODS (behaviors/actions)
   
   
        }
