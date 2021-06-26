package Gaming;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class CompanyBackground extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CompanyBackground dialog = new CompanyBackground();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CompanyBackground() {
		setTitle("About Company");
		setBounds(100, 100, 892, 438);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				JTextArea txtrNameOfCompany = new JTextArea();
				txtrNameOfCompany.setEditable(false);
				txtrNameOfCompany.setFont(new Font("Monospaced", Font.BOLD, 17));
				txtrNameOfCompany.setText("Name of company: Meliodas Enterprise\r\nName of CEO: Hidayat Ibrahim\r\nYear Established: 2021\r\nWebsite: www.melio.com\r\nAdress: Lot G-10, Menara Amanah Ikhtiar,\r\n             Jalan Cempaka SD 12/1A,\r\n             Bandar Sri Damansara, PJU 9,\r\n             52200 Kuala Lumpur          \r\n\r\nContact the following if you need any inquiry:\r\nTel no/Fax: +03-46654432\r\nEmail: melio@gmail.com");
				scrollPane.setViewportView(txtrNameOfCompany);
			}
		}
	}
}