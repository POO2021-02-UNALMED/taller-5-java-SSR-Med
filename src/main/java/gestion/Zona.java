package gestion;
import zooAnimales.*;
import java.util.*;
public class Zona{
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	public Zona(){

	}
	public Zona(String nombre,Zoologico zoo){
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public String getNombre(){
		return nombre;
	}
	public Zoologico getZoo(){
		return zoo;
	}
	public void agregarAnimales(Animal animal){
		animales.add(animal);
	}
	public int cantidadAnimales(){
		return animales.size();
	}
}
