/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.ÜrünDAO;
import entity.Ürün;
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
    private List<Ürün> list;
    private Ürün entity;

    public ÜrünBean() {

    }

    public void create() {
        this.getDao().create(entity);
        this.entity = new Ürün();
    }

    public void update() {
        this.getDao().update(getEntity());
        this.entity = new Ürün();
    }

    public void delete(Ürün entity) {
        this.getDao().delete(entity);
        this.entity = new Ürün();
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

    public List<Ürün> getList() {
        list = getDao().getList();
        return list;
    }

    public void setList(List<Ürün> list) {
        this.list = list;
    }

    public Ürün getEntity() {
        if (this.entity == null) {
            this.entity = new Ürün();
        }
        return entity;
    }

    public void setEntity(Ürün entity) {
        this.entity = entity;
    }

}
