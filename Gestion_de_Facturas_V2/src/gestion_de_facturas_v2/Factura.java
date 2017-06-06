package gestion_de_facturas_v2;

public class Factura {
    
    private String nombreProveedor;
    private String ruc;
    private String dirMatriz;
    private String nombreCliente;
    private String identificaciónCli;
    private String codFact;
    private String fechaEmision;
//    private Float campoAdicional;
    private String producto;
    private Float cantidad;
    private Float precioUnit;
    private Float precioTotalSinImpuestos;
    private Float precioTotalConImpuestos;
//    private String nombreCampoAdicional;

    public Factura() {

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

    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Float getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(Float precioUnit) {
        this.precioUnit = precioUnit;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }
    
      
}
