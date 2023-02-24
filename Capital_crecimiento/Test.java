package Instruciones_repetitivas_java.Capital_crecimiento;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args)
    {
        // Decleración de variables
        int c1;
        int c2;
        int c3;
        int m;
        

         // Inout
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de Pedro:"));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de Juan:"));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Capital total:"));
         
        m=0;
    


        while(c1+c2<c3){
            c1= c1 +  (c1 * 3)/100;
            c2 =c2 +( 4* c2)/100;
            m=m+1;

        }
        JOptionPane.showMessageDialog(null,"La cantidad de meses fueron: " + m );
    

    }

    
}
