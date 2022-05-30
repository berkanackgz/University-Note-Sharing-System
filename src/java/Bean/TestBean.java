/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;


import jakarta.faces.context.SessionMap;
import jakarta.inject.Named;
import java.io.Serializable;

/*

*/
@Named
@SessionMap
public class TestBean implements Serializable {
    private String name;
    public TestBean() {
        
        this.name="TestBeans sınıfı first kod";
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
