class Point extends ElementRepere {

  int x,y;

  Point(){

    this("Point",Couleur.noir(),0,0);
    // this.titre="Point";
    // this.c = Couleur.noir();
    // this.x=0;
    // this.y=0;
  }

  Point(int x, int y){

    this("Point",Couleur.noir(),x,y);

    // this.titre="Point";
    // this.c = Couleur.noir();
    // if(x<0)
    //   this.x=0;
    // else
    //   this.x=x;
    //
    // if(y<0)
    //   this.y=0;
    // else
    //   this.y=y;
  }

  Point(String titre, Couleur c, int x, int y){

    super(titre, c);

    if(x<0)
      this.x=0;
    else
      this.x=x;

    if(y<0)
      this.y=0;
    else
      this.y=y;

    this.titre=titre;

    this.c=c;
  }

  int getX(){
    return this.x;
  }

  int getY(){
    return this.y;
  }

  String description(){
    return "Point (" + this.x + "," + this.y + "), " + super.description();
  }

}
