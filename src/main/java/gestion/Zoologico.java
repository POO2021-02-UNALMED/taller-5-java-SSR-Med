package gestion;
import java.util.*;
public class Zoologico{
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	public Zoologico(){

	}
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}
	public String getNombre(){
		return nombre;
	}
	public String getUbicacion(){
		return ubicacion;
	}
	public void agregarZonas(Zona zona){
		zonas.add(zona);
	}
	public int cantidadTotalAnimales(){
		int suma = 0;
		for(int i = 0; i< zonas.size();i++){
			suma = suma + zonas.get(i).cantidadAnimales();

		}
		return suma;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}
}
