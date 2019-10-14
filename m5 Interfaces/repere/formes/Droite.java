package repere.formes;
import repere.*;


public class Droite extends ElementRepere {

  protected Point o;
  protected Point d;

  public Droite(){

    this("Droite", Couleur.noir(), new Point(), new Point() );
    // this.titre = "Droite";
    // this.c = Couleur.noir();
    // this.o= new Point();
    // this.d= new Point();
  }

  public Droite(Point origine, Point destination){

    this("Droite", Couleur.noir(), origine, destination );
    // this.titre = "Droite";
    // this.c = Couleur.noir();
    // this.o= new Point();
    // this.d= new Point();
  }

  public Droite(String titre, Couleur c, Point start, Point end){
    super(titre,c);
    this.o=start;
    this.d=end;

  }



  public String description(){
    return "Droite ("+ this.o.getX() + "," + this.o.getY() + ") -> (" + this.d.getX() + "," + this.d.getY() + "), " + super.description();

  }

  public double getLongueur() {
    return Math.sqrt(Math.pow(Math.abs(this.o.getX() - this.d.getX()),2) + Math.pow(Math.abs(this.o.getY() - this.d.getY()),2) );
  }

}
