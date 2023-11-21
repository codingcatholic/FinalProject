// Loops and methods
// By: Sean

public class loops_functions {
  // Welcome to another lesson in the new yet vaguely familiar world of Java!

  // Today, we will be learning about the loops and functions/methods in Java.
  // Methods are also a key aspect of coding in Java. Otherwise known as functions, they are blocks of code that run when called, useful for using one block of code multiple times.
  
  // Variables and data can be passed into functions in the form of parameters which are defined along with its data type in the round brackets
  // Parameters can be passed into the function when it is called.
  
  static void my_func(String f_name) {
    System.out.println("Hi " + f_name);
    
    // void keyword indicates that the function returns None
    
  }
  // If a function is needed to return a value, we can then write:
  // static (data type) func_name(...) {...}
  
  static int int_func(){
    return 5;
  }  
  // Note: Variables defined in functions are only defined in that particular block of code. This is known as scope.
  // Note: Functions can have the same function name as long as the data type of their return value is different. 
  // static int my_func() and static float my_func() can both exist. This is known as overloading a function.
  
  public static void main(String[] args) {
    
    // Function called using the function name followed by brackets and semicolon. The name "Sean" is passed into the function and becomes f_name
    
    my_func("Sean");
    // Prints 5 as it is the returned value
    System.out.println(int_func());
    
    // In Java, there are only two kinds of loops: while and for loops.

    // While loops are loops that run a certain block of code until a certain condition is met
    // This is used when the block of code is expected to run an unknown number of times so that a condition can be eventually fulfilled
    // Example (loop repeating 5 times):
    
    int count = 0;
    while (count < 5) {
      
      // While count < 5, the loop continues
      
      count += 1;
      System.out.println("hi");
    }
    // Note how the condition is fulfilled after 5 iterations, be sure to have a condition that will eventually be considered False or else the loop will not end.

    //For loops are used in situations where the number of loops is known and predetermined. It is written in the following format:
      
    for (int i=0 ;i<5 ;++i){
      // Sets i = 0 at start one time (int i = 0)
      // Condition for loop to run is i less than 5 (i<5)
      // Ends loop by incrementing by 1 every time (++i)
      System.out.println("hello");
    }
      
    // Nested loops are often used for traversing 2D arrays and other functions. It is just one loop inside of another. 
    // For each time the outer loop runs, the inner loop must finish its loops before continuing to the next iteration
    int[][] arr = {{1,2}, {3,4}};
    for (int k=0; k < arr.length; ++k){
      for (int s=0; s < arr[k].length; ++s){
        System.out.println(arr[k][s]);
      }
    }
    // Another type of for loop is the for-each loop which iterates through an array.
    int[] num_arr = {1,2,3};
    for (int j: num_arr){
      System.out.println(j);
    }
    
   
  }

    
}
