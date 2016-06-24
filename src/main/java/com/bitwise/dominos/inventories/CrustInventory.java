package com.bitwise.dominos.inventories;

import com.bitwise.dominos.basicingredients.Crust;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public enum CrustInventory implements CrustSelector {
     //defining the crust constants
    PanPizza(()->new Crust("Pan Pizza",100)),
    ThinCrust(()->new Crust("Thin Crust",150)),
    Regular(()->new Crust("Regular",0)),
    CheeseBurst(()->new Crust("Cheese Burst",200));

    private CrustSelector crustSelected;
    CrustInventory(CrustSelector crust){
        this.crustSelected=crust;
    }
    @Override
    public Crust crust() {
        return this.crustSelected.crust();
    }
}

