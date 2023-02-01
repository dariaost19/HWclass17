package Homework14;

public class PerfumeTester {
    public static void main(String[] args) {
        Perfume Killian=new Perfume("Roses on ice","freshness of cucumber and the aromatic uplift of juniper berries"); //protected
        Killian.PerfumeInfo();
        Perfume TomFord=new Perfume("Ombre Leather","Cool Spices"," 100ML"); //default
        TomFord.PerfumeInfo();
        Perfume ExNihilo=new Perfume("Fleur Narcotique","Peony wrapped in woods ",325, "100Ml");
        ExNihilo.PerfumeInfo();
    }
}
