import java.util.Scanner;

public class Promedio12TICS {
    public static double[] ingresar1(String nombreGrupo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos alumnos hay en el grupo " + nombreGrupo + "? ");
        int cantidad = sc.nextInt();

        double[] prom = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Alumno " + (i + 1) + " del grupo " + nombreGrupo + ": ");
            prom[i] = sc.nextDouble();
        }
        return prom;
    }

    public static double PromedioGeneral(double[] arreglo) {
        double suma = 0;
        for (double valor : arreglo) {
            suma += valor;
        }
        return suma / arreglo.length;
    }

    public static void promedioGrupal(double[] promediosGrupos) {
        String[] nombresGrupos = {"1", "2", "3", "4", "5"};
        for (int i = 0; i < promediosGrupos.length; i++) {
            System.out.println("El promedio del grupo " + nombresGrupos[i] + " es: " + promediosGrupos[i]);
        }
    }

    public static void main(String[] args) {


        double[] grupo1 = ingresar1("1");
        double[] grupo2 = ingresar1("2");
        double[] grupo3 = ingresar1("3");
        double[] grupo4 = ingresar1("4");
        double[] grupo5 = ingresar1("5");

        double[] promediosGrupos = {
                PromedioGeneral(grupo1),
                PromedioGeneral(grupo2),
                PromedioGeneral(grupo3),
                PromedioGeneral(grupo4),
                PromedioGeneral(grupo5)
        };

        promedioGrupal(promediosGrupos);

        double promedioGeneral = PromedioGeneral(promediosGrupos);
        System.out.println("El promedio general de carrera es: " + promedioGeneral);
    }
}