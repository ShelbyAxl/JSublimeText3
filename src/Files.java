/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Files {
    
    //Properties
    String name, directory, text, type;
    byte tab;
    
    //Functions
    public Files(String name, String directory, String text, String type, byte tab){
        this.name = name;
        this.directory = directory;
        this.text = text;
        this.type = type;
        this.tab = tab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getTab() {
        return tab;
    }

    public void setTab(byte tab) {
        this.tab = tab;
    }
}
