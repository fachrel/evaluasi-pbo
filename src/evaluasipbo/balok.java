
package evaluasipbo;


public class balok extends bangunruang{
    double panjang = getPanjang();
    double lebar = getLebar();
    double tinggi = getTinggi();
    
  
    double volumebalok(){
        double volumebalok =lebar *panjang * tinggi;
        return volumebalok;
    }
}
