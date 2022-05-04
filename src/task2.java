public class task2 {
    public static void generateException(int what ){
        int p;
        int numbers[] = new int[5];
        System.out.println("Input value" + what);
        try {
            switch (what) {
                case 0:
                    p = 20 / what;
                    break;
                case 1:
                    numbers[25] = 25;
                case 2:
                    return;
            }
        }
            catch (ArithmeticException e){
                System.out.println("You cannot divide by zero");
                return;

            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no such index");
        }
        finally {
            System.out.println("These code will always be used");
        }
    }
}
class exception{
    public static void  main(String[] args){
        for(int i=0;i<3 ;i++){
            task2 UseFinally = new task2();
            UseFinally.generateException(i);
            System.out.println();
        }
    }
}
