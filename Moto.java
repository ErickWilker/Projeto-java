public class Moto extends Automovel {
    // Atributos específicos da Moto
    private int freioAbs; // 0 - não, 1 - sim
    private int bau;      // 0 - não, 1 - sim

    // Construtor
    public Moto(String cor, String placa, String modelo, int freioAbs, int bau) {
        super(cor, placa, modelo); // Chama o construtor da classe Automovel
        this.freioAbs = freioAbs;
        this.bau = bau;
    }

    // Método para ativar o alarme
    public void alarme() {
        System.out.println("Alarme ligado.");
    }

    // Método para exibir as informações específicas da moto
    public void exibirInformacoes() {
        System.out.println("Moto:");
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Freio ABS: " + (freioAbs == 1 ? "Sim" : "Não"));
        System.out.println("Baú: " + (bau == 1 ? "Sim" : "Não"));
    }
}
