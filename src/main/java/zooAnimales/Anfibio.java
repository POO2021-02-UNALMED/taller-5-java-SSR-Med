package zooAnimales;
import java.util.*;
public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio(){
		listado.add(this);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	public String getColorPiel(){
		return colorPiel;
	}
	public boolean isVenenoso(){
		return venenoso;
	}
	public String movimiento(){
		return "saltar";
	}
	public static int cantidadAnfibios(){
		return listado.size();
	}
	public static Anfibio crearRana(String nombreRana, int edadRana, String generoRana){
		ranas = ranas +1;
		String colorPiel = "rojo";
		boolean venenoso = true;
		String habitat = "selva";
		return new Anfibio(nombreRana,edadRana,habitat,generoRana,colorPiel,venenoso);
	}
	public static Anfibio crearSalamandra(String nombreSalamandra, int edadSalamandra, String generoSalamandra){
		salamandras = salamandras + 1;
		String colorPiel = "negro y amarillo";
		boolean venenoso = false;
		String habitat = "selva";
		return new Anfibio(nombreSalamandra,edadSalamandra, habitat, generoSalamandra,colorPiel, venenoso);
	}
}
