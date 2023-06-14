package com.uep.wap.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Warehouse")
public class Warehouse{
    @Id
    @Column(name ="id")
    private long id;
    @Column(name ="name")
    private String name;
    @Column(name ="adress")
    private String adress;
    @Column(name ="phone")
    private String phone;
    @Column(name = "products")
    private List<Product> myList = new ArrayList<Product>();
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public Warehouse(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public String getAdress() {
        return adress;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Warehouse(String name, String adress, String phone){

    }
}

