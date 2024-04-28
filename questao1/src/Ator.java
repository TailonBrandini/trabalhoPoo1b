package questao1.src;

import java.util.ArrayList;
import java.util.List;

import questao1.lib.InOut;

public class Ator {
    
    int idAtor = 0;
    String nome;
    String papel;

    // Agregação entre Filme e Ator...
    List<Filme> atores = new ArrayList<>();

    public void criarAtor(){
        idAtor++;
        nome = InOut.leString("Qual o nome do(a) ator/atriz? ");
        papel = InOut.leString("Qual o papel de " + nome + " ?");
        

    }
    

    
    public int getIdAtor() {
        return idAtor;
    }
    public void setIdAtor(int idAtor) {
        this.idAtor = idAtor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPapel() {
        return papel;
    }
    public void setPapel(String papel) {
        this.papel = papel;
    }

}
