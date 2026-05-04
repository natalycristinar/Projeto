import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEscolar gerenciador = new GerenciadorEscolar();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // Dados iniciais para teste
        gerenciador.matricularAluno(new Aluno("Carlos Silva", "2026001", true));
        gerenciador.registrarAcao(new AcaoInclusiva("Rampa de Acesso", "Instalação de rampa na entrada principal"));

        while (opcao != 5) {
            System.out.println("\n=== Plataforma de Inclusão Atitudinal - SENAC ===");
            System.out.println("1. Cadastrar Novo Aluno");
            System.out.println("2. Registrar Ação Inclusiva");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Listar Ações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do Aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();
                System.out.print("É PCD? (true/false): ");
                boolean pcd = scanner.nextBoolean();
                gerenciador.matricularAluno(new Aluno(nome, matricula, pcd));
            } else if (opcao == 2) {
                System.out.print("Título da Ação: ");
                String titulo = scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                gerenciador.registrarAcao(new AcaoInclusiva(titulo, descricao));
            } else if (opcao == 3) {
                gerenciador.listarAlunos();
            } else if (opcao == 4) {
                gerenciador.listarAcoes();
            } else if (opcao == 5) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}