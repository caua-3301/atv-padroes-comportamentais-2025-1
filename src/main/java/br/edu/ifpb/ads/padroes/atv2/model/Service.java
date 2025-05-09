package br.edu.ifpb.ads.padroes.atv2.model;

import br.edu.ifpb.ads.padroes.atv2.enums.ServiceType;
import br.edu.ifpb.ads.padroes.atv2.interfaces.Visitor;

public class Service implements Item {

    private ServiceType serviceType;

    private double value;

    private String description;

    public Service(ServiceType serviceType, double price, String description) {
        this.serviceType = serviceType;
        this.value = price;
        this.description = description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
