public class DriverIntArray {
   public static void main(String[] args){
      IntArray array = new IntArray(10);
      for(int i = 1; i <= 10; i++){
         array.setElementAt(i-1, 2*i);
      }
      array.print();
      array.InsertElementAt(1, 0);
      array.InsertElementAt(2, 4);
      array.InsertElementAt(3, 9);
      array.print();
      array.DeleteElementAt(0);
      array.DeleteElementAt(0);
      array.DeleteElementAt(10);
      array.print();
      array.setElementAt(5, array.findSum());
      System.out.println(array.findMin() + " " + array.findMinIndex());
      System.out.println(array.findMax() + " " + array.findMaxIndex());
      array.randomize(0, array.getSize());
      array.print();
   }
}