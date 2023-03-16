
package evaluasipbo;


public class prisma1 extends bangunruang{
    double alasprisma     = getAlasprisma();
    double tinggiprisma   = getTinggiprisma();
    double tinggiprisma2 = getTinggiprisma2();
    
    double volumeprisma1 (){
    double volumeprisma1 = 0.5* alasprisma * tinggiprisma * tinggiprisma2;
    return volumeprisma1;
    }
}
