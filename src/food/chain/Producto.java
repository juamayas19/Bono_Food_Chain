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
public class Producto extends Produccion {
    private ArrayList<Farmer> Mat_Primas;

    public Producto(ArrayList<Farmer> Mat_Primas, String Production_Date, String Exit_Date, String Productor, String Receptor, String Name) {
        super(Production_Date, Exit_Date, Productor, Receptor, Name);
        this.Mat_Primas = Mat_Primas;
    }

    public ArrayList<Farmer> getMat_Primas() {
        return Mat_Primas;
    }

    public void setMat_Primas(ArrayList<Farmer> Mat_Primas) {
        this.Mat_Primas = Mat_Primas;
    }
    
}
