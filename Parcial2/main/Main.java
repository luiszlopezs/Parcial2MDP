package Parcial2.main;

import Parcial2.factory.ReporteFactory;
import Parcial2.abstractproduct.Reporte;
import Parcial2.decorator.*;
import Parcial2.singleton.ConfiguracionSistema;



public class Main {

    public static void main(String[] args) {

        ReporteFactory factory = new ReporteFactory();


        System.out.println();
        System.out.println("=== PUNTO 3 ===");
        System.out.println();

        ConfiguracionSistema config = ConfiguracionSistema.obtenerInstancia();
        config.mostrarConfiguracion();

        config.setDirectorioSalida("D:/ReportesFinales");
        config.setFormatoPorDefecto("excel");
        config.setMostrarMarcaAgua(false);

        System.out.println("\nConfiguracion actualizada:");
        config.mostrarConfiguracion();


        System.out.println();
        System.out.println("=== PUNTO 1 ===");
        System.out.println();

        String tipo = "html";     
        Reporte reporteBase = factory.crearReporte(tipo);

        System.out.println("Resultado del reporte solicitado:");
        System.out.println(reporteBase.generarContenido());
        System.out.println();
        System.out.println("Reporte con formato por defecto:");
        System.out.println(factory.crearReportePorDefecto().generarContenido());


        System.out.println();
        System.out.println("=== PUNTO 2 ===");
        System.out.println();


        // Ejemplo 1
        System.out.println();
        System.out.println("Ejemplo 1:");
        Reporte r1 = new EncabezadoDecorador(new MarcaAguaDecorador(factory.crearReporte("pdf")));
        System.out.println("PDF con encabezado + marca de agua:");
        System.out.println(r1.generarContenido());
        config.setMostrarMarcaAgua(true);

        // Ejemplo 2
        System.out.println();
        System.out.println("Ejemplo 2:");
        Reporte r2 = factory.crearReporte("excel");
        r2 = new EncabezadoDecorador(r2);
        r2 = new PieConFechaDecorator(r2);
        r2 = new MarcaAguaDecorador(r2);
        System.out.println();
        System.out.println("Excel con todos los decoradores:");
        System.out.println(r2.generarContenido());

        // Ejemplo 3
        System.out.println();
        System.out.println("Ejemplo 3:");
        Reporte r3 = new PieConFechaDecorator(factory.crearReporte("html"));
        System.out.println();
        System.out.println("HTML con pie de fecha:");
        System.out.println(r3.generarContenido());
    }
}
