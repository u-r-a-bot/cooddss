import java.util.Scanner;
class Operation {
    String[] ops = {"+", "-", "*", "/", "log", "^"};
    String opString;
    double result = 0;
    int operation = 0;

    Operation(String a) throws Exception {
        setOperation(a);
        numParse(a);
        opString = a;
        result = perforrmer();
    }

    public double getNum1() {
        return num1;
    }

    double num1;

    public double getNum2() {
        return num2;
    }

    double num2;

    void numberSetter(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    void setOperation(String op) throws Exception {
        char[] dec = op.toCharArray();
        boolean done = false;
        for (int i = 0; i < dec.length; i++) {
            if (dec[i] == '+') {
                this.operation = 1;
                done = true;
                break;
            } else if (dec[i] == '-') {
                this.operation = 2;
                done = true;
                break;
            } else if (dec[i] == '*') {
                this.operation = 3;
                done = true;
                break;
            } else if (dec[i] == '/') {
                this.operation = 4;
                done = true;
                break;
            } else if (dec[i] == 'l' && dec[i + 1] == 'o' && dec[i + 2] == 'g') {
                this.operation = 5;
                done = true;
                break;
            } else if (dec[i] == '^') {
                this.operation = 6;
                done = true;
                break;
            }

        }
        if(!done) throw new Exception("Wrong OPERATION Entered");

    }

    void numParse(String op) throws Exception {
        switch (operation) {
            case 1:
                String[] add = op.split("\\+");
                numberSetter(Double.parseDouble(add[0]), Double.parseDouble(add[1]));
                break;
            case 2:
                String[] sub = op.split("-");
                numberSetter(Double.parseDouble(sub[0]), Double.parseDouble(sub[1]));
                break;
            case 3:
                String[] mul = op.split("\\*");
                numberSetter(Double.parseDouble(mul[0]), Double.parseDouble(mul[1]));
                break;
            case 4:
                String[] div = op.split("/");
                numberSetter(Double.parseDouble(div[0]), Double.parseDouble(div[1]));
                break;
            case 5:
                String[] log = op.split("log");
                numberSetter(Double.parseDouble(log[0]), Double.parseDouble(log[1]));
                break;
            case 6:
                String[] pow = op.split("\\^");
                numberSetter(Double.parseDouble(pow[0]), Double.parseDouble(pow[1]));
                break;
            default:
                throw new NumberFormatException();
        }
    }

    double perforrmer() throws ArithmeticException {
        switch (operation) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 == 0) throw new ArithmeticException("Divide by zero");
                else return num1 / num2;
            case 5:
                if (num2 == 1) throw new ArithmeticException("Error: Log 1 occur");
                else if (num2 ==0) {
                    throw new ArithmeticException("Error: Log 0 occur");
                } else return Math.log(num1) / Math.log(num2);
            case 6:
                return Math.pow(num1, num2);
        }
        return 0;
    }

    @Override
    public String toString() {
        return opString + " = " + result;
    }
}
    public class stringOperation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter the operation ");
                String op = sc.next();
                Operation fst = new Operation(op);
                System.out.println("The first number is " + fst.getNum1() + " second number is: " + fst.getNum2());
                System.out.println(fst);
            }catch (NumberFormatException n){
                System.out.println("Wrong number entered");
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }