import java.util.Scanner;
    
class Main{
  public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if ( n < 0 ){
      int sum = (n+1)*(-n+2)/2;
      System.out.println(sum);
    }else if ( n > 0 ){
      int sum = (n+1)*n/2;
      System.out.println(sum);
    } else {
      System.out.println(1);
    }
  }
}
