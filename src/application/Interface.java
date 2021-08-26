package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField txtaltura;
	private JTextField txtpeso;
	
	NumberFormat formatter = new DecimalFormat("#0.00");
	private JTextField txtimc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 297);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitulo = new JLabel("CALCULE SEU IMC");
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		lbltitulo.setBounds(10, 11, 169, 58);
		contentPane.add(lbltitulo);
		
		JLabel lblpeso = new JLabel("Peso");
		lblpeso.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblpeso.setBounds(10, 121, 76, 24);
		contentPane.add(lblpeso);
		
		
		txtaltura = new JTextField();
		txtaltura.setBounds(86, 83, 76, 20);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblaltura.setBounds(10, 80, 66, 24);
		contentPane.add(lblaltura);
		
		txtpeso = new JTextField();
		txtpeso.setColumns(10);
		txtpeso.setBounds(86, 124, 76, 20);
		contentPane.add(txtpeso);
		
		JButton botao = new JButton("Calcular");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double imc = Double.parseDouble(txtpeso.getText()) / (Math.pow(Double.parseDouble(txtaltura.getText()), 2));
				txtimc.setText(formatter.format(imc));
			}
		});
		botao.setBackground(UIManager.getColor("Button.darkShadow"));
		botao.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		botao.setBounds(56, 219, 92, 28);
		contentPane.add(botao);
		
		JLabel lblimc = new JLabel("IMC");
		lblimc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblimc.setBounds(10, 156, 66, 24);
		contentPane.add(lblimc);
		
		txtimc = new JTextField();
		txtimc.setEditable(false);
		txtimc.setBounds(86, 158, 76, 23);
		contentPane.add(txtimc);
		txtimc.setColumns(10);
		
		}
			
		
	}

