public class Calculator {

    public static int doCalcThreeNumbers(int a,int b, int c,String op1,String op2) throws CalcException
    {
        int result;
        if((op1.equals("*") || op1.equals("/")) && (op2.equals("+") || op2.equals("-"))) {
            result=CalcTwoNumbers(a,b,op1);
            result=CalcTwoNumbers(result,c,op2);
        } else if ((op1.equals("+") || op1.equals("-")) && (op2.equals("/") || op2.equals("*"))) {
            result = CalcTwoNumbers(b, c, op2);
            result = CalcTwoNumbers(result, a, op1);
        } else if ((op1.equals("*") || op1.equals("/")) && (op2.equals("/") || op2.equals("*"))) {
            result = CalcTwoNumbers(a, b, op1);
            result = CalcTwoNumbers(result, c, op2);
        } else {
            result= CalcTwoNumbers(a,b,op1);
            result= CalcTwoNumbers(result,c,op2);

        }
        return result;

    }



    public static int CalcTwoNumbers(int a,int b,String math ) throws CalcException {
        int result;

        switch (math){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new CalcException("invalid char");
        }

        return result;
    }

}
