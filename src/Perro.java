
public class Perro extends Animal{
	// Hereda del padre Animal
	
	// Constructor de la clase Perro
	Perro(String nombre, int edad)
	{
	super(nombre, edad);
	}
	
	// Metodo especial para ladrar
	void ladrar()
	{
		System.out.println("WOOF WOOF!!");
	}
	
	
}
