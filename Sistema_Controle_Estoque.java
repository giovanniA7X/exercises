import java.util.*;

public class Sistema_Controle_Estoque{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();
        Map<String, String> usuarios = new HashMap<>(); // Mapa para armazenar usuários e senhas

        // Cadastrar usuários de exemplo (usuário: senha)
        usuarios.put("administrador", "admin123");
        usuarios.put("usuário", "senha");

        boolean usuarioAutenticado = false;
        String nomeUsuarioAutenticado = null;

        while (!usuarioAutenticado) {
            System.out.println("\n=== Sistema de Controle de Estoque ===");
            System.out.println("1. Login");
            System.out.println("2. Cadastro de Usuário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome de usuário: ");
                    String usuarioLogin = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senhaLogin = scanner.nextLine();

                    if (usuarios.containsKey(usuarioLogin) && usuarios.get(usuarioLogin).equals(senhaLogin)) {
                        System.out.println("Login realizado com sucesso!");
                        usuarioAutenticado = true;
                        nomeUsuarioAutenticado = usuarioLogin;
                    } else {
                        System.out.println("Usuário ou senha incorretos. Tente novamente.");
                    }
                    break;

                case 2:
                    System.out.print("Novo nome de usuário: ");
                    String novoUsuario = scanner.nextLine();

                    if (usuarios.containsKey(novoUsuario)) {
                        System.out.println("Nome de usuário já existente. Escolha outro nome.");
                    } else {
                        System.out.print("Nova senha: ");
                        String novaSenha = scanner.nextLine();
                        usuarios.put(novoUsuario, novaSenha);
                        System.out.println("Usuário cadastrado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Se o usuário estiver autenticado, exibe o menu de controle de estoque
        while (true) {
            System.out.println("\n=== Menu do Controle de Estoque ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Estoque");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Implementar lógica para adicionar produto ao estoque
                    break;

                case 2:
                    // Implementar lógica para atualizar estoque
                    break;

                case 3:
                    // Implementar lógica para exibir estoque
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
