import javax.swing.JOptionPane;

import pa.modelos.Medidas;
import pa.modelos.Monedas;
import pa.modelos.Volumen;

public class App {
        public static void main(String[] args) {
                MiLibreria obj_MiLib = new MiLibreria();
                Medidas obj_Map;

                String tipo, base, salida;
                String[] lista_tipos = obj_MiLib.set_lista_tipos();
                int sensor = 0;
                Double resultado, entrada;

                while (sensor == 0) {
                        tipo = (String) JOptionPane.showInputDialog(null, "Que tipo de medida desea convertir",
                                        "coversor", JOptionPane.DEFAULT_OPTION, null, lista_tipos,
                                        lista_tipos[0]);
                        switch (tipo) {
                                case "Monedas":
                                        obj_Map = new Monedas();
                                        base = (String) JOptionPane.showInputDialog(null, "Medida inicial",
                                                        "Conversor", JOptionPane.INFORMATION_MESSAGE, null,
                                                        obj_Map.get_nombres(),
                                                        obj_Map.get_nombres()[0]);
                                        entrada = obj_Map.get_entrada(base);
                                        salida = (String) JOptionPane.showInputDialog(null,
                                                        "¿A qué medida desea convertir?",
                                                        "Conversor", JOptionPane.INFORMATION_MESSAGE, null,
                                                        obj_Map.get_nombres(),
                                                        obj_Map.get_nombres()[0]);
                                        resultado = obj_MiLib.Calcular(entrada, obj_Map.get_medida(base),
                                                        obj_Map.get_medida(salida));
                                        JOptionPane.showMessageDialog(null,
                                                        entrada + " " + base + " son: " + resultado + " " + salida,
                                                        "Conversor", JOptionPane.PLAIN_MESSAGE);
                                        sensor = JOptionPane.showConfirmDialog(null, "Desea comvertir otra cantidad",
                                                        "Conversor",
                                                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        break;
                                case "Volumen":
                                        obj_Map = new Volumen();
                                        base = (String) JOptionPane.showInputDialog(null, "Medida inicial",
                                                        "Conversor", JOptionPane.INFORMATION_MESSAGE, null,
                                                        obj_Map.get_nombres(),
                                                        obj_Map.get_nombres()[0]);
                                        entrada = obj_Map.get_entrada(base);
                                        salida = (String) JOptionPane.showInputDialog(null,
                                                        "¿A qué medida desea convertir?",
                                                        "Conversor", JOptionPane.INFORMATION_MESSAGE, null,
                                                        obj_Map.get_nombres(),
                                                        obj_Map.get_nombres()[0]);
                                        resultado = obj_MiLib.Calcular(entrada, obj_Map.get_medida(base),
                                                        obj_Map.get_medida(salida));
                                        JOptionPane.showMessageDialog(null,
                                                        entrada + " " + base + " son: " + resultado + " " + salida,
                                                        "Conversor", JOptionPane.PLAIN_MESSAGE);
                                        sensor = JOptionPane.showConfirmDialog(null, "Desea comvertir otra cantidad",
                                                        "Conversor",
                                                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        break;
                        }
                }
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO", "Conversor",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}