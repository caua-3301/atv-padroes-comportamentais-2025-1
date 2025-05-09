package br.edu.ifpb.ads.padroes.atv2.model;

import br.edu.ifpb.ads.padroes.atv2.interfaces.Visitor;

public class Product implements Item {

    private String name;

    private String description;

    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
