public interface Engine {

    public static void main(String[] args) {
        Engine car = new Car();
        // car.a; not allowed
        // car.acc();
        // car.start();
        // car.stop();
        // car.Brake();
        // car.brake();
        // Engine engine;

        // Media carMedia = new Car();
        // carMedia.stop();

        NiceCar newcar = new NiceCar();
        newcar.start();
        newcar.startMusic();

        newcar.upgradeEngine();
        newcar.start();

    }

    static final int Price = 7800;

    void start();

    void stop();

    void acc();

    // /**
    // * Brake
    // */
    void Brake();

}

interface Brake {
    void brake();

    void start();

}

interface Media {
    void start();

    void stop();

}

interface A {
    void fun();
}

interface B extends A {
    void greet();
}

class Main2 implements B {

    @Override
    public void fun() {
        // TODO Auto-generated method stub

    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub

    }

}

class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I Start like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void Brake() {
        System.out.println("I Brake not normal");

    }
}

class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }

}

class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine Start");

    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");

    }

    @Override
    public void acc() {
        System.out.println("Power Engine Acc");

    }

    @Override
    public void Brake() {
        System.out.println("Power Engine Brake");

    }
}

/**
 * ElectricEngine implements Engine
 */
class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine Start");

    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Acc");

    }

    @Override
    public void Brake() {
        System.out.println("Electric Engine Brake");

    }

}

class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
