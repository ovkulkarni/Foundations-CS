   //
   // Torbert, 24 July 2013
	//
   import java.awt.Color;
   import java.awt.image.BufferedImage;
   import java.util.*;
	//
   public class PixelOperations
   {
      public Color[][] getArray(BufferedImage img)
      {
         Color[][] arr;
      	//
         int numcols = img.getWidth();
         int numrows = img.getHeight();
      	//
         arr = new Color[numrows][numcols];
      	//
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               int rgb = img.getRGB(k,j);
            	//
               arr[j][k] = new Color(rgb);
            }
         }
      	//
         return arr;
      }
      public void setImage(BufferedImage img, Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               //
               int rgb = tmp.getRGB();
               //
               img.setRGB(k,j,rgb);
            }
         }
      }
      //
   	/**********************************************************************/
   	//
   	// pixel operations
   	// 
      public void zeroBlue(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
            }
         }
      }
   	//--------> your new methods go here   <--------------
   	
   	public void negate(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               arr[j][k] = new Color( 255 - tmp.getRed(), 255 - tmp.getGreen(), 255 - tmp.getBlue() );
            }
         }
      }
      public void grayscale(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               int average = ((tmp.getRed() + tmp.getGreen() + tmp.getBlue())/3);
               arr[j][k] = new Color( average, average, average );
            }
         }
      }
      public void sepia(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               int sepiared = (int)(0.393 * tmp.getRed() + 0.769 * tmp.getGreen() + 0.189 * tmp.getBlue());
               int sepiagreen = (int)(0.349 * tmp.getRed() + 0.686 * tmp.getGreen() + 0.168 * tmp.getBlue());
               int sepiablue = (int)(0.272 * tmp.getRed() + 0.534 * tmp.getGreen() + 0.131 * tmp.getBlue());
               if (sepiared > 255) sepiared = 255;
               if (sepiagreen > 255) sepiagreen = 255;
               if (sepiablue > 255) sepiablue = 255;
               arr[j][k] = new Color( sepiared, sepiagreen, sepiablue);
            }
         }
      }
      public void blur(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               int blurred = 0;
               int blurgreen = 0;
               int blurblue = 0;
               if (j != 0 && j < arr.length - 1 && k != 0 && k < arr[j].length - 1){
                  blurred = ((arr[j - 1][k].getRed() + arr[j + 1][k].getRed() + arr[j][k - 1].getRed() + arr[j][k+1].getRed())/4);
                  blurgreen = ((arr[j - 1][k].getGreen() + arr[j + 1][k].getGreen() + arr[j][k - 1].getGreen() + arr[j][k+1].getGreen())/4);
                  blurblue = ((arr[j - 1][k].getBlue() + arr[j + 1][k].getBlue() + arr[j][k - 1].getBlue() + arr[j][k+1].getBlue())/4);
               arr[j][k] = new Color( blurred, blurgreen, blurblue);
               }
            }
         }
      }
      public void posterize(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               int red = 0;
               if(tmp.getRed() > 192)
                  red = 200;
               else if (tmp.getRed() > 128)
                  red = 150;
               else if (tmp.getRed() > 64)
                  red = 100;
               else
                  red = 50;
               int green = 0;
               if(tmp.getGreen() > 192)
                  green = 200;
               else if (tmp.getGreen() > 128)
                  green = 150;
               else if (tmp.getGreen() > 64)
                  green = 100;
               else
                  green = 50;
               int blue = 0;
               if(tmp.getBlue() > 192)
                  blue = 200;
               else if (tmp.getBlue() > 128)
                  blue = 150;
               else if (tmp.getBlue() > 64)
                  blue = 100;
               else
                  blue = 50;
               arr[j][k] = new Color( red, green, blue);
            }
         }
      }
      public void colorSplash(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               int average = ((tmp.getRed() + tmp.getGreen() + tmp.getBlue())/3);
               if (tmp.getRed() < tmp.getGreen() + tmp.getBlue())
                  arr[j][k] = new Color( average, average, average );
            }
         }
      }
      public void mirrorLR(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               if(k < arr[0].length/2){
                  Color tmp = arr[j][k];
                  arr[j][arr[0].length - 1 - k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue());
               }
            }
         }
      }
      public void mirrorUD(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               if(j < arr.length/2){
                  Color tmp = arr[j][k];
                  arr[arr.length - 1 - j][k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue());
               }
            }
         }
      }
      public void flipLR(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               if(k < arr[0].length/2){
                  Color tmp = arr[j][k];
                  Color tmp_opp = arr[j][arr[0].length - 1 - k];
                  arr[j][arr[0].length - 1 - k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue());
                  arr[j][k] = new Color( tmp_opp.getRed(), tmp_opp.getGreen(), tmp_opp.getBlue());

               }
            }
         }
      }
      public void flipUD(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               if(j < arr.length/2){
                  Color tmp = arr[j][k];
                  Color tmp_opp = arr[arr.length - 1 - j][k];
                  arr[arr.length - 1 - j][k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue());
                  arr[j][k] = new Color( tmp_opp.getRed(), tmp_opp.getGreen(), tmp_opp.getBlue());
               }
            }
         }
      }
      public void pixelate(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j+=3)
         {
            for(int k = 0; k < arr[0].length; k+=3)
            {
               Color tmp = arr[j][k];
               if (j != 0 && j < arr.length - 1 && k != 0 && k < arr[j].length - 1){
                  arr[j][k - 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j][k + 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j - 1][k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j - 1][k - 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j - 1][k + 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j + 1][k] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j + 1][k - 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
                  arr[j + 1][k + 1] = new Color( tmp.getRed(), tmp.getGreen(), tmp.getBlue() );
               }
                           
            }
         }
      }
      public void sunsetize(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               arr[j][k] = new Color( tmp.getRed(), (int)(tmp.getGreen() * 0.8), (int)(tmp.getBlue() * 0.8));
               
            }
         }
      }
      public void redEye(Color[][] arr)
      {
         for(int j = 300; j < 600; j++)
         {
            for(int k = 500; k < 1000; k++)
            {
               Color tmp = arr[j][k];
               if(tmp.getRed() > tmp.getGreen() + tmp.getBlue())
                  arr[j][k] = new Color( 0, tmp.getGreen(), tmp.getBlue());
               
            }
         }
      }
      private int colorDistance(Color a, Color b){
         int[] distances = new int[3];
         distances[0] = (int)Math.sqrt((a.getRed()-b.getRed())*(a.getRed()-b.getRed()) + (a.getGreen()-b.getGreen())*(a.getGreen()-b.getGreen()));
         distances[1] = (int)Math.sqrt((a.getRed()-b.getRed())*(a.getRed()-b.getRed()) + (a.getBlue()-b.getBlue())*(a.getBlue()-b.getBlue()));
         distances[2] = (int)Math.sqrt((a.getBlue()-b.getBlue())*(a.getBlue()-b.getBlue()) + (a.getGreen()-b.getGreen())*(a.getGreen()-b.getGreen()));
         int min = 0;
         for(int distance : distances){
            if(min < distance)
               min = distance;
         }
         return min;
   }
   public void edgeDetector(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length - 1; k++)
            {
               Color tmp = arr[j][k];
               Color tmp2 = arr[j][k+1];
               if(colorDistance(tmp, tmp2) > 20)
                  arr[j][k] = new Color( 0, 0, 0);
               else
                  arr[j][k] = new Color(255, 255, 255);
               
            }
         }
    }
    public void encode(Color[][] arr){
    }
    public void undo(Stack s, Color[][] arr) throws EmptyStackException
      {
         try{
            Color[][] remove = (Color[][]) s.pop();
            Color[][] replace = (Color[][]) s.pop();
            for(int j = 0; j < arr.length; j++)
            {
               for(int k = 0; k < arr[0].length; k++)
               {  
                  arr[j][k] = replace[j][k];
               }
            } 
         }
         catch(Exception e) {
            return;
         }           
      }
      public void modifyRed(Color[][] arr, double val)
      {
         
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length - 1; k++)
            {  
               Color tmp = arr[j][k];
               int red = (int)(tmp.getRed() * val);
               if(red > 255) red = 255;
               arr[j][k] = new Color(red , tmp.getGreen(), tmp.getBlue());
            }
         }       
      }
      public void modifyGreen(Color[][] arr, double val)
      {
         
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {  
               Color tmp = arr[j][k];
               int green = (int)(tmp.getGreen() * val);
               if(green > 255) green = 255;
               arr[j][k] = new Color(tmp.getRed(), green, tmp.getBlue());
            }
         }       
      }
      public void modifyBlue(Color[][] arr, double val)
      {
         
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {  
               Color tmp = arr[j][k];
               int blue = (int)(tmp.getBlue() * val);
               if(blue > 255) blue = 255;
               arr[j][k] = new Color(tmp.getRed(), tmp.getGreen(), blue);
            }
         }       
      }
      public int getSum(Color[][] arr){
         return 0;
      } 
         
   


	
     
   }
   //
	// end of file
	//