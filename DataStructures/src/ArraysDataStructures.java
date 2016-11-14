import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.Elements;

import org.omg.CORBA.INTERNAL;

/**
 * Created by sashank on 11/13/16.
 */
public class ArraysDataStructures {
	public static void main(String arg[]) {
		ArraysDataStructures arraysDataStructures = new ArraysDataStructures();
		//arraysDataStructures.reverseArray();
		//arraysDataStructures.hourGlassSum66Array();
		arraysDataStructures.arrayRotation();
	}

	/**
	 * Used Arrays earlier inorder to have indexOf method to avoid spaces, I need to change
	 * it either to ArrayList or List or need to write a new indexOf() method.
	 */
	public void reverseArray() {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();

		int[] intArray = new int[arraySize];
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arraySize; i++) {
			al.add(i, scanner.nextInt());
			//System.out.print(intArray[i] + " ");
		}

        /*for (int i=0; i<arraySize/2; i++){
			int temp = intArray[0 +i];
            intArray[i]= intArray[arraySize-1-i];
            intArray[arraySize-1-i]= temp;
        }*/

		for (int i = 0; i < arraySize / 2; i++) {
			int temp = al.get(0 + i);
			al.set(i, al.get(arraySize - 1 - i));
			al.set(arraySize - 1 - i, temp);
		}

		//System.out.print(Arrays.toString(intArray)+ " ");
		for (int i : al)
			System.out.print(i + (al.indexOf(i) < (al.size() - 1) ? " " : ""));
	}

	/**
	 * 1 2 3 4 5 6
	 * 7 8 9 10 11 12
	 * 23 14 15 16 17 18
	 * 19 20 21 22 23 24
	 * 25 26 27 28 29 30
	 * 31 32 33 34 35 36
	 */
	public void hourGlassSum66Array() {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		hourGlasses(matrix, rows, columns);
		//System.out.println(Arrays.deepToString(matrix));

	}

	public void hourGlasses(int[][] input, int rows, int columns) {
		int[] count = new int[(rows - 2) * (columns - 2)];
		int x = 0;
		for (int k = 0; k < (rows - 2); k++) {
			for (int l = 0; l < (columns - 2); l++) {
				count[x] = input[k][l] + input[k][l + 1] + input[k][l + 2] + input[k + 1][l + 1] + input[k + 2][l] + input[k + 2][l + 1] + input[k + 2][l + 2];
				++x;
			}
		}
		Arrays.sort(count);
		System.out.println(Arrays.toString(count));
		System.out.println(count[count.length - 1]);
	}

	public void dynamicArray() {

	}

	public void arrayRotation() {
		Scanner scanner = new Scanner(System.in);
		int noOfElements = scanner.nextInt();
		int rotations = scanner.nextInt();
		int[] arr = new int[noOfElements];

		for (int i = 0; i < noOfElements; i++) {
			arr[((i+noOfElements-rotations)%noOfElements)] = scanner.nextInt();
		}
		//System.out.println(Arrays.toString(arr));

		//List<Elements> list = new ArrayList(Arrays.asList(arr)); // this list will give elements not Integer list

		// TO conver array to arraylist of Integers, no predefined method as i know so converting manually using loop
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < noOfElements; i++) {
			list.add(arr[i]);
		}
		for (int i : list) {
			System.out.print(i + ((list.indexOf(i) < list.size()) ? " " : ""));
		}
	}
}
