package repere.formes;

import repere.*;


public class Point extends ElementRepere {

  protected int x,y;

  public Point(){

    this("Point",Couleur.noir(),0,0);
    // this.titre="Point";
    // this.c = Couleur.noir();
    // this.x=0;
    // this.y=0;
  }

  public Point(int x, int y){

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

  public Point(String titre, Couleur c, int x, int y){

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

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public String description(){
    return "Point (" + this.x + "," + this.y + "), " + super.description();
  }

}
