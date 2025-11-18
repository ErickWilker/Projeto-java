public class Carro extends Automovel {
    // Atributos específicos do Carro
    private int tetoSolar; // 0 - não, 1 - sim
    private int aberto;    // 0 - fechado, 1 - aberto

    // Construtor
    public Carro(String cor, String placa, String modelo, int tetoSolar) {
        super(cor, placa, modelo); // Chama o construtor da classe Automovel
        this.tetoSolar = tetoSolar;
        this.aberto = 0; // Inicialmente o carro está fechado
    }

    // Método para abrir ou fechar o carro
    public void abrirFechar() {
        if (aberto == 0) {
            aberto = 1;
            System.out.println("Carro aberto.");
        } else {
            aberto = 0;
            System.out.println("Carro fechado.");
        }
    }

    // Setter para o atributo aberto (com base na escolha do usuário)
    public void setAberto(int aberto) {
        this.aberto = aberto;
    }

    // Método para exibir as informações específicas do carro
    public void exibirInformacoes() {
        System.out.println("Carro:");
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Teto solar: " + (tetoSolar == 1 ? "Sim" : "Não"));
        System.out.println("Aberto: " + (aberto == 1 ? "Sim" : "Não"));
    }
}
