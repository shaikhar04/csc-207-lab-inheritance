package desiGang.util;

public class BoundedCounter extends BasicCounter {
  int bound;
  
  public BoundedCounter(int start, int upper) {
    super(start);
    this.bound = upper;
  } // BoundedCounter(int, int)

  @Override
  public void increment() throws Exception { 
    if (super.count > this.bound) {
        throw new Exception("Count exceeded upper bound");
      }
      super.increment();
  } // increment()
}
