package exercises;

public class Array {
    public static void main(String[] args){
        int[] someArray = {1, 1, 2, 3, 5, 8};
        for (int num1: someArray) {
            System.out.println(num1);
        }

        for (int num2: someArray){
            if(num2 % 2 != 0){
                System.out.println(num2);
            }
        }
    }
}
