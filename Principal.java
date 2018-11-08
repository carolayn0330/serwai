package com.acc.serwai;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//Creación del objeto persona y sus atributos
		
		Persona p1 = new Persona(); 
		p1.id = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificación: ")));
		p1.nombre= (JOptionPane.showInputDialog("Ingrese nombre: "));
		p1.ocupacion= (JOptionPane.showInputDialog("Ingrese la ocupacion: "));
		
		//Creación del objeto deporte  y sus atributos
		
		Deporte D1 = new Deporte();
		D1.nombre = (JOptionPane.showInputDialog("Ingrese el nombre del deporte: "));
		D1.escenario = (JOptionPane.showInputDialog("Ingrese escenario: "));
		D1.numJugadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Jugadores: "));
		
		//Creación del objeto gimnasio y sus atributos
		Gimnasio g1 = new Gimnasio();
		g1.nombre = (JOptionPane.showInputDialog("Ingrese el nombre del GYM:"));
		g1.direccion = (JOptionPane.showInputDialog("Ingrese la direccion:"));
		g1.tel = (JOptionPane.showInputDialog("Ingrese el telefono del GYM"));
		

		
		

	}

}
