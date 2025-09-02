package app;

public class Tarefa extends Atividade{
    private boolean isConcluido;

    public boolean isConcluido() {
        return isConcluido;
    }

    public void setConcluido( boolean isConcluido) {
        this.isConcluido = isConcluido;
    }

    public Tarefa(long id ,String descricao , boolean isConcluido){
        this.setId(id);
        this.setdescricao(descricao);
        this.setConcluido(isConcluido);
    }
         
}
