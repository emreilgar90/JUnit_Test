package com.junit;

public class Operations {
    public int total(int s1,int s2){
        return s1+s2;
    }

    public double division(double s1,double s2) throws Exception{
        if (s2==0){
            throw new Exception("Sifira bolme hatası");
        }else {
            return s1/s2;
        }
    }
    public int multiplication(int... sayiList){
        int multiplication=1;
        for (int sayi: sayiList) {
            multiplication*=sayi;

        }
        return multiplication;
    }
}
