public class AcaoInclusiva {
    private String titulo;
    private String descricao;

    public AcaoInclusiva(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
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