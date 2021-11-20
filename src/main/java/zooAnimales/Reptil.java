package zooAnimales;
import java.util.*;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil(){
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public String getColorEscamas(){
		return colorEscamas;
	}
	public int getLargoCola(){
		return largoCola;
	}
	public String movimiento(){
		return "reptar";
	}
	public static int cantidadReptiles(){
		return listado.size();
	}
	public static void crearIguana(String nombreIguana, int edadIguana, String generoIguana){
		iguanas = iguanas + 1;
		String colorEscamas = "verde";
		int largoCola = 3;
		String habitat = "humedal";
		Reptil instanciaIguana = new Reptil(nombreIguana, edadIguana,habitat,generoIguana,colorEscamas,largoCola);
	}
	public static void crearSerpiente(String nombreSerpiente, int edadSerpiente, String generoSerpiente){
		serpientes = serpientes +1;
		String colorEscamas = "blanco";
		int largoCola = 1;
		String habitat = "jungla";
		Reptil instanciaSerpiente = new Reptil(nombreSerpiente,edadSerpiente,habitat,generoSerpiente,colorEscamas,largoCola);
	}
}
