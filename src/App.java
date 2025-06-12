import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando la clase Persona");
        
        Persona personaje = new Persona();
        
        personaje.nombre = "Lucas";
        personaje.apellidos = "López";
        personaje.edad = 29;

        System.out.println(personaje.nombre + " " + personaje.apellidos + " " + personaje.edad);
    }
}
