package Pozoriste;

public class GlavniProgram {

	public static void main(String[] args) {
		Pozoriste p1 = new Pozoriste("Pozoriste1");
		Glumac g1 = new Glumac("ImeGlumca1", p1, "Glavna");
		Glumac g2 = new Glumac("ImeGlumca2", p1, "Sporedna");
		Reditelj r1 = new Reditelj("ImeReditelja1", p1, "Nadimak");

		Predstava pr1 = new Predstava("Neverovatna Predstava", p1);

		pr1.dodajZaposlenig(g1);
		pr1.dodajZaposlenig(g2);
		pr1.dodajZaposlenig(r1);

		System.out.println(pr1);

	}

}
