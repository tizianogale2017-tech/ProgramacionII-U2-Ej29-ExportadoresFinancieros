package Ejercicio29_exportadoresFinancieros;

import java.util.List;

public abstract class ExportadorFinanciero {
    protected boolean validarRegistros(List<String> registros) {
        if (registros == null || registros.isEmpty()) {
            System.out.println("  Validación fallida: no hay registros para exportar.");
            return false;
        }
        return true;
    }

    public abstract void exportarDatos(List<String> registros);
}
