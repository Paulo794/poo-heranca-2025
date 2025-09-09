package app;

public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;

    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void exibirInformacao(){
        System.out.println("Nome :"+this.getNome+
        "Endereco:"+this.getEndereco+
        "NomeFantasia:"+this.getNomeFantasia+
        "CNPJ:"+this.getCnpj+);
    }

    public PessoaJuridica(String nome,String endereco,String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
        this.setDatacriacao(LocalDate.now());
    }

}