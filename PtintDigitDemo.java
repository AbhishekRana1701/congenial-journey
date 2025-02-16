public class PtintDigitDemo {
    static void printDigit(int num){
        //Base case
    if (num == 0){
        return;
        }
        //small problem
        printDigit(num/10);
        System.out.println(num % 10);
    }
    public static void main(String[] args) {
        printDigit(12345);
    }
    }

