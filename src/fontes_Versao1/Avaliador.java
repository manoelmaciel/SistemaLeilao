/* 
 * Sistema Leilão - Versão 1 
 * Adaptado para o Tutorial
 * Por: Manoel Braz Maciel
 * 
 */

package fontes_Versao1;

public class Avaliador {
    
    private Double maiorDeTodos = Double.NEGATIVE_INFINITY;

    public void avalia(Leilao leilao) {
        for (Lance lance: leilao.getLances()) {
            if (lance.getValor() > maiorDeTodos) {
                    maiorDeTodos = lance.getValor();
            } 
        }
     }

    public Double getMaiorLance() {
        return maiorDeTodos;
    }
    
 }
