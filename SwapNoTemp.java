/**
 * The objective of this class is to swap the values
 * of two variables without the creation of a third
 * (temporary) variable.
 *
 * @author malloneec
 * @since 8/8/16
 */
public class SwapNoTemp {
    private static int a;
    private static int b;

    public static void main(String[] args){
        a = 1;
        b = 2;

        displayValues();
        swapValues();
        displayValues();
    }

    public static void displayValues(){
        System.out.println("Value 'a' = " + a + ", and value 'b' = " + b);
    }

    /**
     * To swap the values of two variables without creating a third (temporary)
     * variable, sum both values into 'a' (we'll assume 'a'=1 and 'b'=2, so 'a' should
     * now equal 3). Set the second variable to that sum minues the second variable's
     * initial value ('b' = 3 - 2). Then set the first variable to its current value
     * minus the current value of the second variable ('a' = 3 - 1). Both variables
     * now have the initial value of the other variable.
     */
    public static void swapValues(){
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
