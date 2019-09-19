class Point extends ElementAvecTitre {
	public static FauxString sX = new FauxString("sX cree statiquement.");

	public FauxString x = new FauxString("x cree dynamiquement.");

	public Point() {
		System.out.println("Appel du constructeur de Point.");
	}
}
