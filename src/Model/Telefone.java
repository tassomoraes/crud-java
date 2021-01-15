package Model;

import java.util.ArrayList;

/**
 * @author tasso
 */
public class Telefone {
    
    private int Ddd;
    private String Numero;
    private String Tipo;

    public Telefone() {
    }

    public Telefone(int Ddd, String Numero, String Tipo) {
        this.Ddd = Ddd;
        this.Numero = Numero;
        this.Tipo = Tipo;
    }
    

    public int getDdd() {
        return Ddd;
    }

    public void setDdd(int Ddd) {
        this.Ddd = Ddd;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    //MVC
    public static ArrayList<Telefone> getTelefones(){
        ArrayList<Telefone> telefones = new ArrayList();
        return telefones;
    }
    
}
