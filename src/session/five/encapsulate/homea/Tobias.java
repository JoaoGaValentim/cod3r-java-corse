package session.five.encapsulate.homea;

public class Tobias {
    Irene wife = new Irene();

    protected void testTobiasAccess() {
        System.out.println(wife.comportment);
        System.out.println(wife.executeInHome);
        System.out.println(wife.allKnow);
        // System.out.println(wife.secret); access into Irene
    }
}
