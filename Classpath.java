public class RecursiveGCD{
 public static int gcd(int a,int b){
   if (b==0){
     return a;
      } 
   else 
     {
       return gcd(b,a%b);
      }
   }
public static void main(String[] args){
 // Print the classpath
String classPath=System.getProperty("java.class.path ");
System.out.println("Classpath:"+classPath);
 // Calculate and print the GCD
int num1=24;
int num2=36;
int result=gcd(num1, num2);
System.out.println("GCD of "+num1+"and"num2+"is:"+result);
   }
  }
