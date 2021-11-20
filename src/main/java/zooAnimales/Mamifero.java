package zooAnimales;
import java.util.*;
public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero(){
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	public boolean isPelaje(){
		return pelaje;
	}
	public int getPatas(){
		return patas;
	}
	public static int cantidadMamiferos(){
		return listado.size();
	}
	public static Mamifero crearCaballos(String nombreCaballo, int edadCaballo, String generoCaballo){
		caballos = caballos + 1;
		boolean pelaje = true;
		int patas = 4;
		String habitat = "pradera";
		return new Mamifero(nombreCaballo,edadCaballo,habitat,generoCaballo,pelaje,patas);
	}
	public static Mamifero crearLeon(String nombreLeon, int edadLeon, String generoLeon){
		boolean pelaje = true;
		int patas = 4;
		String habitat = "selva";
		leones = leones + 1;
		return new Mamifero(nombreLeon, edadLeon, habitat, generoLeon, pelaje, patas);
	}
}
