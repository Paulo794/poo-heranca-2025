package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
       // Tarefa[] tarefas = new Tarefa[5];
       //Compromisso[] compromissos = new Compromisso[5];
        
        //tarefas[0] = new Tarefa(0, "Teste", false);
        //tarefas[4] = new Tarefa(4,"Novo Teste", false);

        //compromissos[2] = new Compromisso(0,"Compromisso","Hoje", "Amanha");
        
        //System.out.println(tarefas[0].getdescricao());

        PessoaFisica pf = new PessoaFisica(
            "Marco",
            "Rua sem Nome,0",
            LocalDate.of(1980, Month.MARCH, 29),
            "1234323455");
        
        System.out.println(pf.exibirInformacoes());

        PessoaJuridica pj = new PessoaJuridica(
            "Fatec",
            "Av. Shunji Nisshimura",
            "Fatec Pompéia",
            "12312314000123");

        System.out.println(pj.exibirInformacoes());

        Pessoa p1 = pf;
        System.out.println(p1.exibirInformacoes());

        p1 = pj;
        System.out.println(p1.exibirInformacoes());
        p1.
    }

}