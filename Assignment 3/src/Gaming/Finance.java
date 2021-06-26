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

import Gaming.Employee;

import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField utility;
	private JTextField advertise;
	private JTextField prize;
	private JTextField wage;
	private JTextField travelIncome;
	private JTextField merch;
	private JTextField incomesum;
	private JTable table;
	private JTextField expensesum;
	private JTextField textField_9;
	
	double totalincome, totalexpense, netincome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setTitle("Finance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1053, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 204, 153)));
		panel.setBounds(0, 21, 1039, 525);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(51, 204, 153)));
		panel_1.setBackground(new Color(204, 255, 153));
		panel_1.setBounds(21, 27, 983, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Finance ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 11, 963, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(51, 204, 153)));
		panel_1_1.setBackground(new Color(204, 255, 153));
		panel_1_1.setBounds(21, 110, 252, 304);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Utility Fee");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 49, 62, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ads Fee");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 73, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Prize Budget");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(20, 97, 72, 14);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Registration Income");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 157, 82, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Merch sale");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 181, 82, 23);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("total Income");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(20, 215, 72, 14);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		utility = new JTextField();
		utility.setFont(new Font("Tahoma", Font.BOLD, 11));
		utility.setBounds(100, 46, 127, 20);
		panel_1_1.add(utility);
		utility.setColumns(10);
		
		advertise = new JTextField();
		advertise.setFont(new Font("Tahoma", Font.BOLD, 11));
		advertise.setColumns(10);
		advertise.setBounds(100, 70, 127, 20);
		panel_1_1.add(advertise);
		
		prize = new JTextField();
		prize.setFont(new Font("Tahoma", Font.BOLD, 11));
		prize.setColumns(10);
		prize.setBounds(100, 94, 127, 20);
		panel_1_1.add(prize);
		
		travelIncome = new JTextField();
		travelIncome.setFont(new Font("Tahoma", Font.BOLD, 11));
		travelIncome.setColumns(10);
		travelIncome.setBounds(100, 154, 127, 20);
		panel_1_1.add(travelIncome);
		
		merch = new JTextField();
		merch.setFont(new Font("Tahoma", Font.BOLD, 11));
		merch.setColumns(10);
		merch.setBounds(100, 182, 127, 20);
		panel_1_1.add(merch);
		
		incomesum = new JTextField();
		incomesum.setEditable(false);
		incomesum.setFont(new Font("Tahoma", Font.BOLD, 11));
		incomesum.setColumns(10);
		incomesum.setBounds(100, 212, 127, 20);
		panel_1_1.add(incomesum);
		
		wage = new JTextField();
		wage.setFont(new Font("Tahoma", Font.BOLD, 11));
		wage.setColumns(10);
		wage.setBounds(100, 124, 127, 20);
		panel_1_1.add(wage);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Wages");
		lblNewLabel_1_2_2.setBounds(20, 121, 62, 26);
		panel_1_1.add(lblNewLabel_1_2_2);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("total Expense");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(10, 245, 82, 14);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		expensesum = new JTextField();
		expensesum.setEditable(false);
		expensesum.setFont(new Font("Tahoma", Font.BOLD, 11));
		expensesum.setColumns(10);
		expensesum.setBounds(100, 242, 127, 20);
		panel_1_1.add(expensesum);
		
		JLabel lblNewLabel_1_4 = new JLabel("Month");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(20, 20, 62, 14);
		panel_1_1.add(lblNewLabel_1_4);
		
		JComboBox cbMonth = new JComboBox();
		cbMonth.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov ", "Dec"}));
		cbMonth.setBounds(100, 17, 127, 23);
		panel_1_1.add(cbMonth);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(51, 204, 153)));
		panel_1_2.setBackground(new Color(204, 255, 153));
		panel_1_2.setBounds(21, 426, 983, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(utility.getText());
			    double num2 = Double.parseDouble(advertise.getText());
			    double num3 = Double.parseDouble(prize.getText());
			    double num4 = Double.parseDouble(wage.getText());
			    double num5 = Double.parseDouble(travelIncome.getText());
			    double num6 = Double.parseDouble(merch.getText());
			    
			    totalexpense = num1 + num2 + num3 + num4;
			    totalincome = num5 + num6;
			    
			    String s1 = String.valueOf(totalexpense);
			    String s2 = String.valueOf(totalincome);
			    
				incomesum.setText(s2);
				expensesum.setText(s1);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						cbMonth.getSelectedItem(),
						utility.getText(),
						advertise.getText(),
						prize.getText(),
						wage.getText(),
						travelIncome.getText(),
						merch.getText(),
						incomesum.getText(),
						expensesum.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
				
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(23, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utility.setText("");
				advertise.setText("");
				prize.setText("");
				travelIncome.setText("");
				wage.setText("");				
				merch.setText("");
				incomesum.setText("");
				expensesum.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(196, 23, 146, 38);
		panel_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(584, 23, 146, 38);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("BACK");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					employe frame = new employe();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(793, 23, 146, 38);
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
		btnPrint.setBounds(387, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(51, 204, 153)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 110, 732, 256);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 2, 2);
		panel_1_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 712, 236);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Utility", "Ads", "PrizeBudget", "Wages", "Registration Income", "Merch Sales", "Total Income", "Total Expense"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\\\Users\\\\ASUS\\\\eclipse-workspace\\\\Finance");
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
		btnUpload.setBounds(789, 376, 146, 38);
		panel.add(btnUpload);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("NetIncome");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_2.setBounds(283, 376, 110, 38);
		panel.add(lblNewLabel_1_2_1_2);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(383, 376, 167, 38);
		panel.add(textField_9);
		
		JButton btnCalNet = new JButton("Cal Net");
		btnCalNet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempincome = 0,tempexpense = 0;
                DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 7));
			        String s1 = String.valueOf(model.getValueAt(i, 8));
			        
			        tempincome += Double.parseDouble(s); 
			        tempexpense += Double.parseDouble(s1);
			        
			        netincome = tempincome - tempexpense;
			        String ni = String.valueOf(netincome);
			        textField_9.setText(ni);
			    }
			}
		});
		btnCalNet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalNet.setBounds(587, 376, 146, 38);
		panel.add(btnCalNet);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1039, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Home");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About Company");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground frame = new CompanyBackground();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Logout");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login home = new Login();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu = new JMenu("Product");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ProductDescription");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Advertisement");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}