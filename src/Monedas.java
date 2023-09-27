import java.util.HashMap;

public class Monedas extends Medidas {
    @Override
    public HashMap<String, Double> set_medida() {
        HashMap<String, Double> divisas = new HashMap<>();
        divisas.put("Peso Mexicano", 17.542496753849);
        divisas.put("Dolares", 1.0);
        divisas.put("Euros", 1.0573998959519);
        divisas.put("Libras Esterlinas", 0.8225763242585);
        divisas.put("Franco Suizo", 0.91564263335024);
        divisas.put("Peso Colombiano", 4076.3620689655);
        return divisas;
    }
}
