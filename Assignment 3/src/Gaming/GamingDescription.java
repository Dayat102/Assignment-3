package Gaming;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class GamingDescription extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Advertising dialog = new Advertising();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GamingDescription() {
		setTitle("Gaming Description");
		setBounds(100, 100, 1009, 429);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		JTextArea txtronlineAdvertisementgiveaway = new JTextArea();
		txtronlineAdvertisementgiveaway.setEditable(false);
		txtronlineAdvertisementgiveaway.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		txtronlineAdvertisementgiveaway.setText("==============================GAMING DESCRIPTION=================================\r\n\r\n****************************************************************************************\r\n*                                                                                                                                                              *\r\n*                                       WELCOME TO MAGIC CHESS TOURNAMENT                                    * \r\n*                            OPEN TO ALL REGARDLESS OF GENDER AND ALSO AGE                          * \r\n*                                                   FEE : RM 200 PER PERSON                                                            *\r\n*                                                         TIME: 22 JULY 2021                                                                   *\r\n*                                                                                                                                                              *\r\n****************************************************************************************\r\n");
		scrollPane.setViewportView(txtronlineAdvertisementgiveaway);
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
	}
}