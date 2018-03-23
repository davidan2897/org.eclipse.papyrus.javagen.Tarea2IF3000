package Tarea2IF3000;

import java.util.spi.TimeZoneNameProvider;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {
	

	public static void main(String[] args) {
	
   
		String nombreUnico="",contraseña="",nombre="",tipoIdentificacion="", nomLibro = "", autorLibro="",libro="";
		int identificacion=0;
		
		
    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema Virtual de la Biblioteca");
	 
			JFrame frame1 = new JFrame("");
			String[] acciones = { "Agregar", "Quitar", "Modificar" };
			
			String tipoAccion = (String) JOptionPane.showInputDialog(frame1,
		        "¿Que tipo de accion desea realizar ?",
		        "Biblioteca",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        acciones, 
		        acciones[0]);
			
	
		JFrame frame2 = new JFrame("");
		String[] objetos = { "Libros", "Usuarios", "Autores" };
		
		String tipoObjeto = (String) JOptionPane.showInputDialog(frame2,
	        "¿Que objeto desea gestionar ?",
	        "Biblioteca",
	        JOptionPane.QUESTION_MESSAGE, 
	        null, 
	        objetos, 
	        objetos[0]);
		
	
		if(tipoAccion.equalsIgnoreCase("Agregar") && (tipoObjeto.equalsIgnoreCase("Autores"))) {	
			nombreUnico=	JOptionPane.showInputDialog(null,"Ingrese nombre unico para Autor");
			nombre=	JOptionPane.showInputDialog(null,"Ingrese nombre del Autor");
			
			contraseña=	JOptionPane.showInputDialog(null,"Ingrese contraseña \n Siga el siguiente patron (md5) ");
			
			
			JFrame frame3 = new JFrame("");
			String[] tipoID = { "Cedula", "Pasaporte"};
			
		   tipoIdentificacion = (String) JOptionPane.showInputDialog(frame3,
		        "¿Tipo identificacion ?",
		        "Biblioteca",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        tipoID, 
		        tipoID[0]);
		   identificacion=	Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de identificacion "));
			
			Autor autor = new Autor(nombreUnico, contraseña, nombre, tipoIdentificacion, identificacion);
			Autor au = autor;
		  autor.ListaAutores(au);
		}//fin if Agregar && Autores
		
		if(tipoAccion.equalsIgnoreCase("Agregar") && (tipoObjeto.equalsIgnoreCase("Usuarios"))) {
			nombreUnico=	JOptionPane.showInputDialog(null,"Ingrese nombre unico para usuario");
			nombre=	JOptionPane.showInputDialog(null,"Ingrese su nombre completo");
			
			contraseña=	JOptionPane.showInputDialog(null,"Ingrese contraseña \n Siga el siguiente patron (md5) ");
			
			
			JFrame frame3 = new JFrame("");
			String[] tipoID = { "Cedula", "Pasaporte"};
			
		   tipoIdentificacion = (String) JOptionPane.showInputDialog(frame3,
		        "¿Tipo identificacion ?",
		        "Biblioteca",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        tipoID, 
		        tipoID[0]);
		   identificacion=	Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de identificacion "));
			
		   Usuario usuario = new Usuario(nombreUnico, contraseña, nombre, tipoIdentificacion, identificacion);
			Usuario us = usuario;
		usuario.ListaUsuarios(us);
			
		}
			if(tipoAccion.equalsIgnoreCase("Agregar") && (tipoObjeto.equalsIgnoreCase("Libros"))) {
			 nomLibro=JOptionPane.showInputDialog(null,"Ingrese el nombre del libro");
			 autorLibro = JOptionPane.showInputDialog(null,"Ingrese el nombre del autor del libro");
			 libro= "Nombre : "+nomLibro+" Autor :"+autorLibro;
					 Bibliotecario bl = new Bibliotecario(nombreUnico, contraseña, nombre, tipoIdentificacion, identificacion);
				bl.ListaLibros(libro);
			}
			
			
			
			
			
		
		}
		}
	


	


