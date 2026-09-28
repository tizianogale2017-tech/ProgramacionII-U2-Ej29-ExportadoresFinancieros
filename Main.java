package Ejercicio29_exportadoresFinancieros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> balance = Arrays.asList("Activo: 2500000", "Pasivo: 900000", "Patrimonio: 1600000");
        List<String> vacio = new ArrayList<>();

        ExportadorFinanciero[] exportadores = {new ExportadorBancoCentral(), new ExportadorAgenciaTributaria()};
        for (ExportadorFinanciero e : exportadores) {
            e.exportarDatos(balance);
        }

        System.out.println("--- Intento con una lista vacía ---");
        exportadores[0].exportarDatos(vacio);
    }
}
