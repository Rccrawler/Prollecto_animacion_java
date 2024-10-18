import java.util.Random;
import java.util.Scanner;

public class Main {
    /* Este sera un video juego de madmoras en el que se tendara que escapar encontrando la llabe y las escaleras sera 100%
    *  en la terminal de java y sera programado en java al 100% por cien se jugara con swa y ademas abra una puntuacion
    *  el juego se ejecutara de manera fluida cada bez que se pulse una tacla se mobera el personaje como si pulstaras una tecla
    *  cualquiera de movimiento cualquiera + enter y los enmigos se moberan de manera aleatoria por el mapa el mapa tanbien tendra
    *  un laberinto de muros los cuales no se podran atrabesar */

    public static void spaciado(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void pulsar_tecla(){
        Scanner scanner = new Scanner(System.in);
        String linea = scanner.nextLine();
    }
    public static void contenidos(){
        System.out.println("Hello world!");//Escribir texto en pantalla
        char hola;
        int numer;
        numer = 0;
        hola = 'H';
        int number2 = 2;
        System.out.println("Hello world!");//Escribir texto en pantalla
    }
    public static void titular_principal(){
        //Mad routs
        System.out.println("__/\\\\\\\\____________/\\\\\\\\_        ________________        _________/\\\\\\__         ___________         _______________        _______________        _______________        _______________        ______________        ");
        System.out.println(" _\\/\\\\\\\\\\\\________/\\\\\\\\\\\\_        ________________        ________\\/\\\\\\__         ___________         _______________        _______________        _______________        _______________        ______________  ");
        System.out.println("  _\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\_        ________________        ________\\/\\\\\\__         ___________         _______________        _______________        _______________        _____/\\\\\\______        ______________      ");
        System.out.println("   _\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_        __/\\\\\\\\\\\\\\\\\\____        ________\\/\\\\\\__         ___________         __/\\\\/\\\\\\\\\\\\\\__        _____/\\\\\\\\\\____        __/\\\\\\____/\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\\\_        __/\\\\\\\\\\\\\\\\\\\\_     ");
        System.out.println("    _\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\_        _\\////////\\\\\\___        ___/\\\\\\\\\\\\\\\\\\__         ___________         _\\/\\\\\\/////\\\\\\_        ___/\\\\\\///\\\\\\__        _\\/\\\\\\___\\/\\\\\\_        _\\////\\\\\\////__        _\\/\\\\\\//////__    ");
        System.out.println("     _\\/\\\\\\____\\///_____\\/\\\\\\_        ___/\\\\\\\\\\\\\\\\\\\\__        __/\\\\\\////\\\\\\__         ___________         _\\/\\\\\\___\\///__        __/\\\\\\__\\//\\\\\\_        _\\/\\\\\\___\\/\\\\\\_        ____\\/\\\\\\______        _\\/\\\\\\\\\\\\\\\\\\\\_   ");
        System.out.println("      _\\/\\\\\\_____________\\/\\\\\\_        __/\\\\\\/////\\\\\\__        _\\/\\\\\\__\\/\\\\\\__         ___________         _\\/\\\\\\_________        _\\//\\\\\\__/\\\\\\__        _\\/\\\\\\___\\/\\\\\\_        ____\\/\\\\\\_/\\\\__        _\\////////\\\\\\_  ");
        System.out.println("       _\\/\\\\\\_____________\\/\\\\\\_        _\\//\\\\\\\\\\\\\\\\/\\\\_        _\\//\\\\\\\\\\\\\\/\\\\_         ___________         _\\/\\\\\\_________        __\\///\\\\\\\\\\/___        _\\//\\\\\\\\\\\\\\\\\\__        ____\\//\\\\\\\\\\___        __/\\\\\\\\\\\\\\\\\\\\_ ");
        System.out.println("        _\\///______________\\///__        __\\////////\\//__        __\\///////\\//__         ___________         _\\///__________        ____\\/////_____        __\\/////////___        _____\\/////____        _\\//////////__");
    }
    public static void instrucciones(){
        System.out.println("                    <------------Instrucciones------------------>");
        //System.out.println("                    |                                           |");
        System.out.println("                    | usa w para habanzar a hacia alante        |");
        System.out.println("                    | usa a para moverte a la izquierda         |");
        System.out.println("                    | usa d para moverte a la derecha           |");
        System.out.println("                    | usa s para moverte hacia atras            |");
        System.out.println("                    | usa enter para atacar                     |");
        System.out.println("                    | usa space para cojer objetos              |");
        System.out.println("                    | usa esc para salir del juego              |");
        System.out.println("                    | el objetibo es consegir todos los orbes   |");
        System.out.println("                    | y salir de la mazmorra con vida           |");
        System.out.println("                    |___________________________________________|");
        System.out.println("                     pulse enter para continuar");

    }
    public static void tiempo_espera(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Error: el hilo fue interrumpido");
            Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
        }
    }
    public static void herue_1_pose_normal_spada(){
        System.out.println("   __ .  ");
        System.out.println("  ['']|  ");
        System.out.println("  /||=ř  ");
        System.out.println("   ||    ");
        System.out.println(" --------");
    }
    public static void animacion1(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println("   __ .  ");
            System.out.println("  ['']|  ");
            System.out.println("  /||=ř  ");
            System.out.println(" · || ·  ");
            System.out.println(" --------");
            // especiales a usar ¯Ïīĩıř˪ʭʬψѦ₪₫█▓□▫ϟƱʆ
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("         <Herue>");
            System.out.println("   __ .  <NECESITO TODOS LOS ORBES PARA SER INBENCIBLE>");
            System.out.println("  ['']|  / <Y DEROTAR A LA OSCURIDAD DE LA MAZMORRA>");
            System.out.println("  /||=ř       ademas de consegir la linterna de jade");
            System.out.println(" · || ·  ");
            System.out.println(" --------");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.err.println("Error: el hilo fue interrumpido");
                    Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("   __ .  ");
                System.out.println("  ['']|  ");
                System.out.println("  /||=ř  ");
                System.out.println("   /|  ");
                System.out.println(" --------");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.err.println("Error: el hilo fue interrumpido");
                    Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("   __ .  ");
                System.out.println("  ['']|  ");
                System.out.println("  /||=ř  ");
                System.out.println("   |/  ");
                System.out.println(" --------");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .  ");
            System.out.println("  [¿?]|  ");
            System.out.println("  /||=ř  ");
            System.out.println("   ||  ");
            System.out.println(" --------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .  ");
            System.out.println("  ['']|  ");
            System.out.println("  /||=ř  ");
            System.out.println("   ||  ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .                                                                    ϟϟϟ       ");
            System.out.println("  ['']|                                                                              ");
            System.out.println("  /||=ř                                                                              ");
            System.out.println("   ||                                                                                ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .                                                                              ");
            System.out.println("  ['']|                                                                    ϟϟϟ       ");
            System.out.println("  /||=ř                                                                              ");
            System.out.println("   ||                                                                                ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .                                                                              ");
            System.out.println("  ['']|                                                                              ");
            System.out.println("  /||=ř                                                                    ϟϟϟ       ");
            System.out.println("   ||                                                                                ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .                                                                              ");
            System.out.println("  ['']|                                                                              ");
            System.out.println("  /||=ř                                                                              ");
            System.out.println("   ||                                                                      ϟϟϟ       ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("   __ .                                                                              ");
            System.out.println("  ['']|                                                                              ");
            System.out.println("  /||=ř                                                                              ");
            System.out.println("   ||                                                                       <o>       ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                                            {ƱƱ}       ");
            System.out.println("   __ .                                                                   /  ||| ===!   ");
            System.out.println("  ['']|                                                                 ψ/   |||    ₪  ");
            System.out.println("  /||=ř                                                                 |   |=|=|     ");
            System.out.println("   ||                                                                   |   |   |    ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("       <Herue>");
            System.out.println("       ¡.... Dame haora mismo es abasija sino ?¿¿?¿?¿...--=¿?¿! ");
            System.out.println("       /                                                                    {ƱƱ}       ");
            System.out.println("   __ .                                                                   /  ||| ===!   ");
            System.out.println("  ['']|                                                                 ψ/   |||    ₪  ");
            System.out.println("  /||=ř                                                                 |   |=|=|     ");
            System.out.println("   ||                                                                   |   |   |    ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" <gaurdian de la puerta>    otro pelbello idiota pidendome cosas que no boy ha entregar");
            System.out.println(" ni muerto te entregare esta basija pero bas a si bas a contemplar su poder ");
            System.out.println("                                                            muere       =   {ƱƱ}       ");
            System.out.println("   __ .                                                                   /  ||| ===!   ");
            System.out.println("  ['']|                                                                 ψ/   |||    ₪  ");
            System.out.println("  /||=ř                                                                 |   |=|=|     ");
            System.out.println("   ||                                                                   |   |   |    ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                                           {ƱƱ}       ");
            System.out.println("   __                                                                 ! ====|||   ");
            System.out.println("  ['▫']                                                              *₪*====|||      ");
            System.out.println("  ||||                                                                ¡    |=|=|     ");
            System.out.println("   ||                                                                      |   |    ");
            System.out.println(" ------------------------------------------------------------------------------------");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                                           {ƱƱ}       ");
            System.out.println("                                                                      ! ====|||   ");
            System.out.println("     __                                                              *₪*====|||      ");
            System.out.println("    [**]                                                             ¡    |=|=|     ");
            System.out.println("    ||||                                                                   |   |    ");
            System.out.println("     ||     ---------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                                              {ƱƱ}       ");
            System.out.println("                                                                          |||====   ");
            System.out.println("                                                                   ====|||      ");
            System.out.println("                                                                    |=|=|     ");
            System.out.println("     __                                                                   |     |    ");
            System.out.println("    [**]     ---------------------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |     [--]   |");
            System.out.println("                                                     |     ||||   |");
            System.out.println("                                                     |      ||    |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |     [--]   |");
            System.out.println("                                                     |     ||||   |");
            System.out.println("                                                     |      ||    |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |            |");
            System.out.println("                                                     |     [--]   |");
            System.out.println("                                                     |     ||||   |");
            System.out.println("                                                     |      ||    |");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("                                                           [--]   ");
            System.out.println("                                                           ||||   ");
            System.out.println("                                                            ||    ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("                                                           [-0]   ");
            System.out.println("                                                           ||||   ");
            System.out.println("                                                            ||    ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("                                                           [0-]   ");
            System.out.println("                                                           ||||   ");
            System.out.println("                                                            ||    ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("            ");
            System.out.println("                                                           [00]   ");
            System.out.println("                                                           ||||   ");
            System.out.println("                                                            ||    ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                                            __ .  ");
            System.out.println("                                                           ['']|  ");
            System.out.println("                                                           /||=ř  ");
            System.out.println("                                                            ||  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error: el hilo fue interrumpido");
                Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("                                          <Herue>  donde estoy ???");
            System.out.println("                                                            __ .  ");
            System.out.println("                                                           ['']|  ");
            System.out.println("                                                           /||=ř  ");
            System.out.println("                                                            ||  ");

    }
    public static void animacion2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Error: el hilo fue interrumpido");
            Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
        }
        spaciado();
        System.out.println("                      <Herue> debo de estar en un amdmora= ¿?     ");
        System.out.println("                                                            __ .  ");
        System.out.println("                                                           ['']|  ");
        System.out.println("                                                           /||=ř  ");
        System.out.println("                                                            ||    ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Error: el hilo fue interrumpido");
            Thread.currentThread().interrupt(); // Reestablece la bandera de interrupción
        }
    }

    //bucle del juego
    public static void main(String[] args) {
        titular_principal();
        tiempo_espera();
        spaciado();
        instrucciones();
        pulsar_tecla();
        spaciado();
        animacion1();

    }

}