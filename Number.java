public class Number {
  private int b; //base
  private int v; //value
  public Number(int v) {
    this.v=v;
    this.b=10;
  }
  public Number(int v, int b) {
    this.v=v;
    this.b=b;
  }
  public Number(Number n) {
    b=n.b;
    v=n.v;
  }
}
