
package paginafifosc;

public class Ram {
    PaginaFifoSc[] paginas;
    int tamanho;

    public Ram(int tamanho) {
        this.tamanho = tamanho;
        paginas = new PaginaFifoSc[tamanho];
    }

    public boolean contemPagina(int instrucao) {
        for (PaginaFifoSc pagina : paginas) {
            if (pagina != null && pagina.instrucao == instrucao) {
                return true;
            }
        }
        return false;
    }

    public void resetarBitsDeReferencia() {
        for (PaginaFifoSc pagina : paginas) {
            if (pagina != null) {
                pagina.bitReferencia = 0;
            }
        }
    }
}