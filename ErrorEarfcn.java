package view;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
/**
 * this is the class of errorearfcn 
 * just to inform the user that the earfcn is wrong
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class ErrorEarfcn extends JDialog {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8356551308459111872L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public ErrorEarfcn() {
		setTitle("Earfcn Caculator @author Liujia");
		setBounds(100, 100, 325, 186);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Please enter the correct Downlink EARFCN!");
		lblNewLabel.setBounds(20, 10, 267, 127);
		contentPanel.add(lblNewLabel);		
	}	
}


