class UseVerySmallNumException extends Exception{
    private final double val;
    UseVerySmallNumException(double v){
        val = v;
    }
    
    @Override
    public String toString(){
        return "The Quotient " + val + " is too small";
    }
}
public class CustomException {
    static double divide(double a , double b) throws UseVerySmallNumException, ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        double ans = a / b;
        if(ans <= 0.000001){
            throw new UseVerySmallNumException(ans);
        }
        System.out.println("Normal flow");
        return ans;
    }

    public static void main(String[] args) {
        try {
            for(int i = 0 ; i < 7 ; i ++){
                double dividend = Math.pow(10 , i);
                System.out.println("Result : "  + divide(1 , dividend));
            }
        } 
        catch (UseVerySmallNumException e) {
            System.out.println("Caught : " + e);
        }
    }
}
