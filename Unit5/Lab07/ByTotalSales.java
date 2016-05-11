   import java.util.Comparator;
    public class ByTotalSales implements Comparator<Salesperson>
   {
       public int compare(Salesperson arg1, Salesperson arg2)
      {
         return arg1.getSales() - arg2.getSales();
      }
   }