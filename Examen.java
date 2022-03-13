import java.util.Scanner;

public class Examen
{
    public static void engels() {
        KeuzeVraag v1 = new KeuzeVraag();
        v1.setText("Vraag 1: Wat is 'eten' in het Engels?");
        v1.voegKeuze("eaten", false);
        v1.voegKeuze("beaten", false);
        v1.voegKeuze("eating", true);
        v1.voegKeuze("CoNsUmInG", false);

        KeuzeVraag v2 = new KeuzeVraag();
        v2.setText("Vraag 1: Wat is 'appel' in het Engels?");
        v2.voegKeuze("aple", false);
        v2.voegKeuze("apple", true);
        v2.voegKeuze("app", false);
        v2.voegKeuze("Steve Jobs", false);

        presentQuestion(v1);
        presentQuestion(v2);
    }

    public static void presentQuestion(KeuzeVraag vraag)
    {
        vraag.beeld();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(vraag.checkAntwoord(response));
        System.out.println();
    }
}