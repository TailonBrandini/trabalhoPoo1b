package questao1.src;

import questao1.lib.InOut;

public class Sessao {
    
    boolean statusSecao;
    String horario;
    Sala sessao;


    public void criarSessao(){
        Sessao novaSessao = new Sessao();
        novaSessao.statusSecao = true;
        novaSessao.horario = InOut.leString("Qual será o horário dessa sessão");
        

    }




    public boolean getStatusSecao() {
        return statusSecao;
    }

    public void setStatusSecao(boolean statusSecao) {
        this.statusSecao = statusSecao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
