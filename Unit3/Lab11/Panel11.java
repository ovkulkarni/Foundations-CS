import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Panel11 extends JPanel
{
   private Display11 display;
   private Scoreboard11 scoreboard;
   
   public Panel11()
   {
      setLayout(new BorderLayout());
      
      scoreboard = new Scoreboard11();
      add(scoreboard, "North");
      
      display = new Display11();
      add(display, "Center");
      
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel, "South");
      addButton(panel, "One", 1);
      addButton(panel, "Two", 2);
      addButton(panel, "Three", 3);
   }
   
   private void addButton(JPanel panel, String str, int x)
   {
      JButton button = new JButton(str);
      button.addActionListener(new Listener(x));
      panel.add(button);
   }
   
   private class Listener
     implements ActionListener
   {
      private int myX;
      
      public Listener(int x)
      {
         myX = x;
      }
      
      public void actionPerformed(ActionEvent e)
      {
         scoreboard.update(display.pickUp(myX) == 12);
      }
   }
}
