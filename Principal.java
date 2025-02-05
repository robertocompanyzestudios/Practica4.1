import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal{

  public class Usuario{
    public String nombre;
    public String apellidos;
    public String email;
  
    //Constructors
    public Usuario(String nombre, String apellidos, String email){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    }
  
  }

public static Usuario[] crearUsuarios(int numUsuarios) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[numUsuarios];

        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("Introduce la información del usuario n-" + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos usuarios quieres registrar? ");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine();

        Usuario[] usuarios = crearUsuarios(numUsuarios);

        System.out.println("\nInformación de los usuarios registrados:");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario #" + (i + 1) + ":");
            System.out.println("Nombre: " + usuarios[i].nombre);
            System.out.println("Apellidos: " + usuarios[i].apellidos);
            System.out.println("Email: " + usuarios[i].email);
            System.out.println("-------------");
        }
    }
}
