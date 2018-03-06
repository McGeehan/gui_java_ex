import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

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
    add(new JLabel("DPR104: Java GUI Demo"), BorderLayout.PAGE_START);
  }

  private class CountListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      //Increment count and update countLabel
      count += 1;
      countLabel.setText("Count: " + count);
    }
  }

}