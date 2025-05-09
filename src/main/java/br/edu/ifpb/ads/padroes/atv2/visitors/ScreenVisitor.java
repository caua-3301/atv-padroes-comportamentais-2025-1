package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.interfaces.Visitor;
import br.edu.ifpb.ads.padroes.atv2.model.Product;
import br.edu.ifpb.ads.padroes.atv2.model.Service;

/**
 * Classe que visita itens com o objetivo de exibi-los
 * */
public class ScreenVisitor implements Visitor {
    @Override
    public void visite(Product product) {
        System.out.println("Product Name: "
                + product.getName()
                + "\nProduct Price: " + product.getPrice());
    }

    @Override
    public void visite(Service service) {
        System.out.println("Service Description: "
                + service.getDescription()
                + "\nService Value: " + service.getValue());
    }
}
