package zooAnimales;
import java.util.*;
public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public Ave(){
		listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public String getColorPlumas(){
		return colorPlumas;
	}
	public String movimiento(){
		return "volar";
	}
	public static int cantidadAves(){
		return listado.size();
	}
	public static void crearHalcon(String nombreHalcon, int edadHalcon, String generoHalcon){
		String colorPlumas = "cafe glorioso";
		String habitat = "montanas";
		halcones = halcones + 1;
		Ave instanciaHalcon = new Ave(nombreHalcon, edadHalcon, habitat, generoHalcon, colorPlumas);
	}
	public static void crearAguila(String nombreAguila, int edadAguila, String generoAguila){
		aguilas = aguilas + 1;
		String colorPlumas = "blanco y amarillo";
		String habitat = "montanas";
		Ave instanciaAguila = new Ave(nombreAguila, edadAguila, habitat, generoAguila, colorPlumas);
	}
}
