public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private boolean pcd;

    public Aluno(String nome, String matricula, String email, boolean pcd) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.pcd = pcd;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String getEmail() {
    	return email;
    }

    public boolean isPcd() {
        return pcd;
    }

    public String exibirDados() {
        String status = pcd ? "Sim" : "Não";
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Email: " + email + "| PCD: " + status;
    }
}