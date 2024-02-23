package desiGang.util;
public class BasicCounter implements Counter {
    /* Fields */
    int count;
    int start;
    
    /* Constructor */
    public BasicCounter(int val) {
      this.start = val;
      this.count = val;
      System.err.println("BasicCounter(" + start + ")");
    }
  
    /* Methods */
    public void increment() throws Exception {
      
      this.count++;
    } // increment()
  
    public void reset() {
      this.count = this.start;
    } // res) {}et()
  
    public String toString() {
      return "[" + this.count + "]";
    } // toString()
  
    public int get() {
      return this.count;
    } // get()
  
  }