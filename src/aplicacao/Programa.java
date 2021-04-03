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
			System.out.println("ATEN��O:");
			System.out.println("singleton1 e singleton2" + " se referem a mesma inst�ncia de Singleton\n");
			System.out.println("singleton1: " + sing1.hashCode() + 
					"\nsingleton2: " + sing2.hashCode());
		}
	}
	
}
