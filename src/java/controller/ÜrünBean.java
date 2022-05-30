/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.ÜrünDAO;
import entity.Product;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author berka
 */
@Named(value = "ürünBean")
@SessionScoped
public class ÜrünBean implements Serializable {

    private ÜrünDAO dao;
    private List<Product> list;
    private Product entity;

    public ÜrünBean() {

    }

    public void create() {
        this.getDao().create(entity);
        this.entity= new Product();
    }

    public void update() {
        this.getDao().update(getEntity());
        this.entity = new Product();
    }

    public void delete(Product entity) {
        this.getDao().delete(entity);
        this.entity = new Product();
    }

    public ÜrünDAO getDao() {
        if (this.dao == null) {
            this.dao = new ÜrünDAO();
        }
        return dao;
    }

    public void setDao(ÜrünDAO dao) {
        this.dao = dao;
    }

    public List<Product> getList() {
        list = getDao().getList();
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Product getEntity() {
        if (this.entity == null) {
            this.entity = new Product();
        }
        return entity;
    }

    public void setEntity(Product entity) {
        this.entity = entity;
    }

}
