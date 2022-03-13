public class Vraag
{
    private String text;
    private String answer;

    public Vraag()
    {
        text = "";
        answer = "";
    }

    public void setText(String questionText)
    {
        text = questionText;
    }

    public void setAntwoord(String correctResponse)
    {
        answer = correctResponse;
    }

    public boolean checkAntwoord(String response)
    {
        return response.equals(answer);
    }

    public void beeld()
    {
        System.out.println(text);
    }
}
