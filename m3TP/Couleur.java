class Couleur{

  int r,g,b;

  //couleur par défaut


  Couleur(){
    this.r=120;
    this.g=120;
    this.b=120;
  }

  Couleur(int r,int g,int b){

    if(r<0)
      this.r=0;
    else if(r>255)
      this.r=255;
    else
      this.r=r;

    if(g<0)
      this.g=0;
    else if(g>255)
      this.g=255;
    else
      this.g=g;

    if(b<0)
      this.b=0;
    else if(b>255)
      this.b=255;
    else
      this.b=b;
  }

  int getR(){
    return r;
  }

  int getG(){
    return g;
  }

  int getB(){
    return b;
  }


// fonction static pas d'objet donc pas de this
  static Couleur noir(){
    return new Couleur(0,0,0);
  }
  static Couleur blanc(){
    return new Couleur(255,255,255);
  }
  static Couleur rouge(){
    return new Couleur(255,0,0);
  }
  static Couleur vert(){
    return new Couleur(0,255,0);
  }
  static Couleur bleu(){
    return new Couleur(0,0,255);
  }
  static Couleur auHasard(){
    return new Couleur((int)(Math.random() * (255)),(int)(Math.random() * (255)),(int)(Math.random() * (255)));
  }


  String description(){
    return  "couleur : (" + this.r + "," + this.g + "," + this.b + ")";
  }

}
