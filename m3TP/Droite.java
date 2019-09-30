class Droite extends ElementRepere {

  Point o;
  Point d;

  Droite(){
    this.titre = "Droite";
    this.c = Couleur.noir();
    this.o= new Point();
    this.d= new Point();
  }

  Droite(String titre, Couleur c, Point start, Point end){
    super(titre,c);
    this.o=start;
    this.d=end;

  }



  String description(){
    return super.description() + "Droite ("+ this.o.getX() + "," + this.o.getY() + ") -> (" + this.d.getX() + "," + this.d.getX() + ")";

  }

  double getLongueur() {
    return Math.sqrt(Math.pow(Math.abs(this.o.getX() - this.d.getX()),2) + Math.pow(Math.abs(this.o.getY() - this.d.getY()),2) );
  }

}
