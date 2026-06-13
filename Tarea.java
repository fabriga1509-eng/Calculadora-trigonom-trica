import java.util.Scanner; // Importamos Scanner para leer entrada del usuario
public class Tarea {
    static void  calcular(double angulo, int  opcion) {
        double resultado;
        double angulorad;
        switch (opcion)
        {
            case 1:
                angulorad = Math.toRadians(angulo);
                resultado = Math.sin(angulorad);
                System.out.println("sin("+angulo+") = "+resultado);
                break;
            case 2:
                angulorad = Math.toRadians(angulo);
                resultado = Math.cos(angulorad);
                resultado = Math.round(resultado * 100000.0)/ 100000.0;
                System.out.println("cos("+angulo+") = "+resultado);
                break;
            case 3:
                angulorad = Math.toRadians(angulo);
                resultado = Math.tan(angulorad);
                System.out.println("tan("+angulo+") = "+resultado);
                break;
            case 4:
                resultado = Math.asin(angulo);
                resultado = Math.toDegrees(resultado);
                System.out.println("arcsin("+angulo+") = "+resultado);
                break;
            case 5:
                resultado = Math.acos(angulo);
                resultado = Math.toDegrees(resultado);
                System.out.println("arccos("+angulo+") = "+resultado);
                break;
            case 6:
                resultado = Math.atan(angulo);
                resultado = Math.toDegrees(resultado);
                System.out.println("arctan("+angulo+") = "+resultado);
                break;
            case 7:
                resultado = Math.sinh(angulo);
                System.out.println("sinh("+angulo+") = "+resultado);
                break;
            case 8:
                resultado = Math.cosh(angulo);
                System.out.println("cosh("+angulo+") = "+resultado);
                break;
            case 9:
                resultado = Math.tanh(angulo);
                System.out.println("tanh("+angulo+") = "+resultado);
                break;
            default:
                System.out.println("Error");
                break;
        }
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
        while (true)
        { 
            mostrarMenu();
            opcion = sc.nextInt();
            if (opcion < 0 || opcion > 9)
            {
                System.out.println("Opcion invalida!");
                continue;
            }
            if(opcion == 0){
                System.out.println("Hasta luego!");
                break;
            }
            System.out.println("Digite el angulo");
            double angulo = sc.nextDouble();
            calcular(angulo,opcion);
        }
        sc.close();
    }
}

