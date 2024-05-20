import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("O que você deseja fazer?");
            System.out.println("1 – Cadastrar novo veículo");
            System.out.println("2 – Editar veículo");
            System.out.println("3 – Ver informações de um veículo específico");
            System.out.println("4 – Excluir um veículo");
            System.out.println("5 – Ver todos os veículos");
            System.out.println("6 – Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    editarVeiculo();
                    break;
                case 3:
                    verInformacoesVeiculo();
                    break;
                case 4:
                    excluirVeiculo();
                    break;
                case 5:
                    verTodosVeiculos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    private static void cadastrarVeiculo() {
        System.out.println("Qual tipo de veículo será cadastrado?");
        System.out.println("1 – Carro");
        System.out.println("2 – Moto");
        System.out.println("3 – Caminhão");
        System.out.println("4 – Bicicleta");
        System.out.println("5 – Voltar ao menu inicial");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 5) {
            return;
        }

        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Combustível (G/A/F/E/D): ");
                char combustivelCarro = scanner.next().charAt(0);
                System.out.print("Quantidade de portas: ");
                int portas = scanner.nextInt();
                veiculos.add(new Carro(codigo, cor, marca, modelo, valor, combustivelCarro, portas));
                break;
            case 2:
                System.out.print("Combustível (G/A/F/E/D): ");
                char combustivelMoto = scanner.next().charAt(0);
                System.out.print("Partida elétrica (true/false): ");
                boolean partidaEletrica = scanner.nextBoolean();
                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt();
                veiculos.add(new Moto(codigo, cor, marca, modelo, valor, combustivelMoto, partidaEletrica, cilindradas));
                break;
            case 3:
                System.out.print("Combustível (G/A/F/E/D): ");
                char combustivelCaminhao = scanner.next().charAt(0);
                System.out.print("Carga máxima: ");
                int cargaMaxima = scanner.nextInt();
                System.out.print("Número de eixos: ");
                int eixos = scanner.nextInt();
                veiculos.add(new Caminhao(codigo, cor, marca, modelo, valor, combustivelCaminhao, cargaMaxima, eixos));
                break;
            case 4:
                System.out.print("Freio (C/V/F/M/H): ");
                char freio = scanner.next().charAt(0);
                veiculos.add(new Bicicleta(codigo, cor, marca, modelo, valor, freio));
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
        }
    }

    private static void editarVeiculo() {
        System.out.print("Código do veículo a ser editado: ");
        String codigo = scanner.nextLine();
        Veiculo veiculo = encontrarVeiculo(codigo);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        System.out.println("Informações atuais do veículo:");
        veiculo.exibirInformacoes();

        System.out.print("Nova cor: ");
        veiculo.setCor(scanner.nextLine());
        System.out.print("Nova marca: ");
        veiculo.setMarca(scanner.nextLine());
        System.out.print("Novo modelo: ");
        veiculo.setModelo(scanner.nextLine());
        System.out.print("Novo valor: ");
        veiculo.setValor(scanner.nextDouble());
        scanner.nextLine();

        if (veiculo instanceof Automotor) {
            Automotor automotor = (Automotor) veiculo;
            System.out.print("Novo combustível (G/A/F/E/D): ");
            automotor.setCombustivel(scanner.next().charAt(0));
        }

        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.print("Nova quantidade de portas: ");
            carro.setQuantidadePortas(scanner.nextInt());
        } else if (veiculo instanceof Moto) {
            Moto moto = (Moto) veiculo;
            System.out.print("Nova partida elétrica (true/false): ");
            moto.setPartidaEletrica(scanner.nextBoolean());
            System.out.print("Novas cilindradas: ");
            moto.setCilindradas(scanner.nextInt());
        } else if (veiculo instanceof Caminhao) {
            Caminhao caminhao = (Caminhao) veiculo;
            System.out.print("Nova carga máxima: ");
            caminhao.setCargaMaxima(scanner.nextInt());
            System.out.print("Novo número de eixos: ");
            caminhao.setNumeroEixos(scanner.nextInt());
        } else if (veiculo instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) veiculo;
            System.out.print("Novo freio (C/V/F/M/H): ");
            bicicleta.setFreio(scanner.next().charAt(0));
        }
    }

    private static void verInformacoesVeiculo() {
        System.out.print("Código do veículo: ");
        String codigo = scanner.nextLine();
        Veiculo veiculo = encontrarVeiculo(codigo);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
        } else {
            veiculo.exibirInformacoes();
        }
    }

    private static void excluirVeiculo() {
        System.out.print("Código do veículo a ser excluído: ");
        String codigo = scanner.nextLine();
        Veiculo veiculo = encontrarVeiculo(codigo);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
        } else {
            veiculos.remove(veiculo);
            System.out.println("Veículo removido.");
        }
    }

    private static void verTodosVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo veiculo : veiculos) {
                veiculo.exibirInformacoes();
                System.out.println("-------------------");
            }
        }
    }

    private static Veiculo encontrarVeiculo(String codigo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getCodigo().equals(codigo)) {
                return veiculo;
            }
        }
        return null;
    }
}
