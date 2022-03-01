import java.io.IOException;
import java.io.RandomAccessFile;

public class Cliente {
    String identificacion;
    String nombre;
    String direccion;
    String telefono;
    long deuda;

    public Cliente() {
    }

    public Cliente(String identificacion, String nombre, String direccion, String telefono, long deuda) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.deuda = deuda;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public long getDeuda() {
        return deuda;
    }

    public void setDeuda(long deuda) {
        this.deuda = deuda;
    }
    
    public void guardarCliente (RandomAccessFile archivo) throws IOException 
    {
        archivo.writeUTF( identificacion );
        archivo.writeUTF( nombre );          
        archivo.writeUTF( direccion );        
        archivo.writeUTF( telefono ); 
        archivo.writeLong( deuda ); 
    }
    
    public void recuperarCliente (RandomAccessFile archivo) throws IOException 
    {
        identificacion = archivo.readUTF();       
        nombre = archivo.readUTF();       
        direccion = archivo.readUTF();       
        telefono = archivo.readUTF(); 
        deuda = archivo.readLong();
    }
    
    public void mostrarDatos()
    {
     System.out.println ("\n Cedula    = "+identificacion);
     System.out.println (" Nombre    = "+nombre);
     System.out.println (" Direccion = "+direccion);
     System.out.println (" Telefono  = "+telefono);
     System.out.println (" Deuda     = "+deuda);
    }
}
