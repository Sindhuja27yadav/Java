import java.util.Scanner;
public class IsogramChecker{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a word:");
 String word = scanner.nextLine();
  scanner.close();
   boolean isIsogram = checkIsogram(word);
   System.out.println(isIsogram);
    }
 public static boolean checkIsogram(String word){
 // Convert the word to lowercase for case-insensitive comparison
 word = word.toLowerCase();
  for (int i = 0; i < word.length(); i++) {
   char currentChar = word.charAt(i); 
    // Check if the remaining part of the word contains the current character
    if (word.indexOf(currentChar, i + 1) != -1)
     {
       return false; 
// Duplicate character found
         }
      }
      return true; 
// No duplicate characters found
    }
}
