import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Principal {

    public static String getTime() {
        
      LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        return ahora.format(format);
    }

    public static void main(String[] args) {
        System.out.println("Fecha y hora: " + getTime());
    }
}

