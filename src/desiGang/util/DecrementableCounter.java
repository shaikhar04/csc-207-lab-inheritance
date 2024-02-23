package desiGang.util;

public class DecrementableCounter extends BasicCounter {
  public DecrementableCounter(int start) {
    super(start);
    System.err.println("DecrementableCounter(" + start + ")");
  } // DecrementableCounter(int)

  public void decrement() {
    this.count--;
  } // decrement()
} // class DecrementableCounter