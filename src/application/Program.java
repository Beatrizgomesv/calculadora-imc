package application;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program extends Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		NumberFormat formatter = new DecimalFormat("#0.00");
	
	
		System.out.println("Digite a sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		double imc = peso / (Math.pow(altura, 2));
		System.out.printf("IMC: " + formatter.format(imc));
		
	}

}
