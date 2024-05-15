import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Listar empregados");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do empregado:");
                    String nome = scanner.next();
                    System.out.println("Digite a idade do empregado:");
                    int idade = scanner.nextInt();
                    System.out.println("Digite o salário do empregado:");
                    double salario = scanner.nextDouble();
                    Empregado empregado = new Empregado(nome, idade, salario);
                    empregados.add(empregado);
                    System.out.println("Empregado criado com sucesso.");
                    break;
                case 2:
                    if (empregados.isEmpty()) {
                        System.out.println("Não há empregados para promover.");
                        break;
                    }
                    System.out.println("Selecione o empregado para promover:");
                    int indiceEmpregado = scanner.nextInt(); 
                    empregados.get(indiceEmpregado).promover();
                    System.out.println("Empregado promovido com sucesso.");
                    break;
                case 3:
                    if (empregados.isEmpty()) {
                        System.out.println("Não há empregados para aumentar o salário.");
                        break;
                    }
                    System.out.println("Selecione o empregado para aumentar o salário:");
                    indiceEmpregado = scanner.nextInt();
                    System.out.println("Digite o percentual de aumento:");
                    double percentual = scanner.nextDouble();
                    empregados.get(indiceEmpregado).aumentarSalario(percentual);
                    System.out.println("Salário do empregado aumentado com sucesso.");
                    break;
                case 4:
                    if (empregados.isEmpty()) {
                        System.out.println("Não há empregados para demitir.");
                        break;
                    }
                    System.out.println("Selecione o empregado para demitir:");
                    indiceEmpregado = scanner.nextInt();
                    System.out.println("Digite o motivo da demissão:");
                    int motivo = scanner.nextInt();
                    empregados.get(indiceEmpregado).demitir(motivo);
                    empregados.remove(indiceEmpregado);
                    System.out.println("Empregado demitido com sucesso.");
                    break;
                case 5:
                    if (empregados.isEmpty()) {
                        System.out.println("Não há empregados para fazer aniversário.");
                        break;
                    }
                    System.out.println("Selecione o empregado para fazer aniversário:");
                    indiceEmpregado = scanner.nextInt();
                    empregados.get(indiceEmpregado).fazerAniversario();
                    System.out.println("Aniversário do empregado registrado com sucesso.");
                    break;
                    case 6:
                    System.out.println("Lista de empregados:");
                    int indice = 1;
                    for (Empregado colaborador : empregados) {
                        System.out.println("Empregado " + indice + ": " + colaborador.toString());
                        indice++;
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}