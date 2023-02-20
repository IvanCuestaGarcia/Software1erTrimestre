package software1ertrimestre;

import java.util.*;

public class Software1erTrimestre {

    public static void Ricardo() {
        Scanner res = new Scanner(System.in);
        int respuesta, enemigo;
        do {
            System.out.println("Hola de nuevo Ricardo.\nQuieres empezar un nuevo combate? 0 = no / 1 = si\n");
            respuesta = res.nextInt();
            System.out.println();
        } while (respuesta > 1 || respuesta < 0);
        if (respuesta == 1) {
            do {
                System.out.println("Elige a tu enemigo:\n1. Java\n2. Python\n3. HTML\n4. CSS\n");
                enemigo = res.nextInt();
                System.out.println();
            } while (enemigo < 1 || enemigo > 4);
            switch (enemigo) {
                case 1 -> {
                    Java();
                }
                case 2 -> {
                    Python();
                }
                case 3 -> {
                    HTML();
                }
                case 4 -> {
                    CSS();
                }
            }
        }
    }

    public static void Nuria() {
        Scanner res = new Scanner(System.in);
        int respuesta, enemigo;
        do {
            System.out.println("Hola de nuevo Nuria.\nQuieres empezar un nuevo combate? 0 = no / 1 = si\n");
            respuesta = res.nextInt();
        } while (respuesta > 1 || respuesta < 0);
        if (respuesta == 1) {
            do {
                System.out.println("Elige a tu enemigo:\n1. Java\n2. Python\n3. HTML\n4. CSS\n");
                enemigo = res.nextInt();
                System.out.println();
            } while (enemigo < 1 || enemigo > 4);
            switch (enemigo) {
                case 1 -> {
                    Java();
                }
                case 2 -> {
                    Python();
                }
                case 3 -> {
                    HTML();
                }
                case 4 -> {
                    CSS();
                }
            }
        }
    }

    public static void Maria() {
        Scanner res = new Scanner(System.in);
        int respuesta, enemigo;
        do {
            System.out.println("Hola de nuevo Maria.\nQuieres empezar un nuevo combate? 0 = no / 1 = si\n");
            respuesta = res.nextInt();
        } while (respuesta > 1 || respuesta < 0);
        if (respuesta == 1) {
            do {
                System.out.println("Elige a tu enemigo:\n1. Java\n2. Python\n3. HTML\n4. CSS\n");
                enemigo = res.nextInt();
                System.out.println();
            } while (enemigo < 1 || enemigo > 4);
            switch (enemigo) {
                case 1 -> {
                    Java();
                }
                case 2 -> {
                    Python();
                }
                case 3 -> {
                    HTML();
                }
                case 4 -> {
                    CSS();
                }
            }
        }
    }

    public static void Fernando() {
        Scanner res = new Scanner(System.in);
        int respuesta, enemigo;
        do {
            System.out.println("Hola de nuevo Fernando.\nQuieres empezar un nuevo combate? 0 = no / 1 = si\n");
            respuesta = res.nextInt();
        } while (respuesta > 1 || respuesta < 0);
        if (respuesta == 1) {
            do {
                System.out.println("Elige a tu enemigo:\n1. Java\n2. Python\n3. HTML\n4. CSS\n");
                enemigo = res.nextInt();
                System.out.println();
            } while (enemigo < 1 || enemigo > 4);
            switch (enemigo) {
                case 1 -> {
                    Java();
                }
                case 2 -> {
                    Python();
                }
                case 3 -> {
                    HTML();
                }
                case 4 -> {
                    CSS();
                }
            }
        }
    }

    public static void Javier() {
        Scanner res = new Scanner(System.in);
        int respuesta, enemigo;
        do {
            System.out.println("Hola de nuevo Javier.\nQuieres empezar un nuevo combate? 0 = no / 1 = si\n");
            respuesta = res.nextInt();
            System.out.println();
        } while (respuesta > 1 || respuesta < 0);
        if (respuesta == 1) {
            do {
                System.out.println("Elige a tu enemigo:\n1. Java\n2. Python\n3. HTML\n4. CSS\n");
                enemigo = res.nextInt();
                System.out.println();
            } while (enemigo < 1 || enemigo > 4);
            switch (enemigo) {
                case 1 -> {
                    Java();
                }
                case 2 -> {
                    Python();
                }
                case 3 -> {
                    HTML();
                }
                case 4 -> {
                    CSS();
                }
            }
            
        }
    }

