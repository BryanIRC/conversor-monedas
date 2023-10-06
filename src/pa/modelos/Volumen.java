package pa.modelos;

import java.util.HashMap;

public class Volumen extends Medidas {
    @Override
    public HashMap<String, Double> set_medida() {
        HashMap<String, Double> volumen = new HashMap<>();
        volumen.put("Litros", 1.0);
        volumen.put("Metros cubicos", 1000.0);
        volumen.put("Galones", 3.78541);
        volumen.put("Onzas", 0.0295735);
        volumen.put("Pies cubicos", 28.3468);
        volumen.put("Cucharadas", 0.0147868);
        volumen.put("Tazas", 0.24);
        volumen.put("Pintas", 0.473176);
        return volumen;
    }
}
