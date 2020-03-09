import java.util.Scanner;


public class Contrasenia3
{
    public static void main( String [] args){
        Scanner pastel=new Scanner (System.in);
        int desbloqueo=110;
        int i;
        
      
            System.out.println ("ingrese contraseña:");
        int contrar=pastel.nextInt ();
       
        
        if (contrar==desbloqueo){
        
        
            System.out.println("acceso válido");
        }
            
            else if ( contrar != desbloqueo ) System.out.println ("acceso inválido");
            
        
    }
    }

