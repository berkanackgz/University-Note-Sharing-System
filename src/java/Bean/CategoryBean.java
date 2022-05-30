/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import converter.CategoryDAO;
import entity.Category;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import entity.Category;

/**
 *
 * @author CASPER
 */
@Named
@SessionScoped
public class CategoryBean implements Serializable{
    
    private Category entity;
    private CategoryDAO dao;
    private List<Category> list;

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
        this.list=this.getDao().readList();
        return list;
    }

    public void setList(List<Category> list) {
        this.list = list;
    }
    
    
}
