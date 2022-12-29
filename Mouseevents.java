import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventExample extends JFrame implements MouseListener 
{

  // Declare a JLabel to display the mouse events
  private JLabel label;

  public MouseEventExample() 
  {
    // Set the title and size of the frame
    setTitle("Mouse Event Example");
    setSize(300, 200);

    // Set the default close operation and layout
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    // Create a JLabel to display the mouse events
    label = new JLabel("No mouse events detected");
    label.setBounds(20, 20, 200, 20);
    add(label);

    // Add the mouse listener to the frame
    addMouseListener(this);
  }

  public static void main(String[] args) 
  {
    MouseEventExample frame = new MouseEventExample();
    frame.setVisible(true);
  }

  // Handle mouse clicked event
  public void mouseClicked(MouseEvent e) 
  {
    label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
  }

  // Handle mouse pressed event
  public void mousePressed(MouseEvent e) 
  {
    label.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
  }

  // Handle mouse released event
  public void mouseReleased(MouseEvent e) 
  {
    label.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
  }

  // Handle mouse entered event
  public void mouseEntered(MouseEvent e) 
  {
    label.setText("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
  }

  // Handle mouse exited event
  public void mouseExited(MouseEvent e) 
  {
    label.setText("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
  }
}
