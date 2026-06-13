import java.util.Scanner; // Importamos Scanner para leer entrada del usuario
public class Tarea {
    static double  calcular(double angulo, int  opcion) {
        System.out.println("Se terminara proximamente");
        return 0;
    }
    //Metodo para mostrar opciones de la calculadora
    static void mostrarMenu(){
        System.out.println("\n---CALCULADORA---");
        System.out.println("1) sin");
        System.out.println("2) cos");
        System.out.println("3) tan");
        System.out.println("4) arcsin");
        System.out.println("5) arccos");
        System.out.println("6) arctan");
        System.out.println("7) sinh");
        System.out.println("8) cosh");
        System.out.println("9) tanh");
        System.out.println("0) Salir");
        System.out.print("Elige una opción: ");
    }
    //Metodo para elegir opcion y angulo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do { 
            mostrarMenu();
            opcion = sc.nextInt();
            if(opcion == 0){
                System.out.println("Hasta luego!");
                break;
            }
            System.out.println("Digite el angulo");
            double angulo = sc.nextDouble();
            double resultado = calcular(angulo,opcion);
        } while (opcion != 0);
        sc.close();
    }
}
