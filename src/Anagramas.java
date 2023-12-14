import java.util.List;
import java.util.Map;
import java.io.*;
import java.util.*;
public class Anagramas {
        public static void main(String[] args) {
            String[][] cadenas = {
                    {"Lama", "Alma", "Mala"},
                    {"Alegan", "Angela"},
                    {"Japones", "Esponja"}
            };
            for (String[] par : cadenas) {
                System.out.println(String.format("'%s' y '%s' son anagramas? %b", par[0], par[1], esAnagrama(par[0], par[1])));
            }
        }

        // Ordenar una cadena
        public static String ordenar(String cadena) {
            char[] caracteres = cadena.toCharArray();
            Arrays.sort(caracteres);
            return new String(caracteres);
        }


        // Anagrama
        public static boolean esAnagrama(String cadena, String posibleAnagrama) {
            // Convertir a minúsculas, remplazar signos de puntuación y remplazar vocales acentuadas
            cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
            posibleAnagrama = posibleAnagrama.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
            // Ordenar de la misma manera
            cadena = ordenar(cadena);
            posibleAnagrama = ordenar(posibleAnagrama);
            // Regresar resultado de la comparación
            return cadena.equals(posibleAnagrama);
        }
    }
