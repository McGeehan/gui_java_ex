import javax.swing.JFrame;


public class CounterGUI {
  public static void main(String[] args){

    //Create JFrame (actual display)
    JFrame counterFrame = new JFrame("Counter GUI");

    //Create counting functionality CounterPanel and add to display
    counterFrame.getContentPane().add(new CounterPanel());

    //Set close operation response to normal window close
    counterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Size counterFrame and contents according to set preferred sizes
    counterFrame.pack();

    //Render the display visible
    counterFrame.setVisible(true);
    
  }
}