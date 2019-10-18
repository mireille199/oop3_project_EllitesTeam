package org.iuea.oop.view;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ellites_Main {
	private JFrame inforWindow;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField course;
	private JTextField reg;
	private JPanel mainPane;
	private JButton btnStudents,btnCourse,btnCourseUnits,btnLectures, 
					btnSubmit,btnDelete,btnUpdate,btnCancel,btnAdd,btnEdit;
	private JLabel lblFirstName,lblLastName,lblSex,lblCourse,lblRegister,footer;
	private JComboBox gender;
	
	public Ellites_Main() {
		 inforWindow = new JFrame("THE ELLITES INFORMATION SYSTEM");
		 inforWindow.setBounds(400, 200, 720, 520 );
		 inforWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 inforWindow.setLocationRelativeTo(null);
		 inforWindow.getContentPane().setLayout(null);
		 inforWindow.getContentPane().setBackground(Color.WHITE);//Sets the Background Color to Gray
		 inforWindow.setVisible(true);//Sets the aWindow to be seen
		
		footer = new JLabel("\"CopyRighted By: The_ELLITES_TEAM\"");
		footer.setFont(new Font("SansSerif", Font.BOLD, 13));
		footer.setHorizontalAlignment(SwingConstants.CENTER);
		footer.setBounds(0, 424, 697, 27);
		
		btnStudents = new JButton("Students");
		btnStudents.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnStudents.setBounds(-5, -3, 115, 40);
		
		btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnCourse.setBounds(-5, 32, 115, 40);
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnCourse.hasFocus()) {
					btnStudents.setBackground(UIManager.getColor("menu"));
					btnStudents.setForeground(null);
				} else {					
				}      
			}
		});
		btnCourseUnits = new JButton("Course Units");
		btnCourseUnits.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnCourseUnits.setBounds(-5, 67, 115, 40);
		
		btnLectures = new JButton("Lectures");
		btnLectures.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnLectures.setBounds(-5, 102, 115, 40);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 424, 697, 2);
		
		mainPane = new JPanel();
		mainPane.setBackground(Color.WHITE);
		mainPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		mainPane.setBounds(109, 13, 581, 413);
		
		mainPane.setLayout(null);
		
			}
}

	