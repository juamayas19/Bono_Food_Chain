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
public abstract class Eslabon {
    protected String Name;
    protected String Direction;
    protected String Description;

    public Eslabon(String Name, String Direction, String Description) {
        this.Name = Name;
        this.Direction = Direction;
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }

    public String getDirection() {
        return Direction;
    }

    public String getDescription() {
        return Description;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
