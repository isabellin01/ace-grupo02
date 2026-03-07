import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        String[] usuarios = {"ana", "carlos", "maria", "joao", "pedro"};

        for (int i = 0; i < 30; i++) {

            Integer usuarioAleatorio = ThreadLocalRandom.current().nextInt(usuarios.length);
            Integer statusAleatorio = ThreadLocalRandom.current().nextInt(1,3);

            String usuario = usuarios[usuarioAleatorio];

            boolean sucesso = statusAleatorio == 1 ? true:false;

            String status = sucesso ? "LOGIN_SUCESSO":"LOGIN_FALHA";


            LocalDateTime horario = LocalDateTime.now();

            System.out.println(horario + " | usuario=" + usuario + " | status=" + status);

            Thread.sleep(2000);
        }

        }
    }
