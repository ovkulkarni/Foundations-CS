/*
  ____                     ____       _
 / ___|___  _ __ ___  _ __/ ___|  ___(_)
| |   / _ \| '_ ` _ \| '_ \___ \ / __| |
| |__| (_) | | | | | | |_) |__) | (__| |
 \____\___/|_| |_| |_| .__/____/ \___|_|
                     |_|                 
*/
// Name: 				Date:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
   
public class Bumper
{
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
   private int myX;
   private int myY;
   private int width;
   private int height;
   private Color myColor;
   
   
     //constructors
   public Bumper()         //default constructor
   {
      myX = 50;
      myY = 50;
      width = 50;
      height = 150;
      myColor = Color.BLUE;
   }
   public Bumper(int x, int y, int xWidth, int yWidth, Color c)
   {
      myX = x;
      myY = y;
      width = xWidth;
      height = yWidth;
      myColor = c;
   }
      
     // accessor methods  (one for each field)
   public int getX(){
      return myX;
   }
   public int getY(){
      return myY;
   }
   public int getWidth(){
      return width;
   }
   public int getHeight(){
      return height;
   }
   public Color getColor(){
      return myColor;
   }
   
     // modifier methods  (one for each field)
   public void setX(int x){
      myX = x;
   }
   public void setY(int y){
      myY = y;
   }
   public void setWidth(int w){
      width = w;
   }
   public void setHeight(int h){
      height = h;
   }
   public void setColor(Color c){
      myColor = c;
   }
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
   public void jump(int rightEdge, int bottomEdge)
   {
         // moves location to random (x, y) within the edges
    myX = (int)(Math.random() * (rightEdge - width));
    myY = (int)(Math.random() * (bottomEdge - height));
   }
      
       // draws a rectangular bumper on the buffer
   public void draw(Graphics myBuffer) 
   {
      myBuffer.setColor(getColor());
      myBuffer.fillRect(getX(), getY(), getWidth(), getHeight());
   }   
   	// returns true if any part of the polkadot is inside the bumper
   public boolean inBumper(Polkadot dot)
   {
      for(int x = getX(); x <= getX() + getWidth(); x++)   //mys at upper left corner(x,y)
         for(int y = getY(); y <= getY() + getHeight(); y++)
            if(distance(x, y, (int)dot.getX(), (int)dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
               return true;            
      return false;
   }  
      // returns distance between (x1, y1) and (x2, y2)
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }	
}
