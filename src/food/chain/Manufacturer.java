/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.chain;

import java.util.ArrayList;

/**
 *
 * @author juamayas
 */
public class Manufacturer extends Eslabon{
    private ArrayList<Producto> productos;
    private ArrayList<Farmer> farmers;
    private Dist_Center Distributor;

    public Manufacturer(ArrayList<Farmer> farmers, Dist_Center Distributor, String Name, String Direction, String Description) {
        super(Name, Direction, Description);
        this.productos = productos;
        this.farmers = farmers;
        this.Distributor = Distributor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Farmer> getFarmers() {
        return farmers;
    }

    public Dist_Center getDistributor() {
        return Distributor;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setFarmers(ArrayList<Farmer> farmers) {
        this.farmers = farmers;
    }

    public void setDistributor(Dist_Center Distributor) {
        this.Distributor = Distributor;
    }
}
