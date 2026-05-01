import java.util.ArrayList;
import java.util.List;

public class GerenciadorEscolar {
    private List<Aluno> alunos;
    private List<AcaoInclusiva> acoes;

    public GerenciadorEscolar() {
        this.alunos = new ArrayList<>();
        this.acoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno matriculado com sucesso!");
    }

    public void registrarAcao(AcaoInclusiva acao) {
        acoes.add(acao);
        System.out.println("Ação inclusiva registrada no sistema.");
    }

    public void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.exibirDados());
        }
    }

    public void listarAcoes() {
        System.out.println("\n--- Ações Inclusivas ---");
        for (AcaoInclusiva acao : acoes) {
            System.out.println(acao.detalharAcao());
        }
    }
}