int romanToDecimal(String roman) {
	// roman = "XXVII"; // 27
	// roman = "VIII"; // 27
	// roman = "LVIII"; // 58
	// roman = "MCMXCIV"; // 1994
	// roman = "DL"; // 550
	// roman = "MDXXXVI"; // 1536
	// roman = "MMMCMXCIX"; // 3999
	// roman = "I"; // 1
	// roman = "K"; // Invalid


	int number = 0;
	char prev = ' ';
	for (int i = 0; i < roman.length(); i++) {
		// System.out.println(roman.charAt(i));

		if (prev == 'I' && roman.charAt(i) == 'V') {
			number -= 1;
			number += 4;
			prev = 'V';
		} else if (prev == 'I' && roman.charAt(i) == 'X') {
			number -= 1;
			number += 9;
			prev = 'X';
		} else if (prev == 'X' && roman.charAt(i) == 'L') {
			number -= 10;
			number += 40;
			prev = 'L';
		} else if (prev == 'X' && roman.charAt(i) == 'C') {
			number -= 10;
			number += 90;
			prev = 'C';
		} else if (prev == 'C' && roman.charAt(i) == 'D') {
			number -= 100;
			number += 400;
			prev = 'D';
		} else if (prev == 'C' && roman.charAt(i) == 'M') {
			number -= 100;
			number += 900;
			prev = 'M';
		} else if (roman.charAt(i) == 'I') {
			number += 1;
			prev = 'I';
		} else if (roman.charAt(i) == 'V') {
			number += 5;
			prev = 'V';
		} else if (roman.charAt(i) == 'X') {
			number += 10;
			prev = 'X';
		} else if (roman.charAt(i) == 'L') {
			number += 50;
			prev = 'L';
		} else if (roman.charAt(i) == 'C') {
			number += 100;
			prev = 'C';
		} else if (roman.charAt(i) == 'D') {
			number += 500;
			prev = 'D';
		} else if (roman.charAt(i) == 'M') {
			number += 1000;
			prev = 'M';
		} else {
			// System.out.println("returning -1");
			return -1;
		}
	}

	// System.out.println(number);
	return number;
}
