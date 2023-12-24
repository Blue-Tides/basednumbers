public class Number {
  private int b; //base
  private int v; //value in 
  private int log(int x) {
    return (int)(Math.log10(x)/Math.log10(b));
  }
  /**
   * New number in base 10
   * @param v
   */
  public Number(int v) {
    this.v=v;
    this.b=10;
  }
  /**
   * @param v value in base 10
   * @param b base
   */
  public Number(int v, int b) {
    this.v=v;
    this.b=b;
  }
  /**
   * Makes a deep copy of n
   */
  public Number(Number n) {
    b=n.b;
    v=n.v;
  }
  /**
   * @return the value in string form in its current base
   */
  public String getValue() {
    if(v==0) return "0";
    String a="";
    int v=this.v;
    for(int i=log(v);i>=0;i--) {
      int t=(int)Math.pow(b,i);
      int x=v/t;
      a+=(x<10)?""+x:(char)(x+55);
      v=v%t;
    }
    return a; //for compiler
  }
  /**
   * @return the value in base 10
   */
  public int getValue10() {
    return v;
  }
  public int getBase() {
    return b;
  }
  /**
   * @param v in base 10
   */
  public void setValue(int v) {
    this.v=v;
  }
  public void setValue(Number n) {
    this.v=n.v;
  }
  /**
   * @param s the number in its current base
   */
  public void setValue(String s) {
    v=0;
    int l=s.length();
    for(int i=0;i<l;i++) {
      char x=s.charAt(i);
      v+=(int)(x-(Character.isDigit(x)?'0':0))*Math.pow(b,l-i-1);
    }
  }
  public String toString() {
    return "Value_10 of: "+v+"\nBase: "+b;
  }

}
