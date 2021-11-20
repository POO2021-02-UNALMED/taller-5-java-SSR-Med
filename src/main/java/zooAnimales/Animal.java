package zooAnimales;
import gestion.*;
public class Animal{
	private int totalAnimales = Mamifero.cantidadMamiferos() + Ave.cantidadAves() + Reptil.cantidadReptiles() + Pez.cantidadPeces() + Anfibio.cantidadAnfibios();
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	private Zona zona;
	public Animal(){

	}
	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;

	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public String getHabitat(){
		return habitat;
	}
	public String getGenero(){
		return genero;
	}
	public String toString(){
		if(zona != null){
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " +  zona.getNombre() + ", en el " + zona.getZoo().getNombre();
		}
		else{
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;  
		}
	}
	public String movimiento(){
		return "desplazarse";
	}
	public static String totalPorTipo(){
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+"\n" + "Aves: " + Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n"+ "Anfibios: " + Anfibio.cantidadAnfibios();
	}
}
