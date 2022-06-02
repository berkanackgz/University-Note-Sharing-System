/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import dao.InternetDAO;
import entity.Internet;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author berka
 */
@Named
@SessionScoped
public class InternetBean implements Serializable {

    private Internet entity;
    private InternetDAO dao;
    private List<Internet> list;
    
    public void create(){
        this.getDao().create(entity);
        this.entity = new Internet();
    }
    public void update(){
        this.getDao().update(entity);
        this.entity = new Internet();
    }
    public void delete(){
        this.getDao().delete(entity);
        this.entity = new Internet();
    }

    public Internet getEntity() {

        if (this.entity == null) {
            this.entity = new Internet();
        }

        return entity;
    }

    public void setEntity(Internet entity) {
        this.entity = entity;
    }

    public InternetDAO getDao() {
        if( this.dao == null ){
            this.dao= new InternetDAO();
        }
        return dao;
    }

    public void setDao(InternetDAO dao) {
        this.dao = dao;
    }

    public List<Internet> getList() {
        this.list=this.getDao().readList();
        return list;
    }

    public void setList(List<Internet> list) {
        this.list = list;
    }

}
