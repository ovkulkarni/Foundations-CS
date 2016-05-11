public class IntArray
{
   int[] s; 
   int[] b;
   int sum = 0; double min = 0; double max = 0; 

   public IntArray(int x){
   
      s = new int[x];
   
   }

   public IntArray(int x, int y){
   
      s = new int[x];
      for(int i = 0; i < x; i++)
      {
         s[x] = y;
      }
   }

   public int getElementAt(int x){
   
      return s[x];
      
   }
     
   public int getFirst(){
   
      return s[0];
            
   }
    
   public int getLast(){
   
      return s[s.length - 1];
    
   }
   
   public int getSize(){
   
      return s.length; 
      
   } 

   public void setFirst(int x){
   
      s[x] = x;
      
   } 
   
   public void setElementAt(int x, int val){
   
      s[x] = val; 
      
   }
   
   public void setLast(int x){
   
      s[s.length - 1] = x;
     
   }
   
   public double findMin(){ 
   
      min = s[0];
      
      for (int i = 1; i < s.length; i++)
      {
         min = Math.min(min, s[i]);
         if(min > s[i])
         {
            min = s[i];
         }
      }
      return min;
   
   }
      
   public double findMax(){
   
      max = s[0];
      
      for (int i = 1; i < s.length; i++){
      
         max = Math.max(max, s[i]);
         if (max < s[i])
         {
            max = s[i];
         }
      }
      return max;
   
   }
   
   public int findSum(){
      for(int i = 0; i < s.length; i++){
         sum += s[i];
      }
      return sum;
   }
   
   public double findMinIndex(){ 
      double p = findMin();
      for (int i = 0; i < s.length; i++){
         if (s[i] == p){
            p = i;
         }
      }
      return p;
   }
   
   public double findMaxIndex(){ 
      double p = findMax();
      for (int i = 0; i < s.length; i++){
         if (s[i] == p){
            p = i;
         }
      }  
      return p;     
   }

   public void randomize(int a, int b)
   {   
          
      for (int i = 0; i < s.length; i++){
         s[i] = (int)(Math.random() * (b - a) + 1);  
      }
   }
   
   public void InsertElementAt(int x, int y){
      int[] b = new int[s.length + 1];
      b[x] = y;        
      for(int i = 0; i < x; i++){
         b[i] = s[i]; 
      }
      for(int w = x + 1; w < b.length; w++){
         b[w] = s[w-1];
      }
      s = b; 
   }
   public void DeleteElementAt(int x){
      int[] b = new int[s.length - 1]; 
      for(int i = 0; i < x; i++){
         b[i] = s[i];
      }
      for(int w = x + 1; w < b.length; w++){
         b[w - 1] = s[w];
      }
      s = b;
   }
   public void print()
   {
      for(int i : s)
      {
         System.out.print(i + " ");
      }
      System.out.println();
   } 
       
   
    
    
}