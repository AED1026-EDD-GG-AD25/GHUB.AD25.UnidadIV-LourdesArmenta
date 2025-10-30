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
        System.out.println("***************************");
        System.out.println("      Arboles Binarios     ");
        System.out.println("***************************");
        System.out.println("1. Recorrido               ");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Selecciona la opción deseada:");
    }
}