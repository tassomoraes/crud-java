package Controller;

import Model.Telefone;
import Model.Usuario;
import java.util.ArrayList;

/**
 * @author tasso
 */
public class UsuarioControl {
    public static boolean SalvarUsuario (String Nome, String Email, String Senha, ArrayList<Telefone> Telefones){
        Usuario usr = new Usuario(Nome,Email,Senha,Telefones);
        return usr.Persistir(); 
    }
    
    public static ArrayList <String[]> getUsuarios(){
        ArrayList <String[]> Usuarios = new ArrayList();
        
        ArrayList <Usuario> Usr = Usuario.getUsuarios();
        
        for(int i=0; i<Usr.size(); i++){
            String usuario[] = new String[17];
            usuario[0] = Usr.get(i).getNome();
            usuario[1] = Usr.get(i).getEmail();
            usuario[2] = Usr.get(i).getSenha();
            //receber lista de telefones
            int quantidade_telefones = Usr.get(i).getListFone().size();
            usuario[3] = String.valueOf(quantidade_telefones);
            
            String telefones = new String();
            for(int j=0, k=0; j<quantidade_telefones ; j++){
                String ddd = String.valueOf(Usr.get(i).getListFone().get(j).getDdd());
                String numero = Usr.get(i).getListFone().get(j).getNumero();
                String tipo = Usr.get(i).getListFone().get(j).getTipo();
                
                //armazendando os núemros separadamente
                k=j*3 + 5; // começa na posição 5 e pula 3 posições pra cada j
                usuario [k] = ddd;
                usuario [k+1] = numero;
                usuario [k+2] = tipo;
                
                //telefones reune todos os números de telefone em uma só string
                telefones = "("+ddd+")"+numero+" - "+tipo;
                if(j+1<quantidade_telefones)
                    telefones = telefones+",";
            } 
            usuario[4] = telefones;
            System.out.println(telefones);                    
            Usuarios.add(usuario);
        }
        
        return Usuarios;
    }
}
