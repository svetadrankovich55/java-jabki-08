package homework.sounds;

public class AlarmClock implements SoundEmitter{

    @Override
    public void makeSound() {
        System.out.println("Дзынь-дзынь!");
    }
}