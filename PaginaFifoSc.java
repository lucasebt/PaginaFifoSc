
package paginafifosc;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Arrays;
public class PaginaFifoSc {
    int numeroPagina;
    int instrucao;
    int dado;
    int bitReferencia;
    int bitModificado;
    int tempoEnvelhecimento;
    boolean segundaChance;

    public PaginaFifoSc(int numeroPagina, int instrucao, int dado, int tempoEnvelhecimento) {
        this.numeroPagina = numeroPagina;
        this.instrucao = instrucao;
        this.dado = dado;
        this.bitReferencia = 0;
        this.bitModificado = 0;
        this.tempoEnvelhecimento = tempoEnvelhecimento;
        this.segundaChance = false;
    }
}
