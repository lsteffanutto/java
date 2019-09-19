class JavaMadness {
	public static void main(String[] args) {
		System.out.println("Debut du point d'entree.");
		System.out.println("Declaration d'un objet de type Point.");
		Point p;
		System.out.println("Access a une propriete statique");
		System.out.println(Point.sX);
		System.out.println("Creation d'un objet de type Point.");
		p = new Point(); // seule création d'objet du point d'entree.
	}
}
