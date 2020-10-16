package com.aritmatika;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untung menampilkan aritmatika tambah, kurang, kali, bagi,
	modulus, increment dan decrement
 */
public class Aritmatika {

    public static void main(String[] args) {
	    int a = 10;
	    int b = 20;
	    int c = 25;
	    int d = 25;

	    System.out.println("a + b = " + (a + b));
	    System.out.println("a - b = " + (a - b));
	    System.out.println("a * b = " + (a * b));
	    System.out.println("b / a = " + (b / a));

	    //modulus atau sisa bagi
	    System.out.println("b % a = " + (b % a)); //0
	    System.out.println("c % a = " + (c % a)); //5
	    //post-increment
	    System.out.println("a++ = " + (a++)); //10
	    //post-decrement
	    System.out.println("b-- = "+ (b--)); //20
        //post-increment
	    System.out.println("d++ = "+ (d++)); //25
	    //pre-increment
        System.out.println("++d = "+(++d)); //27

    }
}
