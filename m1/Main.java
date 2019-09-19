// on définit la classe

class Main {
  public static void main(String[] args) {

    // ************ MANIP STRINGS *******************

    // 1) On déclare un objet de type String
    String s;

    // 2) On construit cet objet
    s = new String("Hello World !");

    // On peut l'afficher:
    System.out.println(s);

    // Puis on l'affiche en MAJUSCULES
    String s1 = s.toUpperCase();
    // Qu'on affiche
    System.out.println(s1);

    //On l'affiche ensuite en minuscule
    String s2 = s.toLowerCase();
    System.out.println(s2);

    //Sous chaîne
    String s3 = s.substring(3,8);
    System.out.println(s3);

    //Verif début chaîne
    System.out.println(s.startsWith("Hello"));

    //longueur chaîne
    System.out.println(s.length());



    // ************ MANIP ID/EGALITé *******************

    // valeurs primitives (comme int ou boolean). L’opérateur == permet de tester si 2 primitives ou 2 objets sont égaux

    //Pour primitives
    int i1 = 12;
    int i2 = 12;
    System.out.println(i1 == i2);

    //Pour objets (ici String)

    String s4 = new String("test");
    String s5 = new String("test");
    System.out.println(s4 == s5);   // ne fonctionne pas
    System.out.println(s4.regionMatches(0,s5,0,4));   // fonctionne bien

    }

  // fin void main
}

// fin class Main


// tu compiles avec " javac Main.java"
// puis t'obtiens un fichier nommé Main.class (byte code)
// Que t'éxécute avec " java Main "
// ça print " Hello World ! " normalement lol
