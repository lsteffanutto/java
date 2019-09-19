// nouvelle classe = nouvelle objet = nouveau fichier

class Point {
  // Attributs
  int x,y;

  // Constructeur
  Point (int x, int y){
    this.x=x;
    this.y=y;
  }

  void move(int x, int y){
    this.x=x;
    this.y=y;
  }

  int getX(){
    return x;
  }

  int getY(){
    return y;
  }

  public static void main(String[] args) {

    // On crée le point et on affiche ses coordonnées
    Point p = new Point(3,3);
    System.out.println(p.getX());
    System.out.println(p.getY());

    
    p.move(10,10);
    System.out.println(p.getX());
    System.out.println(p.getY());


  }
}
