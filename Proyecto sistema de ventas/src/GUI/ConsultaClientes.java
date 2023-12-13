package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ConsultaClientes extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblDni;
	private JTextField textField;
	private JButton btnBuscar;
	private JLabel lblNombre;
	private JTextField textField_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaClientes frame = new ConsultaClientes();
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
	public ConsultaClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("CONSULTA CLIENTES");
		lblNewLabel.setBounds(184, 11, 183, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(21, 64, 46, 20);
		contentPane.add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(93, 64, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(363, 57, 89, 35);
		contentPane.add(btnBuscar);
		
		lblNombre = new JLabel("Cliente");
		lblNombre.setBounds(21, 117, 66, 14);
		contentPane.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 114, 400, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 152, 508, 238);
		contentPane.add(scrollPane);
	}
}
