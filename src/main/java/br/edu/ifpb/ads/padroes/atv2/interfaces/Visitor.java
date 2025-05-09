package br.edu.ifpb.ads.padroes.atv2.interfaces;

import br.edu.ifpb.ads.padroes.atv2.model.Product;
import br.edu.ifpb.ads.padroes.atv2.model.Service;

/**
 * Interface que abstrai as funcionalidades de produtos, seriços ou outros
 * */
public interface Visitor {
    public void visite(Product product);

    public void visite(Service service);
}
