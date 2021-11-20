package zooAnimales;
import java.util.*;
public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(){
		listado.add(this);
	}
	public Pez(String nombre, int edad,String habitat, String genero, String colorEscamas, int cantidadAletas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public String getColorEscamas(){
		return colorEscamas;
	}
	public int getCantidadAletas(){
		return cantidadAletas;
	}
	public String movimiento(){
		return "nadar";
	}
	public static int cantidadPeces(){
		return listado.size();
	}
	public static Pez crearSalmon(String nombreSalmon, int edadSalmon, String generoSalmon){
		salmones = salmones +1;
		String colorEscamas = "rojo";
		int cantidadAletas = 6;
		String habitat = "oceano";
		return new Pez(nombreSalmon,edadSalmon,habitat,generoSalmon,colorEscamas,cantidadAletas);
	}
	public static Pez crearBacalao(String nombreBacalao, int edadBacalao, String generoBacalao){
		bacalaos = bacalaos +1;
		String colorEscamas = "gris";
		int cantidadAletas = 6;
		String habitat = "oceano";
		return new Pez(nombreBacalao,edadBacalao,habitat,generoBacalao,colorEscamas,cantidadAletas);
	}
}
