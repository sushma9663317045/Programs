package Bpgms_patterns;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		String s = "You have initiated a txn of INR 30.00 at junglee GA on ICICI Bank card no.4599. OTP is 925841. DONT SHARE WITH ANYONE. BANK NEVER CALLS.xls TO VERIFY OTP.";
		/*
		 * Pattern p=Pattern.compile("\\* Bank"); String[] ss = p.split(s);
		 * System.out.println(Arrays.toString(ss));
		 */
		/*
		 * String ss = s.split(" Bank")[0]; System.out.println(ss); String str =
		 * ss.split(" ")[12]; System.out.println(str);
		 */

		/*
		 * String str="ext09"; Pattern pattern=Pattern.compile("^[a-z][0-9]");
		 * Matcher m=pattern.matcher(str); System.out.println(m.find());
		 */

		String text = "This is the text to be searched for occurrences of the http:// pattern.";

		String patternString = "h[a-zA-Z]/+";

		Pattern pattern = Pattern.compile(patternString);

		Matcher matcher = pattern.matcher(text);
		System.out.println(matcher.group());
	}

}
