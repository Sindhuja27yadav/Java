import java.util.Scanner;
public class BalconyComparator {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the measurements for apartment A (length,width): ");
  String apartmentA = scanner.nextLine();
 System.out.print("Enter the measurements forapartment B (length,width): "); 
  String apartmentB = scanner.nextLine();
   scanner.close();
  int areaA = calculateArea(apartmentA);
  int areaB = calculateArea(apartmentB);
if (areaA > areaB) {
 System.out.println("Apartment A has a larger balcony.");
else if (areaA < areaB) {
 System.out.println("Apartment B has a larger balcony."); 
  } 
  else {
   System.out.println("Both apartments have the same balcony area.");
    }
    }
  public static int calculateArea(String measurements) {
   String[] dimensions = measurements.split(",");
     int length = Integer.parseInt(dimensions[0]);
      int width = Integer.parseInt(dimensions[1]);
        return length * width;
    }
}
