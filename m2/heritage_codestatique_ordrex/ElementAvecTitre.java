class ElementAvecTitre {
	public static FauxString sTitle = new FauxString("sTitle cree statiquement.");

	public FauxString title = new FauxString("title cree dynamiquement.");

	public ElementAvecTitre() {
		System.out.println("Appel du constructeur de ElementAvecTitre.");
	}
}
