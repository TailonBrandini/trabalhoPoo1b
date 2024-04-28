package questao1.src;

import java.util.ArrayList;
import java.util.List;

import questao1.lib.InOut;

public class Filme {

    int idFilme = 0;
    String titulo;
    long duracao;
    String genero;

    // Conferir se está certo
    List<Sessao> filmes = new ArrayList<>();
    List<Ator> atoresFilme = new ArrayList<>();

    public void criarFilme() {
        idFilme++;
        titulo = InOut.leString("Título do filme: ");
        duracao = InOut.leLong("Duração do filme: "+ titulo + " ?");
        genero = InOut.leString("Qual o gênero do filme " + titulo + " ?");
        Ator atoresAtor =  new Ator();
        atoresAtor.criarAtor();
    }




    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

}
