
import java.util.ArrayList;
import java.util.Scanner;

public class ControleDespesas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n===== CONTROLE DE DESPESAS =====");
            System.out.println("1 - Adicionar despesa");
            System.out.println("2 - Listar despesas");
            System.out.println("3 - Mostrar total gasto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Descricao da despesa: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Valor da despesa: R$ ");
                    double valor = scanner.nextDouble();

                    descricoes.add(descricao);
                    valores.add(valor);

                    System.out.println("Despesa adicionada!");
                    break;

                case 2:
                    System.out.println("\n===== DESPESAS =====");

                    if (descricoes.isEmpty()) {
                        System.out.println("Nenhuma despesa cadastrada.");
                    } else {
                        for (int i = 0; i < descricoes.size(); i++) {
                            System.out.printf(
                                "%d - %s: R$ %.2f%n",
                                i + 1,
                                descricoes.get(i),
                                valores.get(i)
                            );
                        }
                    }
                    break;

                case 3:
                    double total = 0;

                    for (double gasto : valores) {
                        total += gasto;
                    }

                    System.out.printf(
                        "Total gasto: R$ %.2f%n", total
                    );
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }

        scanner.close();
    }
}
