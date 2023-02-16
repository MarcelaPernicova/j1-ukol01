package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {

        Turtle zofka = new Turtle();


        for (int i = 0; i < 5; i++) {


            NakresliDomecek(zofka, 100 + 200 * i, 300);
        }

        NakresliDomecek(zofka, 100, 500);
        NakresliPrasatko(zofka,500,500);
        zofka.turnLeft(20);
        NakresliDomecek(zofka, 900, 500);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void NakresliDomecek(Turtle zofka, int pocatecniX, int pocatecniY){
        zofka.setLocation(pocatecniX, pocatecniY);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        zofka.turnRight(60);
        zofka.move(70);
        zofka.turnRight(60);
        zofka.move(70);
        zofka.turnRight(150);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(120);
    }
    public void NakresliPrasatko(Turtle zofka, int pocatecniX, int pocatecniY) {
        zofka.setLocation(pocatecniX, pocatecniY);
        zofka.move(90);
        zofka.turnLeft(120);
        zofka.move(110);
        zofka.turnLeft(130);
        zofka.move(110);
        zofka.turnLeft(20);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.penDown();

        zofka.turnLeft(30);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(40);

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(140);
        zofka.penDown();

        zofka.turnRight(50);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(40);


    }
}
