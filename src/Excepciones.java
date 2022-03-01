
import javax.swing.JOptionPane;

public class Excepciones {
    
    public boolean Cliente (String id, String t, String d)
    {
        boolean b= false;
        if (id.matches("[0-9]*")){
                    if (t.matches("[0-9]*"))
                        if (d.matches("[0-9]*|[-1]"))
                            b=true;
        }
        if (b)
            return true;
        else
            return false;
    }
    
    public boolean Producto (String cp, String c, String vu)
    {
        boolean b= false;
        if (cp.matches("[0-9]*")){
                if (vu.matches("[0-9]*"))
                    if (c.matches("[0-9]*|[-1]"))
                            b=true;
        }
        if (b)
            return true;
        else
            return false;
    }
    
    public boolean numero (String nv)
    {
        boolean b= false;
        if (nv!=null)
            if (nv.matches("[0-9]*"))
                b=true;        
        if (b)
            return true;
        else
            return false;
    }

}
