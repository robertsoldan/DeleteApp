/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleteapp;

import java.io.Serializable;

/**
 *
 * @author robert
 */
public class Delete implements Serializable{
    private String id;
    private String lName;
    private String fName;
    
    public Delete() {
        id = "";
        lName = "";
        fName = "";
    }

    public String getId() {
        return id;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    
    
}
