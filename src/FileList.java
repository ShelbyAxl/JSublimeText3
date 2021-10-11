/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class FileList {
    
    //Properties
    Nodo ini, fin;
    
    //Fuctions
    public FileList(){
        ini = fin = null;
    }
    
    public boolean newFile(File datos){
        Nodo n = new Nodo(datos);
        if(isEmpty()){
            ini = fin = n;
            ini.ant = ini.sig = fin;
            fin.sig = fin.ant = ini;
            return true;
        }
        fin.sig = n;
        ini.ant = n;
        n.ant = fin;
        n.sig = ini;
        fin = n;
        return true;
    }
    
    public boolean deleteFile(byte n){
        if(isEmpty())return false;
        if(isOnlyOne()){
            ini = fin = null;
            return true;
        }
        Nodo vt = ini;
        for(int i=0; i < n; i++)vt = vt.sig;
        vt.ant.sig = vt.sig;
        vt.sig.ant = vt.ant;
        if(vt == ini)ini = vt.sig;
        else if(vt == fin)fin = vt.ant;
        vt.sig = vt.ant = null;
        vt = null;
        return true;
    }
    
    public File findFile(javax.swing.JScrollPane tab){
        if(isEmpty())return null;
        if(isOnlyOne())return ini.getDatos();
        Nodo vt = ini;
        while(vt.getDatos().getScroll() != tab){
            vt = vt.sig;
        }
        return vt.getDatos();
    }
    
    public boolean isEmpty(){
        return ini == null;
    }
    
    public boolean isOnlyOne(){
        return ini == fin;
    }
}

 class Nodo{
    
    //Properties
    private File datos;
    protected Nodo ant, sig;
     
    //Fuctions
     public Nodo(File datos){
         ant = sig = null;
         this.datos = datos;
     }

    public File getDatos() {
        return datos;
    }

    public void setDatos(File datos) {
        this.datos = datos;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
