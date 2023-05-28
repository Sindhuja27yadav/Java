import java.util.Scanner;
public class popsicles{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sibilings=sc.nextInt();
    int popsicles=sc.nextInt();
    if(popsicles%sibilings==0)
      System.out.println("give away");
    else
      System.out.println("eat them yourself");
    }
  }
