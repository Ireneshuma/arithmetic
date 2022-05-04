public class arithmetic {
    public staticn
    public static void main(String[] args){
        int a=0;
        int b = 1;
        int c = 10;
        try{
            c=b/a;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Printing out the arithmetic exception");
        }
        System.out.println("value of c ");
    }
}
