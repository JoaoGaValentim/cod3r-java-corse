package session.two.controls;

import java.time.LocalDate;

public class SwitchControlStructure {
    public static void main(String[] args) {
        // Os dias da semana em java iniciam-se em 1 (segunda)
        // e terminam em 7 (domingo)
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
