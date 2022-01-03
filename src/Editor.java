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
    
    public String read(String directory){
        try (FileReader read = new FileReader(directory)) {
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
        if(new java.io.File(address).exists()){
            try(FileWriter write = new FileWriter(address)){
                BufferedWriter buff = new BufferedWriter(write);
                for(int i=0; i < text.length(); i++)buff.write(text.charAt(i) == 13 ? "" : text.charAt(i) + "");
                buff.flush();
            }catch(IOException ex){
                 javax.swing.JOptionPane.showMessageDialog(null,"¡Error al tratar de guardar el archivo!");
            }
        }
        
        else {
            try(FileWriter write = new FileWriter(address)){
            BufferedWriter buff = new BufferedWriter(write);
            for(int i=0; i < text.length(); i++)buff.write(text.charAt(i) == 13 ? "" : text.charAt(i) + "");
            buff.flush();
            }catch(IOException ex){
                 javax.swing.JOptionPane.showMessageDialog(null,"¡Error al tratar de guardar el archivo!");
            }
        }
        
    }
}
