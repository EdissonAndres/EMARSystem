
import java.io.IOException;
import java.io.RandomAccessFile;

public class Combo {
    String categoria;
    int numero;

    public Combo() {
    }

    public Combo(String categoria, int numero) {
        this.categoria = categoria;
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void guardarCategoria (RandomAccessFile archivo) throws IOException 
    {
        archivo.writeUTF( categoria );
        archivo.writeInt( numero );
    }
    
    public void recuperarCategoria (RandomAccessFile archivo) throws IOException 
    {
        categoria  = archivo.readUTF();     
        numero  = archivo.readInt();  
    }
}
