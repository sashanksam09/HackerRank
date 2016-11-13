import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.message.stream.StreamHeader11;

/**
 * Created by I856449 on 11/10/2016.
 */
public class StrSolutions {
	public static void main(String args[]) {
		StrSolutions strSolutions = new StrSolutions();
		//strSolutions.simpleString();
		//strSolutions.subString();
		strSolutions.StringCompare();
	}

	public void simpleString() {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();

		System.out.println((str1.length() + str2.length()));
		if ((str1.compareTo(str2)) <= 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		System.out.print(str1.substring(0, 1).toUpperCase().concat(str1.substring(1, str1.length()).toLowerCase()));
		System.out.print(" ");
		System.out.print(str2.substring(0, 1).toUpperCase().concat(str2.substring(1, str2.length()).toLowerCase()));
	}

	public void subString() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();

		String result = str.substring(start, end);
		System.out.println(result);
	}

	public void StringCompare() {
		ArrayList<String> al = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String minStr, maxStr, temp;
		int numb = scan.nextInt();

		for (int i = 0; i <= (str.length() - numb); i++) {
			al.add(str.substring(i, (i + numb)));
			System.out.println(str.substring(i, (i + numb)));
		}
		int alLength = al.size();

		for (int i = 0; i < (al.size() - 1); i++) {
			for (int j = 0; j < (al.size() - 1); j++) {
				maxStr = al.get(j);
				minStr = al.get(j + 1);
				if (maxStr.compareTo(minStr) < 0) {
					temp = al.get(j);
					al.set(j, al.get(j + 1));
					al.set((j + 1), temp);
				}

			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(al.get(alLength - 1));
		System.out.println(al.get(0));
	}
}
