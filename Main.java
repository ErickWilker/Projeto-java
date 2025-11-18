import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo:");
        System.out.println("Digite 1 para Carro ou 2 para Moto:");
        int escolhaVeiculo = scanner.nextInt();

        // Adicionando a escolha da cor
        System.out.println("Escolha a cor do veículo:");
        System.out.println("Digite 0 para Branco");
        System.out.println("Digite 1 para Preto");
        System.out.println("Digite 2 para Azul");
        System.out.println("Digite 3 para Verde");
        System.out.println("Digite 4 para Vermelho");
        int escolhaCor = scanner.nextInt();

        // Definindo a cor escolhida
        String cor;
        switch (escolhaCor) {
            case 0:
                cor = "Branco";
                break;
            case 1:
                cor = "Preto";
                break;
            case 2:
                cor = "Azul";
                break;
            case 3:
                cor = "Verde";
                break;
            case 4:
                cor = "Vermelho";
                break;
            default:
                cor = "Cor não definida"; // Caso o usuário insira uma opção inválida
                System.out.println("Opção inválida. A cor será definida como 'Cor não definida'.");
                break;
        }

        if (escolhaVeiculo == 1) {
            // Criando um carro e pedindo os atributos

            // Escolha do modelo do carro
            System.out.println("Escolha o modelo do Carro:");
            System.out.println("Digite 0 para Hatch ou 1 para Sedan:");
            int escolhaModeloCarro = scanner.nextInt();
            String modeloCarro;
            if (escolhaModeloCarro == 0) {
                modeloCarro = "Hatch";
            } else {
                modeloCarro = "Sedan";
            }

            System.out.println("Você escolheu um Carro.");
            System.out.println("Digite 1 para Carro com teto solar ou 0 para sem teto solar:");
            int tetoSolar = scanner.nextInt();

            System.out.println("Digite 1 para Carro aberto ou 0 para fechado:");
            int aberto = scanner.nextInt();

            Carro carro = new Carro(cor, "ABC-1234", modeloCarro, tetoSolar);
            carro.setAberto(aberto);
            carro.exibirInformacoes(); // Exibe as informações específicas do carro

            // Pergunta se o carro deve ser ligado
            System.out.println("Digite 1 para ligar o carro ou 0 para manter desligado:");
            int ligarCarro = scanner.nextInt();

            if (ligarCarro == 1) {
                carro.ligar();
                // Pergunta se o carro deve se mover
                System.out.println("Digite 1 para mover o carro ou 0 para manter parado:");
                int moverCarro = scanner.nextInt();

                if (moverCarro == 1) {
                    carro.mover(); // O carro só vai se mover se estiver ligado

                    // Pergunta se o carro deve parar, mas só faz sentido se ele estiver em movimento
                    System.out.println("Digite 1 para parar o carro ou 0 para continuar:");
                    int pararCarro = scanner.nextInt();

                    if (pararCarro == 1) {
                        carro.parar();
                    }
                } else {
                    System.out.println("O carro permanece parado.");
                }
            } else {
                System.out.println("O carro permanece desligado.");
            }

        } else if (escolhaVeiculo == 2) {
            // Criando uma moto e pedindo os atributos

            // Escolha do modelo da moto
            System.out.println("Escolha o modelo da Moto:");
            System.out.println("Digite 0 para CB ou 1 para FAN:");
            int escolhaModeloMoto = scanner.nextInt();
            String modeloMoto;
            if (escolhaModeloMoto == 0) {
                modeloMoto = "CB";
            } else {
                modeloMoto = "FAN";
            }

            System.out.println("Você escolheu uma Moto.");
            System.out.println("Digite 1 para Moto com freio ABS ou 0 para sem freio ABS:");
            int freioAbs = scanner.nextInt();

            System.out.println("Digite 1 para Moto com baú ou 0 para sem baú:");
            int bau = scanner.nextInt();

            Moto moto = new Moto(cor, "XYZ-5678", modeloMoto, freioAbs, bau);
            moto.exibirInformacoes(); // Exibe as informações específicas da moto

            // Pergunta se a moto deve ser ligada
            System.out.println("Digite 1 para ligar a moto ou 0 para manter desligada:");
            int ligarMoto = scanner.nextInt();

            if (ligarMoto == 1) {
                moto.ligar();
                // Pergunta se a moto deve se mover
                System.out.println("Digite 1 para mover a moto ou 0 para manter parada:");
                int moverMoto = scanner.nextInt();

                if (moverMoto == 1) {
                    moto.mover(); // A moto só vai se mover se estiver ligada

                    // Pergunta se a moto deve parar, mas só faz sentido se ela estiver em movimento
                    System.out.println("Digite 1 para parar a moto ou 0 para continuar:");
                    int pararMoto = scanner.nextInt();

                    if (pararMoto == 1) {
                        moto.parar();
                    }
                } else {
                    System.out.println("A moto permanece parada.");
                }
            } else {
                System.out.println("A moto permanece desligada.");
            }

        } else {
            System.out.println("Opção inválida! Escolha 1 para Carro ou 2 para Moto.");
        }

        // Fechar o Scanner
        scanner.close();
    }
}
