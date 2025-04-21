public class APLine
{
  private int mya,myb,myc;
  public APLine(int a, int b, int c){
    mya = a;
    myb = b;
    myc = c;
  }
  public double getSlope(){
    double slope = (double) -mya/myb;
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if(((mya * x) +(myb * y) + myc) == 0){
      return true;
    }
    return false;
  }
}
