/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Product { 
/*
Güncellendi 25.05.22
    Get set güncellemeleri yapıldı.
*/
   private int ProductId;
   private int ProducerId;
   private boolean onaylanma_durumu;

    public Product(int ProductId, int ProducerId, boolean onaylanma_durumu) {
        this.ProductId = ProductId;
        this.ProducerId = ProducerId;
        this.onaylanma_durumu = onaylanma_durumu;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public int getProducerId() {
        return ProducerId;
    }

    public void setProducerId(int ProducerId) {
        this.ProducerId = ProducerId;
    }

    public boolean isOnaylanma_durumu() {
        return onaylanma_durumu;
    }

    public void setOnaylanma_durumu(boolean onaylanma_durumu) {
        this.onaylanma_durumu = onaylanma_durumu;
    }

    
   
    
}
