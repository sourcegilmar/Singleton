package aplicacao;

import javax.swing.JOptionPane;

import entidades.Singleton;

public class Programa {

	public static void main(String[] args) {
		Singleton sing1;
		Singleton sing2;

		sing1 = Singleton.getSingletonInstance();
		sing2 = Singleton.getSingletonInstance();

		if (sing1.equals(sing2)) {
			JOptionPane.showMessageDialog(null,
					"ATEN��O!" + "equals >> singleton1 e singleton2" + "se referem a mesma inst�ncia de Singleton");
			System.out.println("singleton1 " + sing1.hashCode() + " e singleton2 " + sing2.hashCode()
					+ " se referem a mesma inst�ncia de Singleton");
		}
	}
	
}
