import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>0 && n<5)
      {
        if(n==1)
          System.out.println("one");
      else if(n==2)
        System.out.println("Two");
      else if(n==3)
        System.out.println("Three");
      else if(n==4)
        System.out.println("Four");
      else if(n==5)
        System.out.println("Five");
      }
      else
      {
        System.out.println("Invalid");
      }
	}
}