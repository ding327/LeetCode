public class ReverseIntegerSolution{
  public static int reverse(int x){
    Long res = 0;
      while(x != 0){
        res = res * 10 + x % 10;
        if(res > Integer.MAX_VALUE || res < Integer.MINVALUE){
          return 0;
        }
        x = x / 10;
      }
      return (int)res;
    }
    
    public static void main(String[] args){
      int reverse = reverse(-123456);
      System.out.Println("结果是：" + reverse);
    }
}
