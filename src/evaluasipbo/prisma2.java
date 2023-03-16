
package evaluasipbo;

public class prisma2 extends bangunruang{
    double pa    = getPa();   
    double la    = getLa();   
    double ta    = getTa();   
    double pb    = getPb();   
    double lb    = getLb();   
    double tb    = getTb(); 
    
    double banyakkubus (){
    double banyakkubus =  (pa*la*ta)/(pb*lb*tb);
    return banyakkubus;
    }
}
