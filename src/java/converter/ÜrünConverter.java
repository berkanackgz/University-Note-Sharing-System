/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.ÜrünDAO;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author berka
 */
@FacesConverter("ürünConverter")
public class ÜrünConverter implements Converter{
    
    private ÜrünDAO ürünDao;

    public ÜrünDAO getÜrünDao() {
        if(ürünDao == null){
            this.ürünDao = new ÜrünDAO();
        }
        return ürünDao;
    }

    public void setAdisyonDao(ÜrünDAO adisyonDao) {
        this.ürünDao = adisyonDao;
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
