
package Entities;

public class EntidadAccesorio {
    
    private String codigoAccesorio;
    private String nombreAccesorio;
    private int precioAccesorio; 
    private String TipoAccesorio;
    private String estiloAccesorio;
    private int longitudAccesorio;
    private boolean estadoAccesorio;
    
    public EntidadAccesorio(String codigoAccesorio, String nombreAccesorio, int precioAccesorio, String TipoAccesorio, String estiloAccesorio, int longitudAccesorio, boolean estadoAccesorio) {
        this.codigoAccesorio = codigoAccesorio;
        this.nombreAccesorio = nombreAccesorio;
        this.precioAccesorio = precioAccesorio;
        this.TipoAccesorio = TipoAccesorio;
        this.estiloAccesorio = estiloAccesorio;
        this.longitudAccesorio = longitudAccesorio;
        this.estadoAccesorio = estadoAccesorio;
    }

    public String getCodigoAccesorio() {
        return codigoAccesorio;
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public int getPrecioAccesorio() {
        return precioAccesorio;
    }

    public String getTipoAccesorio() {
        return TipoAccesorio;
    }

    public String getEstiloAccesorio() {
        return estiloAccesorio;
    }

    public int getLongitudAccesorio() {
        return longitudAccesorio;
    }

    public boolean isEstadoAccesorio() {
        return estadoAccesorio;
    }

    public void setCodigoAccesorio(String codigoAccesorio) {
        this.codigoAccesorio = codigoAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }

    public void setPrecioAccesorio(int precioAccesorio) {
        this.precioAccesorio = precioAccesorio;
    }

    public void setTipoAccesorio(String TipoAccesorio) {
        this.TipoAccesorio = TipoAccesorio;
    }

    public void setEstiloAccesorio(String estiloAccesorio) {
        this.estiloAccesorio = estiloAccesorio;
    }

    public void setLongitudAccesorio(int longitudAccesorio) {
        this.longitudAccesorio = longitudAccesorio;
    }

    public void setEstadoAccesorio(boolean estadoAccesorio) {
        this.estadoAccesorio = estadoAccesorio;
    }
}
