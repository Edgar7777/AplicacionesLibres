package gestion_de_facturas_v2;

public class Factura {
    
    private String claveAccesoConsultada;
    private String ambiente;
    private int numeroComprobante;
    private String nombreProveedor;
    private String ruc;
    private String dirMatriz;
    private String dirEstablecimiento;
    private String nombreCliente;
    private String identificaciónCli;
    private String codFact;
    private String fechaEmision;
    private Float campoAdicional;
    private Float precioTotalSinImpuestos;
    private Float precioTotalConImpuestos;
    private String nombreCampoAdicional;

    public Factura() {

    }
    

    public String getClaveAccesoConsultada() {
        return claveAccesoConsultada;
    }

    public void setClaveAccesoConsultada(String claveAccesoConsultada) {
        this.claveAccesoConsultada = claveAccesoConsultada;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDirMatriz() {
        return dirMatriz;
    }

    public void setDirMatriz(String dirMatriz) {
        this.dirMatriz = dirMatriz;
    }

    public String getDirEstablecimiento() {
        return dirEstablecimiento;
    }

    public void setDirEstablecimiento(String dirEstablecimiento) {
        this.dirEstablecimiento = dirEstablecimiento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdentificaciónCli() {
        return identificaciónCli;
    }

    public void setIdentificaciónCli(String identificaciónCli) {
        this.identificaciónCli = identificaciónCli;
    }

    public String getCodFact() {
        return codFact;
    }

    public void setCodFact(String codFact) {
        this.codFact = codFact;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Float getCampoAdicional() {
        return campoAdicional;
    }

    public void setCampoAdicional(Float campoAdicional) {
        this.campoAdicional = campoAdicional;
    }

    public Float getPrecioTotalSinImpuestos() {
        return precioTotalSinImpuestos;
    }

    public void setPrecioTotalSinImpuestos(Float precioTotalSinImpuestos) {
        this.precioTotalSinImpuestos = precioTotalSinImpuestos;
    }

    public Float getPrecioTotalConImpuestos() {
        return precioTotalConImpuestos;
    }

    public void setPrecioTotalConImpuestos(Float precioTotalConImpuestos) {
        this.precioTotalConImpuestos = precioTotalConImpuestos;
    }

    public String getNombreCampoAdicional() {
        return nombreCampoAdicional;
    }

    public void setNombreCampoAdicional(String nombreCampoAdicional) {
        this.nombreCampoAdicional = nombreCampoAdicional;
    }
    
      
}
