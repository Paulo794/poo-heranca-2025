package app;

import java.time.LocalDate;

public abstract class Pessoa{
    public abstract String exibirInformacoes();
    private String nome;
    private String endereco;
    private LocalDate datacriacao;

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getEndereco(){
    return endereco;
}
public void setEndereco(){
    this.endereco = endereco;
}

public LocalDate getDatacriacao(){
    return datacriacao;
}
public void setDatacriacao(LocalDate datacriacao){
    this.datacriacao = datacriacao;
}

public String exibirInformacoes(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "--- Informações da Pessoa  ---\n" +
               "Nome:" + this.getNome() +"\n" +
               "Data de Nascimento:" + this.getDataNascimento().format(formatador) + "\n" +
               "Endereço:" + this.getEndereco() + "\n" +
               "------------------------------------";
    }

public Pessoa(String nome, String endereco){
    this.setNome(nome);
    this.Endereco(endereco);
    this.setDatacriacao(LocalDate.now());

}
}