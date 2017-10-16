/**
 * https://leetcode.com/problems/palindrome-number/description/
 * 判断一个整数是否为回读整数
 */
public class PalindromeNumberSolution{
  public static boolean isPalindrome(int x) {
    if(x < 0 || (x != 0 && x % 10 == 0)){
      return false;
    }
    
    int res = 0;
    while(x > res){
      res = res * 10 + x % 10;
      x = x / 10;
    }
    
    return (x == res || x == res / 10);
  }
  
  public static void main(String[] args){
    boolean result = isPalindrome(21112);
    System.out.println("结果是：" + result);
  }
}
