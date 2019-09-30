class Axe extends ElementAvecNom {

  int taille;

  Axe(String titre,int taille){

    super(titre.toUpperCase());

    if( taille < 0 )
      this.taille=0;
    else
      this.taille=taille;


  }

  // Axe(int taille){
  //   this.titre = "AXE";
  //   this.taille= taille;
  // }

  Axe(){
    this.titre = "AXE";
    this.taille=0;
  }

  int getTaille(){
    return taille;
  }

  String getTitre(){
    return titre;
  }

  // Axe(String titre, int taille){
  //
  // }

  String description(){
    return "Axe taille : " + this.getTaille() + ", " + super.description();
  }

}
