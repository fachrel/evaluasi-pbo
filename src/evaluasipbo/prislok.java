
package evaluasipbo;
// 
public class prislok  extends bangunruang{
    double panjang1 = getPanjang1();
    double lebar1 = getLebar1();
    double tinggi1 = getTinggi1();
    
       double volumebalok1(){
        double volumebalok1 =lebar1 * panjang1 * tinggi1;
        return volumebalok1;
    }
    double alasprisma3     = getAlasprisma3();
    double tinggiprisma3   = getTinggiprisma3();
    double tinggiprisma23 = getTinggiprisma23();
    
    double volumeprisma13 (){
    double volumeprisma13 = 0.5* alasprisma3 * tinggiprisma3 * tinggiprisma23;
    return volumeprisma13;
    }
    

    
}
