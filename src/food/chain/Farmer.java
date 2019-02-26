/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.chain;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juamayas
 */
public class Farmer extends Eslabon {
    private ArrayList<Cultivo> Cultivos;
    private Manufacturer Manufacturer;

    public Farmer(Manufacturer Manufacturer, String Name, String Direction, String Description) {
        super(Name, Direction, Description);
        this.Cultivos = Cultivos;
        this.Manufacturer = Manufacturer;
    }

    public ArrayList<Cultivo> getCultivos() {
        return Cultivos;
    }

    public Manufacturer getManufacturer() {
        return Manufacturer;
    }
    private ArrayList<Cultivo> leerCultivo() throws FileNotFoundException {
        ArrayList<Cultivo> cultivos = new ArrayList();
        Scanner in= new Scanner(new File("Cultivo.exe"));
        in.useDelimiter(";");
        String Production_Date=null;
        String Exit_Date=null;
        String Productor=null;
        String Receptor=null;
        String Name=null;
        while (in.hasNextLine()){
        while (in.hasNext()){
            Production_Date = in.next();
            Exit_Date= in.next();
            Productor = in.next();
            Receptor= in.next();
            Name = in.next();
        }
        cultivos.add(new Cultivo(Production_Date,Exit_Date,Productor,Receptor,Name));
        }
        return cultivos;
    }
}
