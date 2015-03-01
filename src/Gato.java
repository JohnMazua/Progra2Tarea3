
public class Gato extends Animal{
	// Hereda del padre Animal
	
	// Constructor de la clase Gato
	Gato(String nombre, int edad)
	{
	super(nombre, edad);
	}
	
	// Metodo especial para maullar
	void maullar()
	{
		System.out.println("MEOW!!");
	}
	
}