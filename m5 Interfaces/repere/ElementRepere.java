package repere;


public class ElementRepere extends ElementAvecNom {

  protected Couleur c;


  public ElementRepere(String titre, Couleur c){
    super(titre);
    this.c = c;
  }

  public Couleur getCouleur(){
    return this.c;
  }

  public void setCouleur(Couleur c){
    this.c = c;
  }

  public String description(){
    return this.c.description() + ", " + super.description();
  }

}
