import java.util.HashMap;

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
}