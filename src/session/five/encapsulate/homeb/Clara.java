package session.five.encapsulate.homeb;

import session.five.encapsulate.homea.Irene;

public class Clara {
    @SuppressWarnings("unused")
    private final String secret = "...";
    String executeInHome = "...";
    protected String comportment = "...";
    public String allKnow = "...";

    void testClaraAccess() {
        Irene grandmother = new Irene();
        System.out.println(grandmother.allKnow);
    }
}
