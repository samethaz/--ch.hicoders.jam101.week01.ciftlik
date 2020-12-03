package ciftlik;


public class Tavuk
{   public static int  Stavuk=0;
    public String isim;
    public Tavuk()
    {
        Stavuk++;
        topla();
        isim="tavuk";
        isim=isim+ Stavuk;
    }
    public Tavuk(String isim)
    {
        Stavuk++;
        topla();
        this.isim=isim+ Stavuk;
    }
    public static int topla(){

        return Stavuk+Inek.Sinek;

    }
}
