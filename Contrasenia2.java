import java.util.Scanner;


public class Contrasenia2
{
    public static void main( String [] args){
        Scanner pastel=new Scanner (System.in);
        int desbloqueo=110;
        int i;
        
        for (i=0; i<3; i++)
        {
            if(i!=2)System.out.println ("ingrese contraseña:");
            if(i>1) System.out.println( "último intento, ingrese contraeña");
        int contrar=pastel.nextInt ();
        
        
        if (contrar==desbloqueo){
                
            System.out.println("acceso válido");
            break;
        }
            
            else if ( contrar != desbloqueo && i>=0) System.out.println ("acceso inválido");
            
        
    }
    }
}
