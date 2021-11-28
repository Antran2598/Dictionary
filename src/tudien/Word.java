/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

/**
 *
 * @author ADMIN
 */
public class Word {
    public String ta;
    public String tv;
    public String vd;

    public Word() {
    }

    public Word(String ta, String tv, String vd) {
        this.ta = ta;
        this.tv = tv;
        this.vd = vd;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getVd() {
        return vd;
    }

    public void setVd(String vd) {
        this.vd = vd;
    }

    @Override
    public String toString() {
        return tv + ";" + ta + ";" + vd; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean equals(Object obj){
        return(obj instanceof Word)?(((Word)obj).getTa()==this.ta):false;
    }  
}

