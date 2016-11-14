import java.util.*;


/**
 * Created by I856449 on 11/10/2016.
 */
public class StrSolutions {
	public static void main(String args[]) {
		StrSolutions strSolutions = new StrSolutions();
		//strSolutions.simpleString();
		//strSolutions.subString();
		//strSolutions.StringCompare();
		//strSolutions.palindrome();
		//boolean ret = strSolutions.anagrams();
		//System.out.println(ret?"Anagram":"Not Anagram");
		strSolutions.stringTokens();
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

	public void palindrome() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String out;

		char[] charArray = str.toCharArray();
		int len = charArray.length;

		for (int i = 0; i < len / 2; i++) {
			if (!(charArray[i] == charArray[len - 1 - i])) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

		/*Another method which is not recomended for extra use of memory*/

		/*StringBuffer original = new StringBuffer(str);
		StringBuffer reverse = new StringBuffer(original.reverse());
		String str2 = new String(reverse);
		if(str.equals(str2))
			System.out.println("Yes");
		else
			System.out.println("No");*/
	}

	/***
	 *
	 * anagramm, marganaa, hello and Hello
	*/
	public boolean anagrams() {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();

		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();

		Map<Character, Integer> mapWord = new HashMap<Character, Integer>();

		for (char c : charArray1) {
			int count = 1;
			if (mapWord.containsKey(c))
				mapWord.put(c, mapWord.get(c)+1);
			else
				mapWord.put(c, count);
		}

		for (char c : charArray2) {
			int count = 1;
			if (mapWord.containsKey(c))
				mapWord.put(c, mapWord.get(c)-1);
			else
				mapWord.put(c, count);
		}

		for (char c : mapWord.keySet()) {
			//System.out.println(mapWord.get(c));
			if (mapWord.get(c) != 0) {
				return false;
			}
		}
		return true;

	}

	/***
	 *  !,?._'@
	 */
	public void stringTokens(){
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		// + means the characters can be combined one or more times. to create one single delimiter,
		String [] tokens = line.split("[!|\\.|\\,|\\?|\\_|\\'|\\@|\\s+]+");
		//String [] tokens = line.split("[^\\s+|\\!|\\.|\\,|\\?|\\_|\\'|\\@|\\s+|\\s+$]+");
		//String [] tokens = line.split("[^\\s+,!,.,\\,,?,_|,',@,\\s+,\\s+$]+");
		System.out.println(tokens.length);
		for (String str: tokens) {
			System.out.println(str);
		}
	}
}

