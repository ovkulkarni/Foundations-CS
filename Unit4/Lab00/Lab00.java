import java.util.Scanner;
public class Lab00
{
    public static final int NUMITEMS = 10;
    public static void main(String[] args)
    {
        double[] array = new double[NUMITEMS];
        Scanner keyboard = new Scanner(System.in);
        for (int x = 0; x < NUMITEMS; x++)
        {
            System.out.print("#" + (x+1) + ":  ");
            array[x] = keyboard.nextDouble();
        }
        System.out.println("The numbers you typed in, backwards:");
        for (int x = 0; x < NUMITEMS; x++)
            System.out.println("\t" +  array[NUMITEMS - x - 1]);
        System.out.println("Another algorithm");
        for (int x = NUMITEMS - 1; x >= 0 ; x--)
            System.out.println("\t" + array[x]);
    }
}
