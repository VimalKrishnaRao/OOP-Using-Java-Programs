import javax.swing.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame 
{
    private JLabel label;
    private JButton yesButton;
    private JButton noButton;

    public ButtonFrame() 
    {
        // Set the title and layout of the frame
        setTitle("Button Frame");
        setLayout(new FlowLayout());

        // Create the label
        label = new JLabel("");
        add(label);

        // Create the buttons and add action listeners
        yesButton = new JButton("Yes");
        yesButton.addActionListener(new ButtonListener());
        add(yesButton);

        noButton = new JButton("No");
        noButton.addActionListener(new ButtonListener());
        add(noButton);

        // Set the size and location of the frame
        setSize(200, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            // Set the label's text to the text of the button being pressed
            label.setText(((JButton)e.getSource()).getText());
        }
    }

    public static void main(String[] args) 
    {
        ButtonFrame frame = new ButtonFrame();
        frame.setVisible(true);
    }
}
