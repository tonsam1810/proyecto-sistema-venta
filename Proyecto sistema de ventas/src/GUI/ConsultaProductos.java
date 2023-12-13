package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ConsultaProductos extends JFrame {

	private JPanel contentPane;
	private JLabel lblSku;
	private JTextField textField;
	private JButton btnBuscar;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblEstado;
	private JLabel lblDepto;
	private JLabel lblLinea;
	private JLabel lblProcedencia;
	private JLabel lblStock;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblProved;
	private JLabel lblMarca;
	private JTextField textField_10;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProductos frame = new ConsultaProductos();
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
	public ConsultaProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSku = new JLabel("Producto");
		lblSku.setBounds(20, 78, 67, 20);
		contentPane.add(lblSku);
		
		textField = new JTextField();
		textField.setBounds(86, 78, 73, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(169, 72, 86, 33);
		contentPane.add(btnBuscar);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(265, 78, 373, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(86, 153, 211, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(86, 184, 211, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(86, 246, 211, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(86, 215, 211, 20);
		contentPane.add(textField_5);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(20, 153, 46, 20);
		contentPane.add(lblEstado);
		
		lblDepto = new JLabel("Depto.");
		lblDepto.setBounds(20, 187, 46, 14);
		contentPane.add(lblDepto);
		
		lblLinea = new JLabel("Linea");
		lblLinea.setBounds(20, 218, 46, 14);
		contentPane.add(lblLinea);
		
		lblProcedencia = new JLabel("Proced.");
		lblProcedencia.setBounds(20, 249, 46, 14);
		contentPane.add(lblProcedencia);
		
		lblStock = new JLabel("Stock");
		lblStock.setBounds(330, 218, 46, 14);
		contentPane.add(lblStock);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(396, 215, 230, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(396, 184, 230, 20);
		contentPane.add(textField_9);
		
		lblProved = new JLabel("Proved.");
		lblProved.setBounds(330, 187, 46, 14);
		contentPane.add(lblProved);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(330, 153, 46, 20);
		contentPane.add(lblMarca);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(396, 153, 230, 20);
		contentPane.add(textField_10);
		
		lblNewLabel = new JLabel("CONSULTA PRODUCTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(244, 11, 178, 28);
		contentPane.add(lblNewLabel);
	}
}
