package Parcial2.singleton;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;

    private ConfiguracionSistema() {
        directorioSalida = "C:/Reportes";
        formatoPorDefecto = "pdf";
        mostrarMarcaAgua = true;
    }

    public static ConfiguracionSistema obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getDirectorioSalida() {
        return directorioSalida;
    }

    public void setDirectorioSalida(String dir) {
        directorioSalida = dir;
    }

    public String getFormatoPorDefecto() {
        return formatoPorDefecto;
    }

    public void setFormatoPorDefecto(String f) {
        formatoPorDefecto = f;
    }

    public boolean isMostrarMarcaAgua() {
        return mostrarMarcaAgua;
    }

    public void setMostrarMarcaAgua(boolean m) {
        mostrarMarcaAgua = m;
    }

    public void mostrarConfiguracion() {
        System.out.println("Directorio: " + directorioSalida);
        System.out.println("Formato por defecto: " + formatoPorDefecto);
        System.out.println("Marca de agua: " + mostrarMarcaAgua);
    }
}
