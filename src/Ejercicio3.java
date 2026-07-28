 import javax.swing.JOptionPane;
public class Ejercicio3 {
        public static void main(String[] args) {

            int edad;

            do {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad mayor o igual a 18:"));
            } while (edad < 18);

            JOptionPane.showMessageDialog(null, "Edad válida.");
        }
    }
