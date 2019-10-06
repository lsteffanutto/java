class ElementAvecNom{

  String titre;

  ElementAvecNom(String titre){
    this.titre = titre;
  }

  //On mets la fonction description ici car c'est le plus haut dans la hiérarchie
  String getTitre(){
    return this.titre;
  }

  void setTitre(String titre){
    this.titre = titre;
  }

  String description(){
    return "titre : " + this.getTitre();
  }

}
