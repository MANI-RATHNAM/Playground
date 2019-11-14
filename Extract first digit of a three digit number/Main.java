import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first_digit=n/100;
      System.out.println(first_digit);
	}
}