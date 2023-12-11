import java.util.ArrayList;

public class Alturas {
    public static int numeroAlumnos() {
        return Utilidades.leerEntero("Dime cuántos alumnos hay ");
    }

    public static ArrayList<Double> leerAlturas(int numeroAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.printf("Introduce las alturas de %d alumnos", +numeroAlumnos);
        for (int i = 1; i <= numeroAlumnos; i++) {
            alturas.add(Utilidades.leerDoble(""));
        }
        return alturas;
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);
        }
        double media;
        return media = suma / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int alumnos = 0;
        for (double altura : alturas) {
            if (altura > media) ;
            alumnos++;
        }
        return alumnos;
    }
        public static int calcularAlumnosAlturaInferior (ArrayList < Double > alturas,double media){
            int alumnos = 0;
            for (double altura : alturas) {
                if (altura > media) ;
                alumnos++;
            }
            return alumnos;
        }
    public static void mostrarResultados (ArrayList<Double> alturas, double media){
        System.out.println(alturas);
        System.out.println(calcularAlumnosAlturaInferior(alturas,media));
        System.out.println(calcularAlumnosAlturaSuperior(alturas,media));
    }
}
