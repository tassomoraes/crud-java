package Model;


import java.util.ArrayList;

/**
 * @author tasso
 */
public class Usuario {

    private String Nome;
    private String Email;
    private String Senha;
    private String Fone; //temp
    ArrayList <Telefone> ListFone;
    
    public Usuario() {
        ListFone = new ArrayList();
    }

    public Usuario(String Nome, String Email, String Senha, ArrayList<Telefone> ListFone) {
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
        this.ListFone = ListFone;
    }

    //temp
    public Usuario(String Nome, String Email, String Senha, String Fone) {
        ListFone = new ArrayList();
        
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
        this.Fone = Fone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getStringFone() {
        
        //transforma a lista em única string
        //separando os teledones por ',' e '\n'
        //telefones no formato ddd numero (tipo): 81 999004401 (pessoal)
        String telefones = "";
        String ddd = "";
        String numero = "";
        String tipo = "";
        
        for(int i=0 ; i<this.ListFone.size() ; i++){
            ddd = "(" + Integer.toString(this.ListFone.get(i).getDdd());
            numero = ")" + this.ListFone.get(i).getNumero();
            tipo = " - " + this.ListFone.get(i).getTipo();
            
            telefones = telefones + ddd + numero + tipo;
            
            if((this.ListFone.size()>1) && (i+1<this.ListFone.size())){
                telefones = telefones + ", ";
            }
        }
        
        return telefones;
    }

    public ArrayList<Telefone> getListFone() {
        return ListFone;
    }

    
    public void setListFone(ArrayList<Telefone> ListFone) {
        this.ListFone = ListFone;
    }
    
    public void addFone (Telefone Fone){
        ListFone.add(Fone);
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }
    
    
    
}
