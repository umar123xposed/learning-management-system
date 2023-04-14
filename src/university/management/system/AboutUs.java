package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - The Lumber One University");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 0, 154));
            l3.setFont(new Font("Courier new", Font.BOLD, 30));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(127, 0, 0));
            l4.setFont(new Font("Courier New", Font.BOLD, 30));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("Object Oriented Programing");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD , 24));
            l5.setBounds(70, 250, 600, 34);
            contentPane.add(l5);


            

            JLabel l9 = new JLabel("Education - B.S(Computer Science)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Umar hussain (14655)");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);

JLabel l11 = new JLabel("Ebad ur rehman (13805)");
            l11.setForeground(new Color(47, 79, 79));
            l11.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l11.setBounds(70, 420, 600, 34);
            contentPane.add(l11);

JLabel l12 = new JLabel("Asad mohsin (17737)");
            l12.setForeground(new Color(47, 79, 79));
            l12.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l12.setBounds(70, 440, 600, 34);
            contentPane.add(l12);
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


