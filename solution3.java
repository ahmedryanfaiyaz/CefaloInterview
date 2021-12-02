public class Main {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('9');
        System.out.println(input.getValue());
    }
}

interface Input {
    public void add(char c);
    public String getValue();
}

class TextInput implements Input {
    String currentValue = "";

    @Override
    public void add(char c) {
        currentValue += c;
    }

    @Override
    public String getValue() {
        return currentValue;
    }
}

class NumericInput extends TextInput {
    @Override
    public void add(char c) {
        // ascii value of character c (by type casting)
        int ascii = c;

        if (ascii >= 48 && ascii <=57) {
            super.currentValue += c;
        }
    }
}