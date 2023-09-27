import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        MiLibreria obj_MiLib = new MiLibreria();
        Medidas obj_Map;

        String entrada = "", tipo = "", base = "", salida = "";
        String[] lista_tipos = obj_MiLib.set_lista_tipos();
        int sensor = 0;
        Double resultado;

        while (sensor == 0) {
            tipo = (String) JOptionPane.showInputDialog(null, "Que tipo de medida desea convertir",
                    "Tipo de medida", JOptionPane.DEFAULT_OPTION, null, lista_tipos, lista_tipos[0]);
            switch (tipo) {
                case "Monedas":
                    obj_Map = new Monedas();
                    base = (String) JOptionPane.showInputDialog(null, "Medida inicial",
                            "Convertir", JOptionPane.DEFAULT_OPTION, null, obj_Map.get_nombres(),
                            obj_Map.get_nombres()[0]);
                    entrada = JOptionPane.showInputDialog("Ingrese los " + base + " a convertir");
                    salida = (String) JOptionPane.showInputDialog(null, "Final",
                            "Convertir", JOptionPane.DEFAULT_OPTION, null, obj_Map.get_nombres(),
                            obj_Map.get_nombres()[0]);
                    resultado = obj_MiLib.Calcular(Double.parseDouble(entrada), obj_Map.get_medida(base),
                            obj_Map.get_medida(salida));
                    JOptionPane.showMessageDialog(null, entrada + " " + base + " son: " + resultado + " " + salida);
                    sensor = JOptionPane.showConfirmDialog(null, "Desea comvertir otra cantidad");
                    break;
            }

        }
    }
}