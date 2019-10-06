import java.util.ArrayList;

class EnsembleElementRepere{

  int tailleMax;
  int tailleCourante;
  ArrayList<ElementRepere> elements;

  EnsembleElementRepere(){
    this.tailleMax = 5;
    this.tailleCourante = 0;
    this.elements = new ArrayList<ElementRepere>();

  }
  void ajouterElement(ElementRepere element){
    this.elements.add(element);
    this.tailleCourante++;
  }

  ElementRepere recuperer(int i){
    return this.elements.get(i);
  }

  int getTailleCourante(){
    return this.tailleCourante;
  }


}
