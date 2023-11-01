/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kieup
 */
public class CartObject {
        private List<CartItem> items;
    
     public CartObject() {
        items = new ArrayList<>();
    }
     
    public List<CartItem> getItem() {
        return items;
    }

    public void setItem(List<CartItem> items) {
        this.items = items;
    }
    
    public void addItemToCart(CartItem item){
        boolean isExist = false;
        for(CartItem cartItem : items){
            if(cartItem.getProductName().equals(item.getProductName())){
                cartItem.setIquantity(cartItem.getIquantity()+1);
                isExist = true;
            }
        }
        if(!isExist){
            item.setIquantity(1);
            items.add(item);
        }
    }
    
    public void removeItemFromCart(String title){
        for(CartItem item : items){
            if(item.getProductName().equals(title)){
            items.remove(item);
            break;
        }
    }
    }
     public CartItem findCartItemById(String id) {
        for (CartItem item : items) {
            if (item.getProductID().equals(id)) {
                return item;
            }
        }
        return null; // Return null if the item with the specified ID is not found
    }
     public double getTotalMoney(){
        double t = 0;
        for(CartItem i : items){
            t += (i.getIquantity()*i.getProductPrice());
        }
        return t;
    }
}
