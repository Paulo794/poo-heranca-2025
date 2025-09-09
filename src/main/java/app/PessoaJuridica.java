package app;

public class PessoaJuridica{
    private String nome;
    private String endereco;
    private LocalDate datacriacao;
    private String nomeFantasia;
    private String cnpj;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public LocalDate getDatacriacao(){
        return datacriacao;
    }

    public String getNomeFantasia(){
        return nomeFantasia;
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

    public PessoaJuridica(String nome,String endereco,String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
        this.setDatacriacao(LocalDate.now());
    }

}