public class SubstringChecker implements Checker
{
    String check;
    public SubstringChecker(String text)
    {
        this.check = text;
    }

    public boolean accept(String text)
    {
        return text.contains(check);
    }
}
