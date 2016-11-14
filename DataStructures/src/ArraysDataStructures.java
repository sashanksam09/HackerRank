import java.util.Scanner;

/**
 * Created by sashank on 11/13/16.
 */
public class ArraysDataStructures {
    public static void main(String arg []){
        ArraysDataStructures arraysDataStructures = new ArraysDataStructures();
        arraysDataStructures.reverseArray();
    }
    public void reverseArray(){
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int [] intArray = new int[arraySize];

        for(int i=0; i<arraySize; i++){
            intArray[i] = scanner.nextInt();
            //System.out.print(intArray[i] + " ");
        }

        for (int i=0; i<arraySize/2; i++){
            int temp = intArray[0 +i];
            intArray[i]= intArray[arraySize-1-i];
            intArray[arraySize-1-i]= temp;
        }

        //System.out.print(Arrays.toString(intArray)+ " ");
        for (int i : intArray)
            System.out.print(i + ((intArray.length != i)?" ":""));


    }
}
