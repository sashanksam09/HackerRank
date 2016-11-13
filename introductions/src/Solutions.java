import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import sun.util.resources.LocaleData;

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
		//solution.endOfFile();
		//solution.intToString();
		//solution.calendarDay();
		solution.currencyFormatter();

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
	 * 5
	 * -150
	 * 150000
	 * 1500000000
	 * 213333333333333333333333333333333333
	 * -100000000000000
	 */
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
		int i = 1;
		try {
			while (scan.hasNextLine()) {
				System.out.println(i + " " + scan.nextLine());
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception !!!!!!!");
		}
	}

	public void intToString() {

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();

			String s = Integer.toString(n);
			String s2 = String.valueOf(n);
			String s3 = new Integer(n).toString();
			// this is an overhead and uses the following StringBuilder sb = new StringBuilder();sb.append("");sb.append(number);return sb.toString()
			String s4 = "" + n;

			System.out.println("S: " + s);
			System.out.println("S2: " + s2);
			System.out.println("S3: " + s3);
			System.out.println("S4: " + s4);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Calendar Class
	 * Week (1-7) Sunday - Saturday
	 * Month (0-11) January - December
	 * Day 1-31
	 * <p>
	 * DayOfWeek is an enum representing the 7 days of the week - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday
	 */
	public void calendarDay() {
		Scanner in = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();

		try {
			int month = in.nextInt() - 1;
			int day = in.nextInt();
			int year = in.nextInt();

			calendar.set(year, month, day);
			int intDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			DayOfWeek dayOfWeek;
			if (intDayOfWeek == 1) {
				System.out.println(DayOfWeek.of(7));
			} else {
				System.out.println(DayOfWeek.of(intDayOfWeek - 1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void currencyFormatter(){
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();


		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		NumberFormat usFormat = numberFormat.getCurrencyInstance(Locale.US);
		NumberFormat chinaFormat = numberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat franceFormat = numberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat indiaFormat= numberFormat.getCurrencyInstance(new Locale("en", "IN"));

		String us = usFormat.format(payment);
		String india =indiaFormat.format(payment);
		String china = chinaFormat.format(payment);
		String france = franceFormat.format(payment);




		System.out.println("US: "+ us);
		System.out.println("India: "+ india);
		System.out.println("China: "+ china);
		System.out.println("France: "+ france);
	}
}
