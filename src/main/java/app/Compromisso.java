package app;

public class Compromisso extends Atividade{
    private String datainicial;
    private String dataFinal;

    public String getDatainicial(){
        return this.datainicial;
    }

    public  void setDatainicial(String datainicial){
        this.datainicial = datainicial
    }


    public String getDatafinal(){
        return this.dataFinal;
    }

    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }

    
    public Compromisso(long Id,String descricao, String datainicial, String dataFinal){
        this.setId(Id);
        this.setdescricao(descricao);
        this.setDatainicial(datainicial);
        this.setDataFinal(dataFinal);
    }

    public Compromisso(long Id,String descricao, String datainicial){
        this.setId(Id);
        this.setdescricao(descricao);
        this.setDatainicial(datainicial);
       
    }

}