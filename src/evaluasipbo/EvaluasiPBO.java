
package evaluasipbo;

public class EvaluasiPBO {

    public static void main(String[] args) {

    no1();
    no2();
    no3();
    no4();
    no5();
    no6();
    no7();
    no8();
    no9();
    no10();
    }
    
 static void no1 (){
     kubus kbs = new kubus();
     double cm3 = kbs.VolumeRusuk();
     double liter = cm3 /1000;
     System.out.println("kapasitas" + liter + "Liter");
 }
static void no2(){
    balok blk = new balok();
    System.out.println(blk.volumebalok());
}
static void no3(){
    prisma1 prsm1 = new prisma1();
    System.out.println(prsm1.volumeprisma1());
}
static void no4(){
    prisma2 bnykkbs = new prisma2();
    System.out.println(bnykkbs.banyakkubus());
}
static void no5(){
    kubus2 kubus =  new kubus2();
    System.out.println(kubus.Volumekubus());
}
static void no6(){
    prisma3 prismak = new prisma3();
    System.out.println(prismak.volumeprisma12());
}
static void no7(){
    tabung haha = new tabung();
    System.out.println(haha.volumetabung());
    
}
static void no8(){
    tabung2 hihi = new tabung2 ();
    System.out.println(hihi.volumetabung2());
}
static void no9(){
    tabung3 huhu = new tabung3 ();
    System.out.println(huhu.volumetabung3());
}
static void no10(){
    prislok iiii = new prislok();
    double vbalok= iiii.volumebalok1();
    double vprisma = iiii.volumeprisma13();
    double hasil=vbalok + vprisma;
    System.out.println(hasil);
}}