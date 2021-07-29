package desafio04Heranca;
import java.lang.String;
public class Pessoa {
    private Integer id;
    private String nome;
    private String endereco;
    private String telefone ;

    public Pessoa(){
    }

    public Pessoa(Integer id, String nome , String endereco,String telefone, String cpfPessoa) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


      public String getDocumentoPrincipal(){
         return "111.222.333-44";
      }

    public String getDocumentoPrincipal2(){
        return  "";
    }

}
