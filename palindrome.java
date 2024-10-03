import java.util.Scanner;
public class palindrome{
public static boolean ispalindrome(String str){
  str = str.toLowerCase();
  String reversed = new StringBuilder(str).reverse().toString();
  return str.equals(reversed);
}

public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a string: ");
  String str= sc.nextLine();

  if (ispalindrome(str)) {
    System.out.println(str + " is a palindrome.");
} else {
    System.out.println(str + " is not a palindrome.");
}

sc.close();
}
}
