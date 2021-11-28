package com.learn.spring.project.springbootapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parts {
    @Id
    @GeneratedValue
    private Integer partID;
    private String partName;
    private int partInStock;


    public Integer getPartID() {
        return partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartID(Integer partID) {
        this.partID = partID;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }


    public int getPartInStock() {
        return partInStock;
    }

    public void setPartInStock(int partInStock) {
        this.partInStock = partInStock;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "partID=" + partID +
                ", partName='" + partName + '\'' +
                ", partInStock=" + partInStock +
                '}';
    }
}
