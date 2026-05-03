public class AcaoInclusiva {
    private String titulo;
    private String descricao;
    private String dataRealizacao;

    public AcaoInclusiva(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public String getDataRealizacao() {
    	return dataRealizacao;
    }
    
    public void setDataRealizacao(String dataRealizacao) {
    	this.dataRealizacao = dataRealizacao;
    }
    
    	
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String detalharAcao() {
        return "Ação: " + titulo + " - Detalhes: " + descricao;
    }
}