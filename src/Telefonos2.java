import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static String numerosTelefono (Map<String, String>) {
        Map<String, String> telefonos = new HashMap<String, String>();
        telefonos.put("Ana", "623988933");
        telefonos.put("Rodolfo", "635358689");
        telefonos.put("Pedro", "665356687");
        telefonos.put("Soraya", "655356689");

        System.out.println("Introduce un contacto");
        Scanner sc = new Scanner(System.in);
        String contacto = sc.next();

        if (telefonos.containsKey(contacto)) {
            System.out.println("El teléfono del contacto es: " + telefonos.get(contacto));
        } else {
            System.out.println("No se encuentra el contacto");




        System.out.println("Introduce un contacto");
        Scanner sc = new Scanner(System.in);
        String contacto = sc.next();

        if (telefonos.containsKey(contacto)) {
            System.out.println("El teléfono del contacto es: " + telefonos.get(contacto));
        } else {
            System.out.println("No se encuentra el contacto");

        }
    }
    public static String contiene (Map<String, String> contiene, String contacto) {
        return contiene.get(contacto);
    }

    public static void contacto (Map<String, String >) {
        HashMap<String, ArrayList<String>> telefonos = new HashMap<>();

    }
    }
