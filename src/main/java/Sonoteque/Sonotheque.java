package Sonoteque;

import Code.Son;

public class Sonotheque {

    String Path =System.getProperty("user.dir");
    Son son;
    private final String newPath = "\\src\\main\\java\\Sonoteque\\";
    public int length;
    public int frequence;

    public Sonotheque(String name) {
        this.son = new Son(Path+newPath, name);
        this.length = son.donnees().length;
        this.frequence = son.frequence();
    }

}
