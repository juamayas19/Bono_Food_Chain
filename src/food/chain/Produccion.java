/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.chain;

/**
 *
 * @author juamayas
 */
public abstract class Produccion {
    protected String Production_Date;
    protected String Exit_Date;
    protected String Productor;
    protected String Receptor;
    protected String Name;

    public Produccion(String Production_Date, String Exit_Date, String Productor, String Receptor, String Name) {
        this.Production_Date = Production_Date;
        this.Exit_Date = Exit_Date;
        this.Productor = Productor;
        this.Receptor = Receptor;
        this.Name = Name;
    }

    public String getProduction_Date() {
        return Production_Date;
    }

    public String getExit_Date() {
        return Exit_Date;
    }

    public String getProductor() {
        return Productor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public String getName() {
        return Name;
    }

    public void setProduction_Date(String Production_Date) {
        this.Production_Date = Production_Date;
    }

    public void setExit_Date(String Exit_Date) {
        this.Exit_Date = Exit_Date;
    }

    public void setProductor(String Productor) {
        this.Productor = Productor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
