import javax.swing.JOptionPane;

    public class Ejercicio5 {
        public static void main(String[] args) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

            do {
                System.out.println(numero);
                numero--;
            } while (numero >= 0);

        }
    }