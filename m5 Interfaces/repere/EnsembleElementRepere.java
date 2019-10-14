package repere;


public interface EnsembleElementRepere{

  ElementRepere recuperer(int index);

  void ajouter(ElementRepere element);

  int nombreElements();

}
