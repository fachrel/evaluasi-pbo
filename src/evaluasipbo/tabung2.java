
package evaluasipbo;


public class tabung2 extends bangunruang{
    double volumetbng = getVolumetbng();
    bangunruang konversi =  new bangunruang();
    double bagii = konversi.getTinggitabung();
    double dm2 = bagii/10;
    
    
    
          double volumetabung2 (){
    double volumetabung2 = Math.sqrt((volumetbng)/(dm2*3.14)) ;
    return volumetabung2;

}}
 