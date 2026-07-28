import javax.swing.*;

public class Ejercicio2 {
        public static void main(String[] args) {

            int total = 0;
            String respuesta;

            do {

                int cantidad = Integer.parseInt(
                        JOptionPane.showInputDialog("Cantidad del producto"));

                total += cantidad;

                respuesta = JOptionPane.showInputDialog(
                        "¿Registrar otro producto? (S/N)");

            } while (respuesta.equalsIgnoreCase("S"));

            JOptionPane.showMessageDialog(null,
                    "Total de productos: " + total);
        }
    }

