package exercises;
import java.util.Arrays;

public class initializeArray {
    public static void main(String[] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        int[] oddNumbers;

        for(int i=0; i<integerArray.length; i++){
            if(i % 2 != 0){
                System.out.println(integerArray[i]);
            }
        }
    }
}
