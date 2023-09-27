import java.util.HashMap;
import javax.swing.JOptionPane;

public abstract class Medidas {
    private HashMap<String, Double> medida = new HashMap<>();

    public abstract HashMap<String, Double> set_medida();

    public Medidas() {
        medida = set_medida();
    }

    public Double get_medida(String nombre_medida) {
        return this.medida.get(nombre_medida);
    }

    public String[] get_nombres() {
        int i = 0;
        String[] keys = new String[this.medida.size()];
        for (String key : this.medida.keySet()) {
            keys[i] = key;
            i++;
        }
        return keys;
    }

    public Double get_entrada(String base) {
        String entrada = JOptionPane.showInputDialog("Ingrese los " + base + " a convertir");
        while (!entrada.matches("[0.00-9.99]+") || entrada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos", "Error de datos",
                    JOptionPane.INFORMATION_MESSAGE);
            entrada = JOptionPane.showInputDialog("Ingrese los " + base + " a convertir");
        }
        return Double.parseDouble(entrada);
    }
}