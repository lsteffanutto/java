class Droite extends ElementRepere {

  Point o;
  Point d;
  String titre;

  Droite(){
    this.titre = "d0";
    this.o=o;
    this.d=d;
  }

  Droite(String titre, Point start, Point end){
    this.titre=titre;
    this.o=start;
    this.d=end;

  }

  String description(){
    return super.description() + "Droite ("+ this.o.getX() + "," + this.o.getY() + ") -> (" + this.d.getX() + "," + this.d.getX() + ")";

  }

}
