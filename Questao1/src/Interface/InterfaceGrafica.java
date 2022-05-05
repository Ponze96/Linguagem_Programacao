package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InterfaceGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField TxtID;
	private JTextField TxtClasse;
	private JTextField TxtTag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
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
	public InterfaceGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Qtde de seletores IDs");
		lblNewLabel.setBounds(10, 53, 174, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qtde de seletores Classes");
		lblNewLabel_1.setBounds(10, 78, 174, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qtde de seletores Tags");
		lblNewLabel_2.setBounds(10, 102, 140, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCalcular = new JButton("Calcular ");
		btnCalcular.setBounds(169, 171, 89, 23);
		contentPane.add(btnCalcular);
			JLabel txtIDs = null;
			int ids = Integer.parseInt(txtIDs.getText());
			int classe = Integer.parseInt(TxtClasse.getText());
			int tags = Integer.parseInt(TxtTag.getText());
			
			int idsNew = ids * 100;
			int classeNew = classe * 10;
			int tagsNew = tags * 1;
			
			int btnCalc = idsNew + classeNew + tagsNew;
			
			JOptionPane.showMessageDialog(null, "A quantidade total de pontos é de: "+btnCalc);
			
		
		
		TxtID = new JTextField();
		TxtID.setBounds(134, 50, 163, 20);
		contentPane.add(TxtID);
		TxtID.setColumns(10);
		
		TxtClasse = new JTextField();
		TxtClasse.setBounds(144, 78, 153, 20);
		contentPane.add(TxtClasse);
		TxtClasse.setColumns(10);
		
		TxtTag = new JTextField();
		TxtTag.setBounds(134, 103, 163, 20);
		contentPane.add(TxtTag);
		TxtTag.setColumns(10);
	}
}
