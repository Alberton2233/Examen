import java.util.Scanner;
public class Examen {
    public static void main(String args[]){
       String nombre;
       float dia, mes, año, años, dia1=16, mes1=5, año1=2022, total, descuento=0;
       Scanner captura = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion de CompuAserrí");
        System.out.println("Digite su nombre.");
        nombre = captura.next();
        System.out.println("En que dia nacio.?");
        dia = captura.nextInt();
        System.out.println("En que mes nacio.?");
        mes = captura.nextInt();
        System.out.println("Cual es el año en el que nacio.?");
        año = captura.nextInt();
        años=año1-año;
        if (mes==mes1){
            if(dia>dia1){
             mes=mes+1;
            }
        }
        if(mes>mes1){
            años=años+1;
        }
        System.out.println("Usted tiene "+años+" años.");
        
        if(años<25){
            if(años>15) {
                System.out.println("Usted aplica para un descuento Junior del 10%:");
                descuento=descuento+10;
            }
        }
        
        else if(años<25){
            if(años>35) {
                System.out.println("Usted aplica para un descuento Executivo del 15%:");
                descuento=descuento+15;
            }
        }
        
        else //if(años>35)
        {
            System.out.println("Usted aplica para un descuento Senior del 20%");
            
            descuento=descuento+20;
            
        }
        System.out.println("Digite la suma del total a pagar.");
        total = captura.nextInt();
        System.out.println("descuento"+descuento);
         
        float totalpaga=(descuento/100)*total;
        System.out.println(totalpaga);
        System.out.println("El cliente "+nombre+" debe de pagar "+ totalpaga);
        
        
        
        
    }
}
