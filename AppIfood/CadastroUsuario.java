package AppIfood;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {

  private ArrayList<Usuario> usuarios; // uma lista de usuários cadastrados
  private Scanner sc; // um scanner para ler os dados do usuário

  public CadastroUsuario() {
    usuarios = new ArrayList<Usuario>(); // inicializa a lista de usuários
    sc = new Scanner(System.in); // inicializa o scanner
  }

  public void cadastrarUsuario() {
    System.out.println("Digite os dados do usuário que deseja cadastrar:");
    System.out.print("Nome: ");
    String nome = sc.nextLine(); // lê o nome do usuário
    System.out.print("Email: ");
    String email = sc.nextLine(); // lê o email do usuário
    System.out.print("Senha: ");
    String senha = sc.nextLine(); // lê a senha do usuário
    System.out.print("Endereço: ");
    String endereco = sc.nextLine(); // lê o endereço do usuário
    System.out.print("Telefone: ");
    String telefone = sc.nextLine(); // lê o telefone do usuário

    Usuario usuario = new Usuario(nome, email, senha, endereco, telefone); // cria um objeto da classe Usuario com os dados informados
    usuarios.add(usuario); // adiciona o usuário na lista de usuários cadastrados
    System.out.println("Usuário cadastrado com sucesso!");
  }

  public ArrayList<Usuario> getUsuarios() {
    return usuarios; // retorna a lista de usuários cadastrados
  }
}