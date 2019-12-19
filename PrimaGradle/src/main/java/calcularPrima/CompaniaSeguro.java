package calcularPrima;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CompaniaSeguro {

	public static void main(String[] args) {
	    final String titleBar1 = "NO PUEDE ASEGURARSE";
	    final String titleBar2 = "NO PUEDE CONDUCIR";
	    final String titleBar3 = "ACCION EXITOSA";
	    
        System.out.println("***Compañía aseguradora de carros***\n"); 
        
        try {
            Scanner keyboard = new Scanner(System.in);
        
            /* Solicitando edad del conductor*/
            System.out.println("Ingrese edad del conductor:");
            int edad = keyboard.nextInt();

            /* Solicitando puntos de licencia*/
            System.out.println("Ingrese puntos de la licencia:");
            int puntos = keyboard.nextInt();
            
            keyboard.close();
            Conductor cond = new Conductor(edad, puntos);

            if (cond.puedeAsegurarse()) { 
                if (cond.puedeConducir()) {
                    JOptionPane.showMessageDialog(null, "El conductor se aseguró "
                        + "correctamente.\nEl valor de la prima es: $"
                        + Double.toString(cond.calcularPrima()), titleBar3, 
                        JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "El conductor no cumple "
                        + "con los requisitos de la ley ecuatoriana,\nya que tiene *"
                        + Integer.toString(cond.getPuntosLic()) + 
                        " puntos*", titleBar2, JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "El conductor no cumple con los "
                        + "requisitos de edad,\nya que tiene *"
                        + Integer.toString(cond.getEdad()) + " años*",
                        titleBar1, JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Surgió una excepción. "
                    + "Verifique que está ingresando los datos correctamente.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}
