package Crypto;

public class Play {
    public static void main (String[]args){
        System.out.println(3/2); // 1
        System.out.println(-3/2); // -1
        System.out.println(Math.floor(-1.25));// floor function returns the largest whole double less that or equal
        // to the argument.
        System.out.println(Math.floor(-33.1)); // -34.0
        System.out.println(Math.floor(33.1)); // 33.0
        System.out.println(-5/2); // -2.0
        // System.out.println(Math.floor(-5/2);  evaluate argument first, the pass it to function.
        System.out.println(-5/2.0);  // not integer division. -2.5.
        System.out.println(Math.floorDiv(-3,2));

        // remainder play
        System.out.println(-15 % 12); // -3
        System.out.println(-93 % 13); //-2 (r = (x-qy), q = x/y)
        System.out.println(Math.floorMod(-15,12));// 9
        System.out.println(Math.floorMod(-93,13));// 11
        // Mod 12 floor mod follows clock arithmetic.
        // floor mod (12-2) % 12 = 10 am
        // floor mod (0-2) % 12 = 10 pm
        // floor mod (0-15) % 12 = 9 am
        // 0 is midnight and 12 is noon.
        System.out.println(Math.floorMod(123,-50));
        System.out.println(Math.floorMod(-7,26));

        // Cryptography : the science and mathematics of transforming messages into
        // "hidden" messages. Encryption and decryption
        // 1) Symmetric cryptography : sender and receiver are the same key.
        // 2) Asymmetric cryptography : Sender and receiver have their own private key but also have public keys.

        /*
        Lower case english alphabet a-z
        m = "attack"    //shifted each character by 1
        c = "buubdl"

        m = "zoo"       // z shifts back to 1. it is like clock math. Mod 26 clock instead of 12.
        shift/add by 13
        m = "attack"
        c = shift by 13
        for "a" character
        (0+13) % 26 = 13
        FOR "t" character
        (19+13) % 26 = 6
        for "c" character
        (3+13) % 26 = 16
        for "k" character
        (10+13) % 26 = 23

        shift/ subtract by 13
        for "n" character
        (13-13) % 26 = 0
        for "g" character
        (6-13) % 26 = 19
        for "q" character
        (16-13) % 26 = 3
         for "x" character
         (23-12) % 26 = 10

         unbreakable cypher =  shift every letter by different numbers and random.

         Cleartext c was encrypted with a shift of 20 (caesar) resulted in ciphertext wifx

         */



    }
}
