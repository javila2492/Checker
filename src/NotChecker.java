public class NotChecker implements Checker
{
    Checker a;
    Checker b;
    public NotChecker(Checker a, Checker b)
    {
        this.a = a;
        this.b = b;
    }

    public boolean accept(String text)
    {
        return !(a.accept) || b.accept));
    }
}
