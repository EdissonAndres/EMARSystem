
import java.io.IOException;
import java.io.RandomAccessFile;


public class Abonos {
    String numeroVenta;
    String fecha;
    long abono;

    public Abonos(){
        
    }
    
    public Abonos(String numeroVenta, String fecha, long abono) {
        this.numeroVenta = numeroVenta;
        this.fecha = fecha;
        this.abono = abono;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void setAbono(long abono) {
        this.abono = abono;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public long getAbono() {
        return abono;
    }
    
    public void guardarAbono (RandomAccessFile archivo) throws IOException 
    {
        archivo.writeUTF( numeroVenta );
        archivo.writeUTF( fecha );        
        archivo.writeLong( abono ); 
    }
    
    public void recuperarAbono (RandomAccessFile archivo) throws IOException 
    {
        numeroVenta = archivo.readUTF();       
        fecha = archivo.readUTF();       
        abono = archivo.readLong();
    }
    
    
}
