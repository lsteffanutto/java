class Teststring{

  public static void main(String[] args) {




    //String, ça affiche la chaîne string
    // On peut mettre aussi Object à la place de String avec un upcast, ça affiche la même
    //On a le droit car Object est bien superclasse de String

    String s = new String("fooo");
    System.out.println(s.toString());

    //Affiche adresse

    Object o = new Object();
    System.out.println(o.toString());

    // toString est redéfini toute seul car Object super classe de String
    //=> on prend la méthode toString() pour Object
    // Et pas méthode toString() pour String

    Point p = new Point(10,10);
    ElementRepere e = new ElementRepere();

    // méthode toString() marche pareil pour Objet et Point
    System.out.println("Je suis l'objet p :");
    System.out.println(p.description() + "\n");

    System.out.println("Je suis l'objet e :");
    System.out.println(e.description() + "\n");

  }

}
