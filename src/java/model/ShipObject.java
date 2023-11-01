/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Duy Hai
 */
public class ShipObject {

    private List<List<Ship>> listShipOfCus = new ArrayList<>();

    public ShipObject() {
    }

    public List<List<Ship>> getListShipOfCus() {
        return listShipOfCus;
    }

    public void setListShipOfCus(List<List<Ship>> listShipOfCus) {
        this.listShipOfCus = listShipOfCus;
    }

    public void AddtoList(List<image> listImageOfCus, List<Ship> listShip) {
        for (int i = 0; i < listShip.size(); i++) {
            for (int j = 0; j < listImageOfCus.size(); j++) {
                if (listShip.get(i).getProductID().equalsIgnoreCase(listImageOfCus.get(j).getProductID())) {
                    listShip.get(i).setImage(listImageOfCus.get(j).getImage());
                    listShip.get(i).setImageId(listImageOfCus.get(j).getImageId());
                    listShip.get(i).setProductID(listImageOfCus.get(j).getProductID());
                    listShip.get(i).setProductName(listImageOfCus.get(j).getProductName());
                    listShip.get(i).setProductPrice(listImageOfCus.get(j).getProductPrice());
                    listShip.get(i).setProductDetail(listImageOfCus.get(j).getProductDetail());
                    listShip.get(i).setCreateDate(listImageOfCus.get(j).getCreateDate());
                    listShip.get(i).setQuantity(listImageOfCus.get(j).getQuantity());
                    listShip.get(i).setCategoryID(listImageOfCus.get(j).getCategoryID());
                    listShip.get(i).setStatus(listImageOfCus.get(j).getStatus());
                }
            }
        }
        for(int i=0; i < listShip.size();i++){
            for(int j=i+1; j < listShip.size();j++){
                if(listShip.get(i).getShipID()>listShip.get(j).getShipID()){
                    Collections.swap(listShip, i, j);
                }
            }
        }
        for (int i = 0; i < listShip.size(); i++) {
            List<Ship> ProductIn1Order = new ArrayList<>();
            ProductIn1Order.add(listShip.get(i));
            for (int k = i; k < listShip.size(); k++) {
                if (listShip.get(i).getShipID() == listShip.get(k).getShipID()) {
                    ProductIn1Order.add(listShip.get(k));
                } else {
                    i = k;
                    break;
                }
            }
            listShipOfCus.add(ProductIn1Order);
        }
    }
}
