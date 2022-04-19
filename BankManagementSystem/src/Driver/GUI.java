package Driver;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    private JFrame frame;
    private JButton send,reset;
    private JLabel label;
    private JPanel panel;
    private int count=0;

    private JMenuBar mb;

    private JMenu m1,m2;
    private JMenuItem m11,m12,m13,m21;
    private JTextField tf;
    private JTextArea ta;
    public GUI()
    {
        int count=0;

        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(680,500);

        //Creating the MenuBar and adding components
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        m11 = new JMenuItem("Open");
        m12 = new JMenuItem("Save");
        m13 = new JMenuItem("Exit");
        m21 = new JMenuItem("About");
        m2.add(m21);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);

        //Creating the panel at bottom and adding components
        panel = new JPanel(); // the panel is not visible in output
        label = new JLabel("Enter Text");
        tf = new JTextField(10); // accepts up to 120 characters
        send = new JButton("Send");
        send.addActionListener(this::actionPerformed);
        reset = new JButton("Reset");

        // Components Added using Flow Layout
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center

        ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
    new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("Number of clicks: " + count);
    }

}
