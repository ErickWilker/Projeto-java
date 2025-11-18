public class Automovel {
    // Atributos comuns
    protected String cor;
    protected String placa;
    protected String modelo;
    protected int ligado;       // 0 - não, 1 - sim
    protected int emMovimento;  // 0 - não, 1 - sim

    // Construtor
    public Automovel(String cor, String placa, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = 0;
        this.emMovimento = 0;
    }

    // Método para ligar o automóvel
    public void ligar() {
        ligado = 1;
        System.out.println("O automóvel está ligado.");
    }

    // Método para mover o automóvel
    public void mover() {
        if (ligado == 1) {
            emMovimento = 1;
            System.out.println("O automóvel está se movendo.");
        } else {
            System.out.println("O automóvel precisa estar ligado para se mover.");
        }
    }

    // Método para parar o automóvel
    public void parar() {
        if (emMovimento == 1) {
            emMovimento = 0;
            System.out.println("O automóvel parou.");
        } else {
            System.out.println("O automóvel já está parado.");
        }
    }
}