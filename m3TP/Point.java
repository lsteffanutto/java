class Point extends ElementRepere {

  int x,y;

  Point(){
    this.x=0;
    this.y=0;
    this.titre="p0";
  }

  Point(String titre, int x, int y){

    if(x<0)
      this.x=0;
    else
      this.x=x;

    if(y<0)
      this.y=0;
    else
      this.y=y;

    this.titre=titre;
  }

  int getX(){
    return x;
  }

  int getY(){
    return y;
  }

  String description(){
    return super.description() + "Point (" + this.x + "," + this.y + "), titre : " + this.titre;
  }

}
