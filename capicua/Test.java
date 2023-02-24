package Instruciones_repetitivas_java.capicua;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args)
    {
        int x;
        int z;
        int inver;
        int cifra;


        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quieres verificar si es capicua:"));
        inver=0;

        while(x<10);

        z=x;
        while(z!=0){
            cifra=z%10;
            inver= inver*10 +cifra;
            z=z/10;

        }
        if(x==inver){
            JOptionPane.showMessageDialog(null,"Si es Capicua");

        }
        else{
            JOptionPane.showMessageDialog(null,"No es capicua");
        }
        


        
    }
}
