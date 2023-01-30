package edu.kelton.TiposVariaveis;
public class operadoresRelacionais {
    public static void main(String[] args) {
        
        int i1 = 10; int i2 = 20;
        float f1 = 4.5f; float f2 = 3.5f;
        char c1 = 'x'; char c2 = 'y';
        String s1 = "Fulano"; String s2 = "fulano";
        boolean b1 = true; boolean b2 = false;
        long l1 = 155l; long l2 = 2345l;
        byte y1 = 1; byte y2 = 5;

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 ! = f2: " + (f1 != f2));
        System.out.println("f1 >= f2: " + (f1 >= f2));
        System.out.println("f1 < f2: " + (f1 < f2));
    
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 != s2: " + (s1 != s2));
        //System.out.println("s1 > s2" + (s1 > s2));
        //System.out.println("s1 <= s2" + (s1 <= s2));

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));
        //System.out.println("b1 > b2" + (b1 > b2));
        //System.out.println("b1 <= b2" + (b1 <= b2));

        System.out.println("l1 == l2: " + (l1 == l2));
        System.out.println("l1 != l2: " + (l1 != l2));
        System.out.println("l1 > l2: " + (l1 > l2));
        System.out.println("l1 <= l2: " + (l1 <= l2));

        System.out.println("y1 == y2: " + (y1 == y2));
        System.out.println("y1 != y2: " + (y1 != y2));
        System.out.println("y1 > y2: " + (y1 > y2));
        System.out.println("y1 <= y2: " + (y1 <= y2));

        boolean k1 = true; boolean k2 = false; 
        boolean k3 = true; boolean k4 = false;
        System.out.println("  ");
        System.out.println("k1 && k2: " + (k1 && k2));
        System.out.println("k1 && k3: "+(k1 && k3));
        System.out.println("k2 || k3: "+(k2 || k3));
        System.out.println("k2 || k4: "+(k2 || k4));
        System.out.println("k2 ^ k3: "+(k2 ^ k3));
        System.out.println("k3 ^ k1: "+(k3 ^ k1));
        System.out.println("!k1: "+(!k1));
        System.out.println("!k2: "+(!k2));
        System.out.println(" ");
        System.out.println("(i1 > i2) || (f2 < f1): "+ ((i1 > i2) || (f2 < f1)));
        System.out.println("(i1 + i2) < (f2 - f1) && TRUE: "+ ((i1 + i2) < (f2 - f1) && true));



    }
}
