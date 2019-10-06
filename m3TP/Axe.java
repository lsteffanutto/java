class Axe extends ElementAvecNom {

  int taille;

  Axe(String titre,int taille){

    super(titre.toUpperCase());

    if( taille < 0 )
      this.taille=0;
    else
      this.taille=taille;


  }

  Axe(int taille){
    this("AXE",0);
  }

  Axe(){
    this("AXE",0);
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
