package com.PBO;

public class MethodVoid {
    public static void main(String[] args) {

        //void itu artinya hampa

        System.out.println(simple());
        fungsiVoid("apapun");
        selamatPagi("Emak");
        selamatPagi("Abah");
    }
    private static void selamatPagi(String nama){
        System.out.println("Selamat Pagi " + nama);
    }

    //fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    //fungsi atau method dengan kembalian sehingga menggunakan return untuk mengembalikan nilainya
    private static float simple(){
        return 10.0f;
    }
}

