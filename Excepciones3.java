import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Excepciones3 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        String fechaStr = "31/05/2023";

        try {
            date = dateFormat.parse(fechaStr);
            System.out.println("Fecha  : " + date);
        } catch (ParseException e) {
            System.out.println("Error al resultado de la fecha: " + fechaStr);
            e.printStackTrace();
        }
    }
}


