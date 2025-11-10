package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            menu();
            try{
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    AppRecorridoArboles.inicio();
                    break;
                case 2:
                    AppEnteroComparable.inicio();
                    break;
                case 3:
                    AppPersonaComparable.inicio();
                    break;
                case 4:
                    AppEstudianteComparable.inicio();
                    break;
                case 5:
                    AppEstudiantesCriterioId.inicio();
                    break;
                case 6:
                    AppEstudiantesCriterioNombre.inicio();
                    break;
                case 7:
                    AppEstudiantesCriterioPromedio.inicio();
                    break;
                case 8:
                    AppEstudianteCriterioIdComparator.inicio();
                    break;
                case 0:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Seleccione la opción correcta!");  
            }
            }catch (InputMismatchException ex){
                System.out.println("Seleccione la opcion correcta "+ex.getMessage());
                sc.nextLine(); //limpio el buffer
                opc = -1;
                continue;  
            }

        }while (opc !=0);
        
    }
    public static void menu(){
        System.out.println("****************************************");
        System.out.println("           Arboles Binarios             ");
        System.out.println("****************************************");
        System.out.println("1. Recorrido                            ");
        System.out.println("2. Comparar Enteros                     ");
        System.out.println("3. Comparara Persona                    ");
        System.out.println("4. Ordenar Estudiantes por Nombre       ");
        System.out.println("5. Ordenar Estudiantes por criterio id  ");
        System.out.println("6. Ordenar Estudiante por criterio nombre");
        System.out.println("7. Ordenar Estudiante por criterio Promedio");
        System.out.println("8. Ordenar Estudiantes interface Comparator");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Selecciona la opción deseada:");
    }
}