    public static void Java() {
        Scanner ac = new Scanner(System.in);
        int vidaUser = 50, vidaEnemigo = 50, accion;
        System.out.println("La lucha va a empezar.\nVida: " + vidaUser + "\nVida Java: " + vidaEnemigo + "\n");
        do{
            do{
            System.out.println("Es tu turno elige tu accion: 1. Atacar / 2. Curarte\n");
            accion = ac.nextInt();
            System.out.println();
            } while (accion != 1 && accion != 2);
            switch (accion){
                case 1 -> {
                    int daño = Ataque();
                    vidaEnemigo -= daño;
                    if (vidaEnemigo < 0){
                        vidaEnemigo = 0;
                    }
                }
                case 2 -> {
                    int curacion = Cura();
                    vidaUser += curacion;
                    if  (vidaUser > 50){
                        vidaUser = 50;
                    }
                }
            }
            System.out.println("Vida: " + vidaUser + "\nVida Java: " + vidaEnemigo + "\n");
            if (vidaEnemigo != 0){      
                System.out.println("Es el turno de Java\n");
                int bot = (int) (Math.random() * 2 + 1);
                switch (bot) {
                    case 1 -> {
                        int daño = Ataque();
                        vidaUser -= daño;
                        if (vidaUser < 0){
                            vidaUser = 0;
                        }
                    }
                    case 2 -> {
                        int curacion = Cura();
                        vidaEnemigo += curacion;
                        if  (vidaEnemigo > 50){
                            vidaEnemigo = 50;
                        }
                    }
                }
                System.out.println("Vida: " + vidaUser + "\nVida Java: " + vidaEnemigo + "\n");
            }
        }while (vidaEnemigo != 0 && vidaUser != 0);
        if(vidaUser > 0){
            System.out.println("Has ganado!!!");
        } else{
            System.out.println("Has perdido, la proxima vez será");
        }
    }

    public static void Python() {
        Scanner ac = new Scanner(System.in);
        int vidaUser = 50, vidaEnemigo = 50, accion;
        System.out.println("La lucha va a empezar.\nVida: " + vidaUser + "\nVida Python: " + vidaEnemigo + "\n");
        do{
            do{
            System.out.println("Es tu turno elige tu accion: 1. Atacar / 2. Curarte\n");
            accion = ac.nextInt();
            System.out.println();
            } while (accion != 1 && accion != 2);
            switch (accion){
                case 1 -> {
                    int daño = Ataque();
                    vidaEnemigo -= daño;
                    if (vidaEnemigo < 0){
                        vidaEnemigo = 0;
                    }
                }
                case 2 -> {
                    int curacion = Cura();
                    vidaUser += curacion;
                    if  (vidaUser > 50){
                        vidaUser = 50;
                    }
                }
            }
            System.out.println("Vida: " + vidaUser + "\nVida Python: " + vidaEnemigo + "\n");
            if (vidaEnemigo != 0){      
                System.out.println("Es el turno de Python\n");
                int bot = (int) (Math.random() * 2 + 1);
                switch (bot) {
                    case 1 -> {
                        int daño = Ataque();
                        vidaUser -= daño;
                        if (vidaUser < 0){
                            vidaUser = 0;
                        }
                    }
                    case 2 -> {
                        int curacion = Cura();
                        vidaEnemigo += curacion;
                        if  (vidaEnemigo > 50){
                            vidaEnemigo = 50;
                        }
                    }
                }
                System.out.println("Vida: " + vidaUser + "\nVida Python: " + vidaEnemigo + "\n");
            }
        }while (vidaEnemigo != 0 && vidaUser != 0);
        if(vidaUser > 0){
            System.out.println("Has ganado!!!");
        } else{
            System.out.println("Has perdido, la proxima vez será");
        }
    }

