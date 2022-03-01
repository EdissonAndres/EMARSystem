import java.io.*;

public class Producto {
    String codProducto;
    String descripcion;
    String marca;
    String categoria;
    long cantidad;
    long valorUnitario;

    public Producto() {
    }

    public Producto(String codProducto, String descripcion, String marca, String categoria, long cantidad, long valorUnitario) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(long valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public void guardarProducto (RandomAccessFile archivo) throws IOException 
    {
        archivo.writeUTF( codProducto );
        archivo.writeUTF( descripcion ); 
        archivo.writeUTF( marca );  
        archivo.writeUTF( categoria );  
        archivo.writeLong( cantidad );        
        archivo.writeLong( valorUnitario );     
    }
    
    public void recuperarProducto (RandomAccessFile archivo) throws IOException 
    {
        codProducto = archivo.readUTF();       
        descripcion = archivo.readUTF(); 
        marca= archivo.readUTF();
        categoria= archivo.readUTF();
        cantidad = archivo.readLong();       
        valorUnitario = archivo.readLong();   
    }
    
    public void mostrarDatos()
    {
        System.out.println ("\n Nombre   = "+descripcion);
        System.out.println (" Marca    = "+marca);
        System.out.println (" Codigo   = "+codProducto);
        System.out.println (" Categoria= "+categoria);
        System.out.println (" Precio   = "+valorUnitario);
        System.out.println (" Cantidad = "+cantidad);
    }
}