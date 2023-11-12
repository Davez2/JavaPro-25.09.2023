public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        ArrayValueCalculator calc = new ArrayValueCalculator();
        try {
            int sum = calc.doCalc(array);
            System.out.println("Sum: " + sum);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}