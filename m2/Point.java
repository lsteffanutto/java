class Point extends ElementRepere {

  int x,y;

  Point(){
    this.x=0;
    this.y=0;
  }

  Point(int x, int y){

    if(x<0)
      this.x=0;
    else
      this.x=x;

    if(y<0)
      this.y=0;
    else
      this.y=x;
  }

  int getX(){
    return x;
  }

  int getY(){
    return y;
  }

  String description(){
    return super.description() + "Point (" + this.x + "," + this.y + ")";
  }
  // Priorité à la fonction description dans ElementRepere, au-dessus dans la hiérarchie
  // Qu'on complète avec le super.
}
