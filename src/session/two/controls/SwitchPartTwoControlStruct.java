package session.two;

public class SwitchPartTwoControlStruct {
    public static void main(String[] args) {
        String levelTag = "admin";

        switch (levelTag.toLowerCase()) {
            case "admin":
                System.out.println("Administrador do SGBD.");
                break;

            case "modeler":
                System.out.println("Modelador do SGBD.");
                break;

            default:
                System.out.println("Tag não encontrada no SGBD.");
                break;
        }
    }
}
