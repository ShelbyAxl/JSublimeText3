/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author ShelbyAxl
 */
public class Editor {
    
    public String read(String address){
        try (FileReader read = new FileReader(address)) {
            BufferedReader buff = new BufferedReader(read);
            String cad = "",cad2 = "";
            do cad += (cad2 = buff.readLine()) != null ? cad2  + "\n" : ""; while(cad2 != null);
            read.close();
            return cad;
        } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,"¡Error!, el Archivo no fue encontrado");
        }
        return "";
    }
    
    public void write(String text, String address){
        try(FileWriter write = new FileWriter(address)){
            BufferedWriter buff = new BufferedWriter(write);
            String cad = "", cad2;
            for(int i=0; i < text.length(); i++)buff.write(text.charAt(i) == 13 ? "" : text.charAt(i) + "");
            buff.flush();
        }catch(IOException ex){
             javax.swing.JOptionPane.showMessageDialog(null,"¡Error al tratar de guardar el archivo!");
        }
    }
}
