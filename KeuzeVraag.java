import java.util.ArrayList;

public class KeuzeVraag extends Vraag
{
    private ArrayList<String> keuzes;


    public KeuzeVraag()
    {
        keuzes = new ArrayList<>();
    }


    public void voegKeuze(String keuze, boolean correct)
    {
        keuzes.add(keuze);
        if (correct)
        {
            String keuzeString = "" + keuzes.size();
            setAntwoord(keuzeString);
        }
    }

    public void beeld()
    {
        super.beeld();
        for (int i = 0; i < keuzes.size(); i++)
        {
            int keuzeNummer = i + 1;
            System.out.println(keuzeNummer + ": " + keuzes.get(i));
        }
    }
}