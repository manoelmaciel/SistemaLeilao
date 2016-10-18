/* 
 * Sistema Leilão - Versão 1 
 * Adaptado para o Tutorial
 * Por: Manoel Braz Maciel
 * 
 */

package fontes_Versao1;

public class Lance {
    
    private Usuario usuario;
	
    private Double valor;

    public Lance(Usuario usuario, Double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Double getValor() {
        return valor;
    }
}
