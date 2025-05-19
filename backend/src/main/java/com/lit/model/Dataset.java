package com.lit.model;

import jakarta.persistence.*;

@Entity
@Table(name="dataset")
    public class Dataset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="name")
    private  String variableName;

    @Column(name="value")
    private String value;

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public Dataset() {
    }

    public Dataset(int id, String variableName, String value) {
        this.id = id;
        this.variableName = variableName;
        this.value = value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public int getId() {
        return id;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getValue() {
        return value;
    }

}
