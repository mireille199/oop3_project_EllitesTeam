package org.iuea.oop.view;

/*THE ELLITES
 *  MUGALAASI NAJIIB 18/UG/496/BSSE-S
 * RUGENDABANGA MIREILLE SIFA 18/879/BIT
 * MIREMBE CAROLYNE SANDRA 18/UG/467/BIT-S
 * MUGABI MARK MARVIN 18/UG/487/BIT-S
 * INGABIRE RACHAEL 18/UG/899/BIT-S
 * Abdraziz Farah Ali 18/1190/BSSE-S */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LoginView {

	public LoginView() {
		 JFrame aWindow = new JFrame("Students Information System");
		aWindow.setBounds(400, 200, 650, 400 );
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel bottomPanel = new JPanel();//Creates JPanel to hold the button to window
		bottomPanel.setBackground(Color.GRAY);//Sets the background color of the JPanel
		
		JLabel wndwLabel;
		JPanel welcome = new JPanel();
		welcome.add(wndwLabel = new JLabel("IUEA STUDENTS INFORMATION SYSTEM"));
		welcome.add(new JLabel("CopyRighted By: The_ELLITES_TEAM"));
		
		wndwLabel.setForeground(Color.ORANGE);
		wndwLabel.setFont(new Font("Arial",Font.TRUETYPE_FONT,30));
		
		JButton button;//Creates a button called button
		bottomPanel.add(button = new JButton("CLICK TO LOGIN !"));
		button.setFont(new Font("SansSerif", Font.BOLD, 12));
		button.addActionListener(
                new ActionListener(){//ADDs an actionListener to the button when its Clicked
                    public void actionPerformed(ActionEvent e) {//Gives the button a specific action when its clicked
                    	//When the button is clicked an object that holds methods to create a login menu is called.
                        LoginDialog loginDlg = new LoginDialog(aWindow);
                        loginDlg.setVisible(true);//It sets the login menu to be visible
                    }
                });
		
		Container content = aWindow.getContentPane(); // Get content pane
		content.setLayout(new BorderLayout()); // Set border layout manager
		content.add(bottomPanel, BorderLayout.SOUTH);//Adds the JPanel called bottomPanel which holds the JButton called button to the Container
		content.add( welcome, BorderLayout.CENTER);
	
		aWindow.getContentPane().setBackground(Color.GRAY);//Sets the Background Color to Gray
		aWindow.setVisible(true);//Sets the aWindow to be seen
 }

	public void setVisible(boolean b) {
		return;
		
	}

}
