package Sonoteque;
import Code.Son;


public class Sonotheque
{
    Son son;
    private String newPath="C:\\Users\\aleja\\Documents\\ISEN\\S2\\ProjetDataScience\\Projet\\ProjetJava\\src\\main\\java\\Sonoteque\\";
    public int length;
    public int frequence;
    public Sonotheque(String name) {
        this.son = new Son (newPath,name);
        this.length=son.donnees().length;
        this.frequence=son.frequence();
    }
    
}
