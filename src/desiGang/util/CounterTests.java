package desiGang.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for counters.
 */
public class CounterTests {
  @Test
  public void test1() throws Exception {
    Counter alpha = new NamedCounter("alfa", 0); //Counter alpha = new Tally(); // new BasicCounter(0);
    Counter beta = new DoubleCounter(123); // Counter beta = new BasicCounter(123);
    BasicCounter gamma = new BoundedCounter(-5,3); // DecrementableCounter gamma = new DecrementableCounter(-5); // new BasicCounter(-5);
    assertEquals(0, alpha.get(), "original alpha");
    assertEquals(123, beta.get(), "original beta");
    assertEquals(-5, gamma.get(), "original gamma");
    for (int i = 0; i < 10; i++) {
      alpha.increment();
      beta.increment();
      gamma.increment();
    } // for
    assertEquals(10, alpha.get(), "updated alpha");
    assertEquals(143, beta.get(), "updated beta"); //assertEquals(133, beta.get(), "updated beta");
    assertEquals(5, gamma.get(), "updated gamma");
    alpha.reset();
    beta.reset();
    gamma.reset();
    assertEquals(0, alpha.get(), "reset alpha");
    assertEquals(123, beta.get(), "reset beta");
    assertEquals(-5, gamma.get(), "reset gamma");

    // Lab Exercise 3
    // gamma.reset();
    // assertEquals(-5, gamma.get(), "reset gamma");
    // gamma.decrement();
    // assertEquals(-6, gamma.get(), "decremented gamma");
  
  } // test1()
} // class CounterTests