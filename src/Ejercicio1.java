import javax.swing.*;
    public class Ejercicio1 {
        public static void main(String[] args) {

            String usuario;
            String clave;

            do {

                usuario = JOptionPane.showInputDialog("Usuario");
                clave = JOptionPane.showInputDialog("Contraseña");

                if (!usuario.equals("admin") || !clave.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }

            } while (!usuario.equals("admin") || !clave.equals("1234"));

            JOptionPane.showMessageDialog(null, "Bienvenido");
        }
    }
