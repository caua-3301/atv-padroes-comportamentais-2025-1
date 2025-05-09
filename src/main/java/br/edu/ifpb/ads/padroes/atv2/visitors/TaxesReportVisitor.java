package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.interfaces.Visitor;
import br.edu.ifpb.ads.padroes.atv2.model.Product;
import br.edu.ifpb.ads.padroes.atv2.model.Service;
import br.edu.ifpb.ads.padroes.atv2.util.TaxesValues;

/**
 * Classe responsável pela execução dos visitantes (de itens)
 * correspondentes a geração de um relatório simples
 * */
public class TaxesReportVisitor implements Visitor {

    /**
     * Armazenará o valor dos itens apenas
     * */
    private double totalValue = 0.0;

    /**
     * Armazenará o valor dos itens junto com a taxa
     * */
    private double totalValueWithTax = 0.0;

    @Override
    public void visite(Product product) {
        System.out.println("calculate product...\n");

        totalValue += product.getPrice();
        totalValueWithTax += product.getPrice() * TaxesValues.TEN_PERCENT;
    }

    @Override
    public void visite(Service service) {
        System.out.println("calculate service...\n");

        totalValue += service.getValue();
        totalValueWithTax += service.getValue() * TaxesValues.FIFTEEN_PERCENT;
    }

    /**
     * Metodo responsavel pela emissão do relatorio
     * */
    public String generateReport() {
        String report = """
                ======== REPORT OF TOTALS =========
                
                - Total value ......... %.2f R$;
                
                - With taxes .......... %.2f R$;
                
                         java.gov.br
                """.formatted(this.totalValue, this.totalValueWithTax);

        return report;
    }

}
