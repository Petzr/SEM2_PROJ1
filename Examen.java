import java.util.Scanner;

public class Examen
{
    public static void engels() {
        KeuzeVraag ev1 = new KeuzeVraag(); // ev1 = engels vraag 1
        ev1.setText("Vraag 1: Wat is 'eten' in het Engels?");
        ev1.voegKeuze("eaten", false);
        ev1.voegKeuze("beaten", false);
        ev1.voegKeuze("eating", true);
        ev1.voegKeuze("CoNsUmInG", false);

        KeuzeVraag ev2 = new KeuzeVraag();
        ev2.setText("Vraag 1: Wat is 'appel' in het Engels?");
        ev2.voegKeuze("aple", false);
        ev2.voegKeuze("apple", true);
        ev2.voegKeuze("app", false);
        ev2.voegKeuze("Steve Jobs", false);

        huidigeVraag(ev1);
        huidigeVraag(ev2);
    }

    public static void rekenen()
    {
        Vraag rv1 = new Vraag();
        rv1.setText("11 * 11 = ");
        rv1.setAntwoord("121");

        huidigeVraag(rv1);
    }

    public static void huidigeVraag(Vraag vraag)
    {
        vraag.beeld();
        System.out.print("Jouw antwoord: ");
        Scanner scanner = new Scanner(System.in);
        String reactie = scanner.nextLine();
        System.out.println(vraag.checkAntwoord(reactie));
        System.out.println();
    }
}