package Controller;

import Model.Telefone;
import java.util.ArrayList;

/**
 * @author tasso
 */
public class TelefoneControl {
    public static ArrayList <String[]> getTelefones(){
        ArrayList <String[]> Telefones = new ArrayList();
        
        ArrayList <Telefone> tel = Telefone.getTelefones();
        for (int i=0 ; i<tel.size() ; i++){
            String t[] = new String[3];
            String ddd = String.valueOf(tel.get(i).getDdd());
            String numero = tel.get(i).getNumero();
            String tipo = tel.get(i).getTipo();
            t[0] = ddd;
            t[1] = numero;
            t[2] = tipo;
            
            Telefones.add(t);
        }
        
        return Telefones;
    } 
}
