class ElementRepere extends ElementAvecNom {

  Couleur c;


  ElementRepere(String titre, Couleur c){
    super(titre);
    this.c = c;
  }

  Couleur getCouleur(){
    return this.c;
  }

  void setCouleur(Couleur c){
    this.c = c;
  }

  String description(){
    return this.c.description() + ", " + super.description();
  }

}
