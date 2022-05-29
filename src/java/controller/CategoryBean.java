/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import converter.CategoryDAO;
import entity.Category;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author CASPER
 */
@Named(value = "categoryBean")
@SessionScoped
public class CategoryBean implements Serializable {
    private Category entity;
    private CategoryDAO dao;
    private List<Category> list;

    /**
     * Creates a new instance of CategoryBean
     */
    public CategoryBean() {
        //bütün hepsi private tanımlanmalı
        
        
    }

    public Category getEntity() {
        if(this.entity==null){
            this.entity=new Category();
        }
        return entity;
    }

    public void setEntity(Category entity) {
        this.entity = entity;
    }

    public CategoryDAO getDao() {
        if(this.dao==null){
            this.dao=new CategoryDAO();
        }
        return dao;
    }

    public void setDao(CategoryDAO dao) {
        this.dao = dao;
    }

    public List<Category> getList() {
        
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }
    
}
