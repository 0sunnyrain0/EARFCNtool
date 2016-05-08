package view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JSpinner;

import javax.swing.SpinnerNumberModel;

import control.Control;
/**
 * this is the main class of EARFCN Calculate 
 * the main view side is in this class
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */

public class EARFCNtool extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6354280469509681127L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EARFCNtool frame = new EARFCNtool();
					
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
	public EARFCNtool() {
		setTitle("Earfcn Caculator @author Liujia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 438);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  Please enter the downlink EARFCN or Band!");
		lblNewLabel_1.setBounds(0, 10, 282, 42);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel =  new JPanel();
		panel.setBounds(0, 52, 563, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("EARFCN");
		lblNewLabel_2.setBounds(10, 19, 95, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mode");
		lblNewLabel_3.setBounds(10, 75, 95, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Downlink EARFCN");
		lblNewLabel_4.setBounds(10, 140, 117, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Uplink EARFCN");
		lblNewLabel_5.setBounds(10, 210, 95, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Band");
		lblNewLabel_6.setBounds(271, 19, 95, 20);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7= new JLabel("Downlink Frequency(MHz)");
		lblNewLabel_7.setBounds(271, 75, 182, 20);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Uplink Frequency(MHz)");
		lblNewLabel_8.setBounds(271, 140, 144, 20);
		panel.add(lblNewLabel_8);
		textField_1 = new JTextField();
		textField_1.setBounds(137, 75, 90, 20);
		panel.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 140, 90, 20);
		panel.add(textField_2);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 210, 90, 20);
		panel.add(textField_3);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(463, 75, 90, 20);
		panel.add(textField_4);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(463, 140, 90, 20);
		panel.add(textField_5);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		final JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(463, 19, 90, 20);
		panel.add(spinner_1);
		//spinner_1.setEnabled(false);
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 46589, 1);
		final JSpinner spinner = new JSpinner(model);
		spinner.setBounds(137, 19, 90, 20);
		panel.add(spinner);
        
		 ChangeListener listener = new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		        //SpinnerModel source = (SpinnerModel)e.getSource();
		       // System.out.println("The value is: " + source.getValue());
		    	  if(Control.caculatemode((int) spinner.getValue()).equals("errorearfcn"))
				    {ErrorEarfcn dialog = new ErrorEarfcn();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				    }
					else
					{textField_1.setText(Control.caculatemode((int) spinner.getValue()));
					textField_2.setText(String.valueOf(Control.downearfcn((int) spinner.getValue())));
					textField_3.setText(String.valueOf(Control.upearfcn((int) spinner.getValue())));
					textField_4.setText(String.valueOf(Control.downfrequency((int) spinner.getValue())));
					textField_5.setText(String.valueOf(Control.upfrequency((int) spinner.getValue())));
				    spinner_1.setValue(Control.band((int) spinner.getValue()));
					}
		      }
		    };
		
		    model.addChangeListener(listener);

	
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(463, 264, 90, 35);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(Control.caculatemode((int) spinner.getValue()).equals("errorearfcn"))
			    {ErrorEarfcn dialog = new ErrorEarfcn();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			    }
				else
				{textField_1.setText(Control.caculatemode((int) spinner.getValue()));
				textField_2.setText(String.valueOf(Control.downearfcn((int) spinner.getValue())));
				textField_3.setText(String.valueOf(Control.upearfcn((int) spinner.getValue())));
				textField_4.setText(String.valueOf(Control.downfrequency((int) spinner.getValue())));
				textField_5.setText(String.valueOf(Control.upfrequency((int) spinner.getValue())));
			    spinner_1.setValue(Control.band((int) spinner.getValue()));
				}
			}
		});
		
	
	
	
	}
}
