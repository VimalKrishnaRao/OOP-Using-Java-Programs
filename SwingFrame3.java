import javax.swing.*;
import java.awt.event.*;

public class NumberFrame extends JFrame 
{
    private JTextField inputField;
    private JTextField prevField;
    private JTextField nextField;
    private JLabel inputLabel;
    private JLabel prevLabel;
    private JLabel nextLabel;
    private JButton button;

    public NumberFrame() 
    {
        // Set the title and layout of the frame
        setTitle("Number Frame");
        setLayout(new FlowLayout());

        // Create the labels and text fields
        inputLabel = new JLabel("Input:");
        add(inputLabel);
        inputField = new JTextField(10);
        add(inputField);

        prevLabel = new JLabel("Previous:");
        add(prevLabel);
        prevField = new JTextField(10);
        prevField.setEditable(false);
        add(prevField);

        nextLabel = new JLabel("Next:");
        add(nextLabel);
        nextField = new JTextField(10);
        nextField.setEditable(false);
        add(nextField);

        // Create the button and add an action listener
        button = new JButton("Go");
        button.addActionListener(new ButtonListener());
        add(button);

        // Set the size and location of the frame
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            // Get the input number from the input field
            int input = Integer.parseInt(inputField.getText());

            // Set the previous and next numbers in the prev and next fields
            prevField.setText(String.valueOf(input - 1));
            nextField.setText(String.valueOf(input + 1));
        }
    }

    public static void main(String[] args) 
    {
        NumberFrame frame = new NumberFrame();
        frame.setVisible(true);
    }
}
