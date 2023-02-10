

package tareas1;


public class eliminarAuto {
    public static Auto[] EliminarAuto(String placa, Auto carros[]) {
        Auto ut[] = new Auto[carros.length - 1];

        for (int i = 0; i < carros.length; i++) {
            String valor = carros[i].placas;
            if (i < ut.length) {
                if (!valor.equals(placa)) {
                    Auto nuevo = new Auto();
                    nuevo.Anio = carros[i].Anio;
                    nuevo.Modelo = carros[i].Modelo;
                    nuevo.placas = carros[i].placas;
                    ut[i] = nuevo;
                }
            } else {
                if (!valor.equals(placa)) {
                    Auto nuevo = new Auto();
                    nuevo.Anio = carros[i].Anio;
                    nuevo.Modelo = carros[i].Modelo;
                    nuevo.placas = carros[i].placas;
                    ut[i - 1] = nuevo;
                }
            }

        }
        return ut;
    }
}
