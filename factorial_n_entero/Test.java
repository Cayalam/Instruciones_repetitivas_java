package Instruciones_repetitivas_java.factorial_n_entero;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args)
    {
        int N;
        int fac;
        
        

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero al cual le quieres calcular el factorial:"));
        fac=1;
    
        for(int i=1;N>=i;i++){
            fac=fac*i;
        }
        JOptionPane.showMessageDialog(null,"El numero es: "+ N +"\n Siendo su factorial: " +fac);


    }

    
}
