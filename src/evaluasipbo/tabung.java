
package evaluasipbo;

public class tabung extends bangunruang{
    double ttabung = getTtabung();
    double dtabung = getDtabung();
     bangunruang tabungku = new bangunruang();
     double bagi = tabungku.getDtabung();
     double jari = bagi/2;
    double volumetabung (){
        double volumetabung =   (jari*jari*22/7) *ttabung;
        return volumetabung;
   }
}
