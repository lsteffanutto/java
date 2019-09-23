class Axe extends ElementAvecNom {

  int taille;
  String titre;


  Axe(String titre,int taille){

    if( taille < 0 )
      this.taille=0;
    else
      this.taille=taille;

    this.titre=titre.toUpperCase();

  }

  Axe(){
    this.taille=10;
    this.titre = "AXE 0";
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
    return super.description() + "Axe taille : " + this.taille + ", titre : "+this.titre;
  }

}
