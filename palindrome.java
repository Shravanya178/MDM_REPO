import java.util.Scanner;
public class palindrome{
public static boolean ispalindrome(String str){
  str = str.toLowerCase();
  String reversed = new StringBuilder(str).reverse().toString();
  return str.equals(reversed);
}

public static void main(String args[]){

  System.out.println("Enter a string: ");

}
}