    public static void HTML() {
        Scanner ac = new Scanner(System.in);
        int vidaUser = 50, vidaEnemigo = 50, accion;
        System.out.println("La lucha va a empezar.\nVida: " + vidaUser + "\nVida HTML: " + vidaEnemigo + "\n");
        do{
            do{
            System.out.println("Es tu turno elige tu accion: 1. Atacar / 2. Curarte\n");
            accion = ac.nextInt();
            System.out.println();
            } while (accion != 1 && accion != 2);
            switch (accion){
                case 1 -> {
                    int daño = Ataque();
                    vidaEnemigo -= daño;
                    if (vidaEnemigo < 0){
                        vidaEnemigo = 0;
                    }
                }
                case 2 -> {
                    int curacion = Cura();
                    vidaUser += curacion;
                    if  (vidaUser > 50){
                        vidaUser = 50;
                    }
                }
            }
            System.out.println("Vida: " + vidaUser + "\nVida HTML: " + vidaEnemigo + "\n");
            if (vidaEnemigo != 0){      
                System.out.println("Es el turno de HTML\n");
                int bot = (int) (Math.random() * 2 + 1);
                switch (bot) {
                    case 1 -> {
                        int daño = Ataque();
                        vidaUser -= daño;
                        if (vidaUser < 0){
                            vidaUser = 0;
                        }
                    }
                    case 2 -> {
                        int curacion = Cura();
                        vidaEnemigo += curacion;
                        if  (vidaEnemigo > 50){
                            vidaEnemigo = 50;
                        }
                    }
                }
                System.out.println("Vida: " + vidaUser + "\nVida HTML: " + vidaEnemigo + "\n");
            }
        }while (vidaEnemigo != 0 && vidaUser != 0);
        if(vidaUser > 0){
            System.out.println("Has ganado!!!");
        } else{
            System.out.println("Has perdido, la proxima vez será");
        }
    }

    public static void CSS() {
        Scanner ac = new Scanner(System.in);
        int vidaUser = 50, vidaEnemigo = 50, accion;
        System.out.println("La lucha va a empezar.\nVida: " + vidaUser + "\nVida CSS: " + vidaEnemigo + "\n");
        do{
            do{
            System.out.println("Es tu turno elige tu accion: 1. Atacar / 2. Curarte\n");
            accion = ac.nextInt();
            System.out.println();
            } while (accion != 1 && accion != 2);
            switch (accion){
                case 1 -> {
                    int daño = Ataque();
                    vidaEnemigo -= daño;
                    if (vidaEnemigo < 0){
                        vidaEnemigo = 0;
                    }
                }
                case 2 -> {
                    int curacion = Cura();
                    vidaUser += curacion;
                    if  (vidaUser > 50){
                        vidaUser = 50;
                    }
                }
            }
            System.out.println("Vida: " + vidaUser + "\nVida CSS: " + vidaEnemigo + "\n");
            if (vidaEnemigo != 0){      
                System.out.println("Es el turno de CSS\n");
                int bot = (int) (Math.random() * 2 + 1);
                switch (bot) {
                    case 1 -> {
                        int daño = Ataque();
                        vidaUser -= daño;
                        if (vidaUser < 0){
                            vidaUser = 0;
                        }
                    }
                    case 2 -> {
                        int curacion = Cura();
                        vidaEnemigo += curacion;
                        if  (vidaEnemigo > 50){
                            vidaEnemigo = 50;
                        }
                    }
                }
                System.out.println("Vida: " + vidaUser + "\nVida CSS: " + vidaEnemigo + "\n");
            }
        }while (vidaEnemigo != 0 && vidaUser != 0);
        if(vidaUser > 0){
            System.out.println("Has ganado!!!");
        } else{
            System.out.println("Has perdido, la proxima vez será");
        }
    }

    public static int Ataque() {
        int ataque = (int) (Math.random() * 25 + 1);
        return ataque;
    }

    public static int Cura() {
        int cura = (int) (Math.random() * 20 + 1);
        return cura;
    }

    public static void main(String[] args) {
        int usuario;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce tu numero de usuario:\n1. Ricardo\n2. Nuria\n3. Maria\n4. Fernando\n5. Javier\n");
            usuario = sc.nextInt();
            System.out.println();
        } while (usuario > 5 || usuario < 1);

        switch (usuario) {
            case 1 -> {
                Ricardo();
            }
            case 2 -> {
                Nuria();
            }
            case 3 -> {
                Maria();
            }
            case 4 -> {
                Fernando();
            }
            case 5 -> {
                Javier();
            }
        }
        System.out.println("GAME OVER");
    }

}
