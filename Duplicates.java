import java.util.Arrays;
public class RemoveDuplicates{
public static void main(String[] args){
 int[] numbers={2, 4, 6, 8, 2, 4, 10, 8, 12, 14, 6};
 System.out.println("Original Array:"+Arrays.toString(numbers));
   for (int i=0; i<numbers.length;i++){
     if(numbers[i]!=-1){
        for(int j=i+1;j<numbers.length;j++){
           if (numbers[i]==numbers[j]){
              numbers[j]=-1;
               }
           }
        }
    }
 System.out.println("Array with Duplicates Replaced:"+Arrays.toString(numbers));
  }
 }
