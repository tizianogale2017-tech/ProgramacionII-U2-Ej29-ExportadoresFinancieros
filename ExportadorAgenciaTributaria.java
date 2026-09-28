package Ejercicio29_exportadoresFinancieros;

import java.util.List;

public class ExportadorAgenciaTributaria extends ExportadorFinanciero {
    @Override
    public void exportarDatos(List<String> registros) {
        System.out.println("Exportando a la Agencia Tributaria...");
        if (!validarRegistros(registros)) {
            return;
        }
        for (String registro : registros) {
            System.out.println("  Declarando (formato XML): <asiento>" + registro + "</asiento>");
        }
        System.out.println("  Declaración presentada.");
    }
}
