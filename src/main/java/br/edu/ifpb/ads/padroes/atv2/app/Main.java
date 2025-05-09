package br.edu.ifpb.ads.padroes.atv2.app;

import br.edu.ifpb.ads.padroes.atv2.enums.ServiceType;
import br.edu.ifpb.ads.padroes.atv2.model.Product;
import br.edu.ifpb.ads.padroes.atv2.model.Service;
import br.edu.ifpb.ads.padroes.atv2.visitors.ScreenVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitors.TaxesReportVisitor;

/**
 * Inicializa a aplicação
 * */
public class Main {
    public static void main(String[] args) {

        //instanciando produtos e servicos
        Product notebook = new Product("Notebook", "Um notebook Asus X510Ua", 2450.0);
        Product mouse = new Product("Mouse", "Mouse da logitech", 65.50);
        Service database = new Service(ServiceType.MONTH, 1250.0, "Save data");

        //Usando visitor responsável pelo relatório
        TaxesReportVisitor reportVisitor = new TaxesReportVisitor();

        //Utilizando de forma direta
        reportVisitor.visite(notebook);
        reportVisitor.visite(mouse);
        reportVisitor.visite(database);

        String report = reportVisitor.generateReport();

        System.out.println(report);

        //Utilizando o visitor referente a exibição
        ScreenVisitor screenVisitor = new ScreenVisitor();

        screenVisitor.visite(database);
        screenVisitor.visite(notebook);

    }
}
