package Instruciones_repetitivas_java.Numero_primo;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args)
    {
        int x;
        int con;
        int i;

        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero el cual quieres saber si es primo :"));
        con=0;
        for(i=1;x>=i;i++)
        {
            if((x%i)==0)
            {

                con=con+1;

            }

        }
        if(con<=2){
            JOptionPane.showMessageDialog(null,"El Numero es primo");
        }else{
            JOptionPane.showMessageDialog(null,"El Numero no es primo");

        }
    }
    
}
