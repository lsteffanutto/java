class Point extends ElementRepere {

  int x,y;

  Point(int x, int y){
    this.x=x;
    this.y=y;
  }

  String description(){
    return super.description() + " et je suis aussi un point (" + this.x + "," + this.y + ")";
  }
  // Priorité à la fonction description dans ElementRepere, au-dessus dans la hiérarchie
  // Qu'on complète avec le super.
}
