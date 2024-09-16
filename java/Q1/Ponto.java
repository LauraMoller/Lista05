/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Q1;

/**
 *
 * @author molle
 */
public class Ponto {

    private int y;
    private int x;

    /**
     * Construtor que cria ponto com coordenadas 0 para X e Y
     */
    public Ponto() {
        setX(0);
        setY(0);
    }

    /**
     * Construtor que define coordenadas específicas para X e Y
     * @param x coordenada de x 
     * @param y coordenada de y
     */
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Identifica o quadrante em que o Ponto fornecido se enquadra
     * @return Quadrante em que o ponto se encaixa
     */
    public Quadrante identificarQuadrante() {
        if (y > 0 && x > 0) {
            return Quadrante.PRIMEIRO;
        } else if (y > 0 && x < 0) {
            return Quadrante.SEGUNDO;
        } else if (y < 0 && x < 0) {
            return Quadrante.TERCEIRO;
        } else if (y < 0 && x > 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }
    }

    /**
     * Verifica se o ponto está sobre o eixo das abscissas
     * @return verdairo ou falso
     */
    public boolean estaIncindindoSobreX() {
        return y == 0;
    }

    /**
     * Verifica se o ponto está sobre o eixo das ordenadas
     * @return verdairo ou falso
     */
    public boolean estaIncindindoSobreY() {
        return x == 0;
    }

    /**
     * Calcula a distância do ponto em fornecido com outro
     * @param outroPonto outro ponto fornecido
     * @return distância entre os dois pontos
     */
    public double calcularDistancia(Ponto outroPonto) {
        int diferencaX = outroPonto.getX() - this.getX();
        int diferencaY = outroPonto.getY() - this.getY();
        return Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
    }

    /**
     * Calcula a distância entre dois outros pontos
     * @param p1 ponto número 1
     * @param p2 ponto número 2
     * @return distância entre os dois pontos
     */
    public double calcularDistancia(Ponto p1, Ponto p2) {
        int diferencaX = p2.getX() - p1.getX();
        int diferencaY = p2.getY() - p1.getY();
        return Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
    }
}
