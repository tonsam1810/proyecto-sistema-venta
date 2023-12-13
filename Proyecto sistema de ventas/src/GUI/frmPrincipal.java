package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnTransacciones;
	private JMenuItem mntmVentas;
	private JMenu mnConsultas;
	private JMenuItem mntmProductos;
	private JMenuItem mntmClientes;
	private JMenuItem mntmNotasDeVenta;
	private JMenu mnMantenimiento_1;
	private JMenuItem mntmClientes_1;
	private JMenuItem mntmProductos_1;
	private JMenu mnReportes;
	private JMenuItem mntmVentas_1;
	private JMenuItem mntmProductosSinStock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnTransacciones = new JMenu("Transacciones");
		menuBar.add(mnTransacciones);
		
		mntmVentas = new JMenuItem("Ventas");
		mnTransacciones.add(mntmVentas);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mntmProductos = new JMenuItem("Productos");
		mnConsultas.add(mntmProductos);
		
		mntmClientes = new JMenuItem("Clientes");
		mnConsultas.add(mntmClientes);
		
		mntmNotasDeVenta = new JMenuItem("Notas de venta");
		mnConsultas.add(mntmNotasDeVenta);
		
		mnMantenimiento_1 = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento_1);
		
		mntmClientes_1 = new JMenuItem("Clientes");
		mnMantenimiento_1.add(mntmClientes_1);
		
		mntmProductos_1 = new JMenuItem("Productos");
		mnMantenimiento_1.add(mntmProductos_1);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mntmVentas_1 = new JMenuItem("Ventas");
		mnReportes.add(mntmVentas_1);
		
		mntmProductosSinStock = new JMenuItem("Productos sin stock");
		mnReportes.add(mntmProductosSinStock);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
