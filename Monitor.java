
public class Monitor{
    private Integer tamanhoTela;
    private Integer iqtdArmazenamento;

    public Monitor(Integer tamanhoTela, Integer iqtdArmazenamento) {
        this.tamanhoTela = tamanhoTela;
        this.iqtdArmazenamento = iqtdArmazenamento;
    }
    
    public Integer getTamanhoTela() {
        return tamanhoTela;
    }
    public void setTamanhoTela(Integer tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
    public Integer getIqtdArmazenamento() {
        return iqtdArmazenamento;
    }
    public void setIqtdArmazenamento(Integer iqtdArmazenamento) {
        this.iqtdArmazenamento = iqtdArmazenamento;
    }

    @Override
    public String toString() {
        return "Monitor [tamanhoTela=" + tamanhoTela + ", iqtdArmazenamento=" + iqtdArmazenamento + "]";
    }
}