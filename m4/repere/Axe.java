package repere;




public class Axe extends ElementAvecNom {

  protected int taille;

  public Axe(String titre,int taille){

    super(titre.toUpperCase());

    if( taille < 0 )
      this.taille=0;
    else
      this.taille=taille;


  }

  public Axe(int taille){
    this("AXE",0);
  }

  public Axe(){
    this("AXE",0);
  }

  public int getTaille(){
    return taille;
  }

  public String getTitre(){
    return titre;
  }

  // Axe(String titre, int taille){
  //
  // }

  public String description(){
    return "Axe taille : " + this.getTaille() + ", " + super.description();
  }

}
