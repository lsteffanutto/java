package repere;




public class ElementAvecNom{

  protected String titre;

  public ElementAvecNom(String titre){
    this.titre = titre;
  }

  //On mets la fonction description ici car c'est le plus haut dans la hiérarchie
  public String getTitre(){
    return this.titre;
  }

  public void setTitre(String titre){
    this.titre = titre;
  }

  public String description(){
    return "titre : " + this.getTitre();
  }

}
