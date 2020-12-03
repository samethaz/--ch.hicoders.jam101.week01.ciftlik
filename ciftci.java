package ciftci;
import ciftlik.*;

public class ciftci
{

    public static void main(String[] args)
    {
    Tavuk t1=new Tavuk();
    System.out.println(t1.isim);
    Inek i1=new Inek();
    System.out.println(i1.isim);
    Tavuk t2=new Tavuk("ali");
    System.out.println(t2.isim);
    Inek i2=new Inek("veli");
    System.out.println(i2.isim);
    Inek i3=new Inek("ahmet");
    System.out.println(i2.isim);
    Inek i4=new Inek("ahmet");
    System.out.println(i4.isim);
    System.out.print("Hayvan sayısı.......:"+Tavuk.topla());

}
}
