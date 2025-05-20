package homework.sounds;

public class SoundDemo {

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device : devices) {
            device.makeSound();
        }
    }
}