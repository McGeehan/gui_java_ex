import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * <b>CounterPanel Class</b>
 * <p>
 * Represents the primary content panel for Counting functionality.
 * <p>
 * Inherits from JPanel.
 * @author James Wen - jrw2175
 */

public class CounterPanel extends JPanel {

  private JLabel countLabel;
  private int count;

  public CounterPanel(){
    //Initialization
    count = 0;
    setLayout(new BorderLayout());

    //Create Components
    JPanel mainPanel = new JPanel();
    countLabel = new JLabel("Count: " + count);
    JButton countButton = new JButton("Increase Count");

    //Set background color of Components
    Color columbiaBlue = new Color(196, 216, 226);
    mainPanel.setBackground(columbiaBlue);

    //Set sizing and positoning of Components
    int mainPanelWidth = 200;
    int countLabelWidth = 80;
    int countButtonWidth = 150;
    int countLabelMargin = (mainPanelWidth - countLabelWidth) / 2;
    int countButtonMargin = (mainPanelWidth - countButtonWidth) / 2;
    mainPanel.setPreferredSize(new Dimension (mainPanelWidth, 80));
    countLabel.setBounds(countLabelMargin, 20, countLabelWidth, 50);
    countButton.setBounds(countButtonMargin, 70, countButtonWidth, 50);

    //Add ActionListeners to Buttons
    countButton.addActionListener(new CountListener());

    //mainPanel component adding
    mainPanel.add(countLabel);
    mainPanel.add(countButton);

    //CounterPanel component adding
    add(mainPanel, BorderLayout.CENTER);
    add(new JLabel("W1004: Java GUI Demo"), BorderLayout.PAGE_START);
  }
  /**
   * <b>CountListener Class</b>
   * <p>
   * Listener that tracks counting functionality Button actions/events.
   * Increments count on button press and updates countLabel JLabel.
   * <p>
   * Implements the ActionListener interface.
   * @author James Wen - jrw2175
   */  
  private class CountListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      //Increment count and update countLabel
      count += 1;
      countLabel.setText("Count: " + count);
    }
  }

}