public class InputCheck {

    public static int NumCheck(String symbol) throws NumberFormatException {
        int value;
        try {
            value = Integer.parseInt(symbol);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Value have to be number");
        }

        if (value < 1 || value > 10) {
            throw new NumberFormatException("Number is less than 1 or more than 10");
        }

        return value;
    }
}
