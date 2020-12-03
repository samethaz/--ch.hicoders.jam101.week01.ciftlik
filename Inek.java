package ciftlik;


public class Inek
{  public static int  Sinek=0;
    public String isim;
    public Inek()
    {
        Sinek++;
        isim="inek";
        topla();
        isim=isim+ Sinek;
    }
    public Inek(String isim)
    {
        Sinek++;
        topla();
        this.isim=isim+ Sinek;
    }
    public static int topla(){

        return Tavuk.Stavuk+Inek.Sinek;

    }
}


