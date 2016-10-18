/* 
 * Sistema Leilão - Versão 1 
 * Adaptado para o Tutorial
 * Por: Manoel Braz Maciel
 * 
 */
package fontes_Versao1;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private String objetoLeiloado;
	
    private List<Lance> lances;

    public Leilao(String objetoLeiloado) {
        this.objetoLeiloado = objetoLeiloado;
        this.lances = new ArrayList<Lance>();
    }

    public String getObjetoLeiloado() {
        return objetoLeiloado;
    }

    public void propoe(Lance lance) {
        this.lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }    
    
}
