import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JFrame {

    JPanel contentPanel;
    JPanel mainPanel;
    JPanel textPanel;
    JPanel buttonsPanel;

    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;

    JTextField tf1;
    JTextField tf2;

    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;

    LibraryGUI(){

        // Window title
        this.setTitle("Library");

        // Content panel (Always the same)
        contentPanel = (JPanel) this.getContentPane();

        mainPanel = new JPanel();
        textPanel = new JPanel();
        buttonsPanel = new JPanel();

        // Label Components
        lb1 = new JLabel("ADD NEW LIBRARY MEMBER");
        lb2 = new JLabel("The name of the member must not exceed 30 characters");
        lb3 = new JLabel("The ID of the member must be a 6-digit number.");
        lb4 = new JLabel("Member Name:");
        lb5 = new JLabel("Member ID:");

        // Text Fields
        tf1 = new JTextField("",30);
        tf2 = new JTextField("",6);

        // Buttons
        bt1 = new JButton("<<");
        bt2 = new JButton(">>");
        bt3 = new JButton("Add");
        bt4 = new JButton("Delete");
        bt5 = new JButton("Clear");


        // Adding buttons to button panel
        buttonsPanel.add(bt1);
        buttonsPanel.add(bt2);
        buttonsPanel.add(bt3);
        buttonsPanel.add(bt4);
        buttonsPanel.add(bt5);

        // Adding labels to main panel
        mainPanel.add(lb1);
        mainPanel.add(lb2);
        mainPanel.add(lb3);

        // Adding labels to text panel
        textPanel.add(lb4);
        textPanel.add(tf1);
        textPanel.add(lb5);
        textPanel.add(tf2);

        // Setting grid layouts
        mainPanel.setLayout(new GridLayout(3,1));
        textPanel.setLayout(new GridLayout(2,2));

        // Adding panels to the content panel
        contentPanel.add(buttonsPanel, BorderLayout.SOUTH);
        contentPanel.add(mainPanel, BorderLayout.NORTH);
        contentPanel.add(textPanel, BorderLayout.CENTER);

    }
}
