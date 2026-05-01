public class Aluno {
    private String nome;
    private String matricula;
    private boolean pcd;

    public Aluno(String nome, String matricula, boolean pcd) {
        this.nome = nome;
        this.matricula = matricula;
        this.pcd = pcd;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isPcd() {
        return pcd;
    }

    public String exibirDados() {
        String status = pcd ? "Sim" : "Não";
        return "Nome: " + nome + " | Matrícula: " + matricula + " | PCD: " + status;
    }
}