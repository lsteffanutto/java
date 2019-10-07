package test;

import repere.formes.*;
import repere.*;

import java.util.ArrayList;

public class EnsembleElementRepere{

  int tailleMax;
  int tailleCourante;
  ArrayList<ElementRepere> elements;

  public EnsembleElementRepere(){
    this.tailleMax = 5;
    this.tailleCourante = 0;
    this.elements = new ArrayList<ElementRepere>();

  }
  public void ajouterElement(ElementRepere element){
    this.elements.add(element);
    this.tailleCourante++;
  }

  public ElementRepere recuperer(int i){
    return this.elements.get(i);
  }

  public int getTailleCourante(){
    return this.tailleCourante;
  }


}
