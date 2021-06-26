package Gaming;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Register extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 847, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(21, 27, 791, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Registration System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(62, 11, 704, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(21, 111, 252, 304);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ref Num");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 27, 62, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 52, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(20, 77, 62, 14);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(20, 102, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Postcode");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(20, 127, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telephone");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(20, 152, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ic No.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(20, 183, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Prove ID");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(20, 208, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(100, 24, 127, 20);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 49, 127, 20);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 77, 127, 20);
		panel_1_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 102, 127, 20);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 127, 127, 20);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(100, 152, 127, 20);
		panel_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(100, 180, 127, 20);
		panel_1_1.add(textField_6);
		
		JComboBox cabProveID = new JComboBox();
		cabProveID.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "IC Number", "Passport Number"}));
		cabProveID.setFont(new Font("Tahoma", Font.BOLD, 11));
		cabProveID.setBounds(98, 202, 129, 20);
		panel_1_1.add(cabProveID);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(new Color(176, 224, 230));
		panel_1_2.setBounds(21, 426, 791, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
						cabProveID.getSelectedItem(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
				
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				cabProveID.setSelectedItem("Make a selection");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(166, 23, 146, 38);
		panel_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(479, 23, 146, 38);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("HOME");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to back", "Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Menu frame = new Menu();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(635, 23, 146, 38);
		panel_1_2.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(326, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 111, 529, 241);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 509, 224);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref Num", "First Name", "Surname", "Address", "Postcode", "Telephone", "Date_Reg", "Prove ID"
			}
		));
		
		
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\Register");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBounds(463, 363, 146, 38);
		panel.add(btnUpload);
	}
}
