package Ejercicio29_exportadoresFinancieros;

import java.util.List;

public class ExportadorBancoCentral extends ExportadorFinanciero {
    @Override
    public void exportarDatos(List<String> registros) {
        System.out.println("Exportando al Banco Central...");
        if (!validarRegistros(registros)) {
            return;
        }
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("  Enviando registro " + (i + 1) + "/" + registros.size() + " (formato SWIFT): " + registros.get(i));
        }
        System.out.println("  Transferencia completada.");
    }
}
