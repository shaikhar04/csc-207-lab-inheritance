package desiGang.util;

import java.io.PrintWriter;

/**
 * A simple experiment to allow us to explore our counter classes.
 */
public class CounterExpt {
  public static void main(String[] args) throws Exception {
    // Set up output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up some counters
    Counter alpha = new NamedCounter("alfa", 0);// Counter alpha = new Tally(); // new BasicCounter(0);
    Counter beta = new DblCtr(new DblCtr(new BasicCounter(123))); // Counter beta = new DblCtr(new BasicCounter(123)); // Counter beta = new DoubleCounter(123);
    // DecrementableCounter gamma = new DecrementableCounter(-5); // new BasicCounter(-5);
    BoundedCounter gamma = new BoundedCounter(-5,3);

    // Print original values
    pen.println("Original alpha = " + alpha);
    pen.println("Original beta = " + beta);
    pen.println("Original gamma = " + gamma);
  
    // Print incremented values
    alpha.increment();
    beta.increment();
    gamma.increment();
    pen.println("Updated alpha = " + alpha);
    pen.println("Updated beta = " + beta);
    pen.println("Updated gamma = " + gamma);


    // Exercise 3 Test
    // gamma.reset();
    // pen.println("Resetted gamma = " + gamma);
    // gamma.decrement();
    // pen.println("Updated gamma = " + gamma);
    
    // Exercise 4 ToString
    // pen.println(alpha.toString());
    
    // And we're done
    pen.close();
  } // main(String[])
} // class CounterExpt