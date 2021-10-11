
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class File {
    
    //Properties
    private String name, directory, text, type;
    private byte number;
    private javax.swing.JTextArea sheet;
    private javax.swing.JScrollPane scroll;
    private boolean exist;

    //Functions
    public File(String name, String directory, String text, String type, byte number, javax.swing.JTextArea sheet, javax.swing.JScrollPane scroll, boolean exist){
        this.name = name;
        this.directory = directory;
        this.text = text;
        this.type = type;
        this.number = number;
        this.exist = exist;
        this.scroll = scroll;
    }

    File(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public JTextArea getSheet() {
        return sheet;
    }

    public void setSheet(JTextArea sheet) {
        this.sheet = sheet;
    }
    
    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

}
