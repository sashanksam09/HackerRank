import java.util.*;
import java.lang.*;

public class Solutions {


	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {


		Solutions solution = new Solutions();
		//solution.ifElse();
		//solution.Scanner2();
		//solution.outputFormating();
		//solution.numberMultiples();
		//solution.sumOfSeries();
		//solution.dataTypes();
		solution.endOfFile();

	}

	public void ifElse() {
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt();
		String result = " ";
		if (ip1 % 2 != 0) {
			result = "Weird";
		} else {
			if ((2 <= ip1) && (ip1 <= 5)) {
				result = "Not Weird";
			} else if ((6 <= ip1) && (ip1 <= 20)) {
				result = "Weird";
			} else if (ip1 > 20) {
				result = "Not Weird";
			}
		}
	}


	public void Scanner2() {
		Scanner scan = new Scanner(System.in);
		int nt = Integer.parseInt(scan.nextLine());
		double dbl = Double.parseDouble(scan.nextLine());
		String str = scan.nextLine();

		/*int i = scan.nextInt();
		double d = scan.nextDouble();
		String temp = scan.nextLine();
		String s = scan.nextLine();*/

		System.out.println(" String:" + str);
		System.out.println(" Double:" + dbl);
		System.out.println(" Int:" + nt);
	}

	/**
	 * Java's System.out.printf function can be used to print formatted output.
	 **/
	public void outputFormating() {
		Scanner scan = new Scanner(System.in);

	/*	System.out.println("====================================");
		for (int i=0; i<3; i++){
			String str = scan.next();
			int integer = scan.nextInt();
			System.out.format("%-15s%03d%n", str,integer);
		}
		System.out.println("====================================");*/

		String[] str = new String[3];
		int[] integer = new int[3];
		for (int i = 0; i < 3; i++) {
			str[i] = scan.next();
			integer[i] = scan.nextInt();
		}
		System.out.println("====================================");
		for (int i = 0; i < 3; i++) {
			System.out.format("%-15s%03d%n", str[i], integer[i]);
		}
		System.out.println("====================================");
	}

	public void numberMultiples() {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			int res = number * i;
			System.out.println(number + " x " + i + " = " + res);
		}
	}

	public void sumOfSeries() {
		Scanner scan = new Scanner(System.in);
		int numberOfSeries = scan.nextInt();
		int a, b, n;
		int[] aa = new int[numberOfSeries];
		int[] bb = new int[numberOfSeries];
		int[] nn = new int[numberOfSeries];

		for (int i = 0; i < numberOfSeries; i++) {
			aa[i] = scan.nextInt();
			bb[i] = scan.nextInt();
			nn[i] = scan.nextInt();
		}

		for (int i = 0; i < numberOfSeries; i++) {
			a = aa[i];
			b = bb[i];
			n = nn[i];

			for (int j = 0; j <= (n - 1); j++) {
				int power = 0, sum = 0;
				for (int k = 0; k <= j; k++) {
					//System.out.println("K:"+k);
					power += ((int) (Math.pow(2, k)) * b);
				}
				sum += (a + power);
				System.out.print(sum + " ");
			}
			System.out.println();
		}

	}

	/***
	 5
	 -150
	 150000
	 1500000000
	 213333333333333333333333333333333333
	 -100000000000000*/
	public void dataTypes() throws InputMismatchException {
		/*int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long inputNumber = scan.nextLong();
				System.out.println(inputNumber + " can be fitted in: ");
				if (-128 < inputNumber && inputNumber < 127) {
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if (-32768 < inputNumber && inputNumber < 32767) {
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if ((-((int) (Math.pow(2, 31))) < inputNumber) && (inputNumber < (((int) (Math.pow(2, 31))) - 1))) {
					System.out.println("* int");
					System.out.println("* long");
				} else if (-((long) (Math.pow(2, 63))) < inputNumber && inputNumber < (((long) (Math.pow(2, 63))) - 1)) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(scan.next() + " can't be fitted anywhere .");
			}
		}*/


		int numberOfInputs = scan.nextInt();
		long inputNumber = readInput(scan, numberOfInputs);
		if (inputNumber == 0) {
			System.out.println(scan.next() + " can't be fitted anywhere.");
		} else if (-128 < inputNumber && inputNumber < 127) {
			System.out.println("* byte");
			System.out.println("* short");
			System.out.println("* int");
			System.out.println("* long");
		} else if (-32768 < inputNumber && inputNumber < 32767) {
			System.out.println("* short");
			System.out.println("* int");
			System.out.println("* long");
		} else if ((-((int) (Math.pow(2, 31))) < inputNumber) && (inputNumber < (((int) (Math.pow(2, 31))) - 1))) {
			System.out.println("* int");
			System.out.println("* long");
		} else if (-((long) (Math.pow(2, 63))) < inputNumber && inputNumber < (((long) (Math.pow(2, 63))) - 1)) {
			System.out.println("* long");
		}
	}

	/*Need to work on this program again..*/
	public long readInput(Scanner scan, int numberOfInputs) {
		try {


			long[] aa = new long[numberOfInputs];
			for (int i = 0; i < numberOfInputs; i++) {
				aa[i] = scan.nextLong();
			}
			for (int i = 0; i < numberOfInputs; i++) {
				return aa[i];
			}
		} catch (InputMismatchException im) {
		}
		return 0;
	}

	public void endOfFile() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> line = new ArrayList<String>();
		int i = 1;
		try {
			while (scan.hasNextLine())
				line.add(scan.nextLine());

			for (String printLine : line) {
				System.out.println(i + " " + printLine);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception !!!!!!!");
		}
	}

}
