package Gaming;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class employe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employe frame = new employe();
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
	public employe() {
		setTitle("Worker Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 491);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 0, 153)));
		panel.setBounds(0, 0, 770, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 255));
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 153)));
		panel_1.setBounds(73, 27, 633, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Melio Administration Panel");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 613, 40);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
	            dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		btnNewButton.setBounds(130, 197, 173, 52);
		panel.add(btnNewButton);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		btnFinance.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		btnFinance.setBounds(451, 197, 173, 52);
		panel.add(btnFinance);
		
		
	}
}