import java.io.IOException;
import java.io.RandomAccessFile;

public class Venta {
    private String codigoCliente;
    private String fecha;
    private String nombreCliente;
    private long valorCompra;
    private long numeroVenta;
    private long deuda;

    public Venta() {
    }

    public Venta(String codigoCliente, String fecha, String nombreCliente, long valorCompra, long numeroVenta, long deuda) {
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.valorCompra = valorCompra;
        this.numeroVenta = numeroVenta;
        this.deuda = deuda;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(long valorCompra) {
        this.valorCompra = valorCompra;
    }

    public long getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(long numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public long getDeuda() {
        return deuda;
    }

    public void setDeuda(long deuda) {
        this.deuda = deuda;
    }
    
    public void guardarVenta (RandomAccessFile archivo) throws IOException 
   {       
        archivo.writeUTF(codigoCliente);
        archivo.writeUTF(fecha);
        archivo.writeUTF(nombreCliente); 
        archivo.writeLong(valorCompra);     
        archivo.writeLong(numeroVenta);      
        archivo.writeLong(deuda);  

   }
    
public void recuperarVenta (RandomAccessFile archivo) throws IOException 
   {       
        codigoCliente = archivo.readUTF(); 
        fecha = archivo.readUTF(); 
        nombreCliente = archivo.readUTF(); 
        valorCompra = archivo.readLong();   
        numeroVenta = archivo.readLong(); 
        deuda = archivo.readLong();    
   }
public void mostrarDatos()
 {
    System.out.println ("\n Numero de factura    = "+numeroVenta);
    System.out.println (" Codigo Comprador     = "+codigoCliente);
    System.out.println (" Nombre Comprador     = "+nombreCliente);
    System.out.println (" Fecha                = "+fecha);
    System.out.println (" Valor Total          = "+valorCompra);
    System.out.println (" Deuda                = "+deuda);
    }
}
