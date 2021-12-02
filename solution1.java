int decodeSymbolicNotation(String notation) {
	// notation = "rwxr-x-w-";
	// notation = "xxxrrrwww---";
	// notation = "rrrxxxwww---";
	// notation = "------xxx";

	int prevNumericValue = 0;
	int numericValue = 0;
	int tempNumericValue = 0;
	int digitPlace = 1;
	for (int i=0; i<=notation.length(); i++) {

		if (i!=0 && i%3 == 0) {
			if (tempNumericValue == 12) {
				numericValue = (numericValue*100) + tempNumericValue;
			} else {
				numericValue = (numericValue*10) + tempNumericValue;
			}

			tempNumericValue = 0;
		}

		if (i==notation.length()) break;

		if (notation.charAt(i) == 'r') tempNumericValue += 4;
		else if (notation.charAt(i) == 'w') tempNumericValue += 2;
		else if (notation.charAt(i) == 'x') tempNumericValue += 1;
		else if (notation.charAt(i) == '-') tempNumericValue += 0;
	}

	// System.out.println(numericValue);
	return numericValue;
}