package com.company;

public class BabaBurger extends Hamburger {
    public BabaBurger() {
        super("baba burger", "beyaz", "kırmızı", 14.90);
        super.ekleIlaveUrun1("patates kızartması",2.90);
        super.ekleIlaveUrun2("kola",3.5);

    }

    @Override
    public void ekleIlaveUrun1(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleIlaveUrun2(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleIlaveUrun3(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleIlaveUrun4(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }
}
