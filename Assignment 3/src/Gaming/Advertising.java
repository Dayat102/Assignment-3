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

public class Advertising extends JDialog {

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
	public Advertising() {
		setTitle("Promotion ahead!");
		setBounds(100, 100, 1141, 445);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		
		JTextArea txtronlineAdvertisementgiveaway = new JTextArea();
		txtronlineAdvertisementgiveaway.setEditable(false);
		txtronlineAdvertisementgiveaway.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
		txtronlineAdvertisementgiveaway.setText("===============================ONLINE ADVERTISEMENT==================================\r\n\r\n**********************************GIVEAWAY EVENT***************************************\r\n\r\nOur company is helding a GIVEAWAY event!!!\r\n\r\nYou will have the chance to win one of our limited skin hero for free by following these 3 steps:\r\n\r\n1. Give a Like and turn on special notification our page! \r\n2. Like & share this post on public!\r\n3. Tag 3 of your friends in comment and say why you want to win this giveaway!\r\n\r\nOur prize of giveaway worth around RM500, including random skin epic hero, 10 000 diamond, and much more! Visit Melio.com to find out more prizes!\r\n\r\nThis event will end in 22 July 2021, time is running up! Hurry up so that you dont miss your chance of winning prizes!");
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