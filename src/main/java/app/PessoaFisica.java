package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class  PessoaFisica extends Pessoa{

    private LocalDate dataNascimento;
    private String cpf;

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    @Override
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