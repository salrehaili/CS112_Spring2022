import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class GUIStarter extends JFrame {
 
  private class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent evt) {
      System.out.println("handler called");
    }
  }
 
  public GUIStarter() {
    setTitle("GUI Starter");
    setLocationRelativeTo(null);
 
    add(centerPanel(), BorderLayout.CENTER);
    // or simply:
    // add( centerPanel() );    
  }
 
  private JPanel centerPanel() {
    JPanel panel = new JPanel();
 
    JLabel label = new JLabel("Hello");
    panel.add(label);
 
    JButton button = new JButton("Press");
    ButtonHandler handler = new ButtonHandler();
    button.addActionListener(handler);
    panel.add(button);
 
    return panel;
  }
 
  public static void main(String[] args) {
    GUIStarter window = new GUIStarter();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    // if you want to set the size to the enclosed components:
    //window.pack();
 
    // otherwise, set a specific size:
    window.setSize(350, 250);
 
    window.setVisible(true);
 
    // if you want to restrict resizing:
    //window.setResizable(false);
  }
}