class Droite extends ElementRepere {

  Point o;
  Point d;

  Droite(){

    this("Droite", Couleur.noir(), new Point(), new Point() );
    // this.titre = "Droite";
    // this.c = Couleur.noir();
    // this.o= new Point();
    // this.d= new Point();
  }

  Droite(Point origine, Point destination){

    this("Droite", Couleur.noir(), origine, destination );
    // this.titre = "Droite";
    // this.c = Couleur.noir();
    // this.o= new Point();
    // this.d= new Point();
  }

  Droite(String titre, Couleur c, Point start, Point end){
    super(titre,c);
    this.o=start;
    this.d=end;

  }



  String description(){
    return "Droite ("+ this.o.getX() + "," + this.o.getY() + ") -> (" + this.d.getX() + "," + this.d.getY() + "), " + super.description();

  }

  double getLongueur() {
    return Math.sqrt(Math.pow(Math.abs(this.o.getX() - this.d.getX()),2) + Math.pow(Math.abs(this.o.getY() - this.d.getY()),2) );
  }

}
