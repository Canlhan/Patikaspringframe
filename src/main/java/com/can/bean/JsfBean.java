package com.can.bean;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import javax.xml.namespace.QName;

@Named(value = "cdiBean")
@RequestScoped
@Setter
@Getter
public class JsfBean {


    private String patika;

    public JsfBean() {
        this.patika="Eğitime hoş geldiniz";
    }

}
