package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica{
    private String nome;
    private String endereco;
    private LocalDate datacriacao;
    private LocalDate dataNascimento;
    private String cpf;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
      this.nome = nome  ;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
      this.endereco = endereco  ;
    }

    public LocalDate getDatacriacao(){
        return datacriacao;
    }
    public void setDatacriacao(LocalDate datacriacao){
        this.datacriacao = datacriacao;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String exibirInformacoes(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "--- Informações da Pessoa Física ---\n" +
               "Nome:" + this.getNome() +"\n" +
               "Data de Nascimento:" + this.getDataNascimento().format(formatador) + "\n" +
               "Endereço:" + this.getEndereco() + "\n" +
               "CPF:" + this.getCpf() + "\n" +
               "------------------------------------";
    }



    public PessoaFisica(String nome,String endereco, LocalDate dataNascimento, String cpf){
    this.setNome(nome);
    this.setEndereco(endereco);
    this.setCpf(cpf);
    this.setDatacriacao(LocalDate.now());
    this.setDataNascimento(dataNascimento);
    }



}