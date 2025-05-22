import homework.files.File;
import homework.files.FileUtils;
import homework.files.ImageFile;
import homework.files.TextFile;
import homework.shapes.Circle;
import homework.shapes.Rectangle;
import homework.shapes.Shape;
import homework.sortable.FileSize;
import homework.sortable.Person;
import homework.sortable.Sortable;
import homework.sounds.AlarmClock;
import homework.sounds.CarHorn;
import homework.sounds.Dog;
import homework.sounds.SoundEmitter;
import homework.transport.Airplane;
import homework.transport.Bicycle;
import homework.transport.Transport;
import workshop.payment.CreditCardPayment;
import workshop.playable.Playable;
import workshop.playable.Song;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static homework.sortable.SortableUtils.sort;
import static homework.sounds.SoundDemo.playAllSounds;
import static homework.transport.Race.startRace;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * Абстрактный класс
 */

        /**
         * Абстрактный класс — это класс, который не может быть создан напрямую, и может содержать абстрактные методы (без реализации).
         *
         * Может содержать обычные методы с реализацией.
         * Может содержать поля.
         * Используется, когда нужно задать общее поведение + частично оставить реализацию подклассам.
         */
        CreditCardPayment payment = new CreditCardPayment(BigDecimal.TEN);
        payment.validate();
        payment.process();
        payment.complete();

        /**
         * Почему абстрактный класс здесь уместен?
         * Есть общее поведение для всех видов платежей: validate(), complete()
         * Метод processPayment() — обязательный, но зависит от реализации
         * Можно создавать новые типы оплаты (например, CryptoPayment) без переписывания остального кода.
         */

        /**
         * Интерфейсы (interface + implements)
         */

        /**
         * Интерфейс — это контракт поведения, который должен реализовать класс.
         * Он содержит только сигнатуры методов (по умолчанию).
         *
         * Нельзя хранить поля (кроме констант)
         * Класс реализует интерфейс с помощью implements
         * Класс может реализовывать несколько интерфейсов.
         */
        Song song = new Song("Песня про лето");
        song.play();

        Playable playable = new Song("Песня про весну!");
        playable.play();

        List<String> list = new ArrayList<>();

        /**
         * Все медиафайлы реализуют один контракт поведения — метод play().
         * Их можно группировать в общий список и воспроизводить единым способом, не зная, что это конкретно.
         */

        /**
         * Сравнение
         */

        /**
         * Используй абстрактный класс, если ты хочешь:
         * - зафиксировать часть поведения, но оставить реализацию остального на подклассы;
         * - объединить родственные классы с общими полями и логикой;
         * - дать конструктор или поля по умолчанию.
         **
         * Используй интерфейс, если ты хочешь:
         * - указать, что класс должен уметь делать, создать "поведенческий контракт";
         * - обеспечить множественное наследование поведения (Java допускает только один суперкласс, но много интерфейсов);
         *
         * Хочешь задать структуру + поведение? → Абстрактный класс
         * Хочешь задать только поведение? → Интерфейс
         */

        /**
         * Продвинутый уровень владения Java заключается в комбинирование этих подходов!
         */

        /**
         * Итоги (ООП)
         *
         * Класс это шаблон, а Объект его экземпляр
         *
         * 1. Инкапсуляция - скрываем детали реализации, предоставляем интерфейс
         * Модификаторы доступа (private, пустой, protected, public)
         *
         * 2. Наследование - новый класс наследует поведение и свойства родителя
         * extends
         *
         * 3. Полиморфизм - "Один интерфейс — много реализаций"
         * animal.makeSound() работает по-разному
         *
         * 4. Абстракция - работаем с сущностями через общие понятия, не детали
         * abstract class, interface
         */

        // 1. Фигуры
        System.out.println("\n 1. Фигуры \n");

        Shape[] shapes = new Shape[]{
                new Circle(7.0),
                new Rectangle(4, 6),
                new Circle(4.5),
                new Rectangle(2, 5),
        };

        for (Shape shape : shapes) {
            shape.displayArea();
        }

        // 2. Звуки
        System.out.println("\n 2. Звуки \n");

        SoundEmitter[] devices = new SoundEmitter[]{
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };

        playAllSounds(devices);

        // 3. Файловая система
        System.out.println("\n 3. Файловая система \n");

        File[] files = new File[]{
                new TextFile("document.txt", "Ученье свет а неученье тьма"),
                new ImageFile("photo.jpg", 1920, 1080, 3),
                new TextFile("notes.txt", "Java programming"),
                new ImageFile("icon.png", 64, 64, 4)
        };

        long totalSize = FileUtils.calculateTotalSize(files);
        System.out.println("Общий размер файлов: " + totalSize + " байт");

        // 4. Транспорт
        System.out.println("\n 4. Транспорт \n");

        Transport[] raceParticipants = new Transport[]{
                new Bicycle(25),
                new Airplane(800),
                new Bicycle(30),
                new Airplane(950)
        };
        startRace(raceParticipants);

        // 5. Сортируемые объекты
        System.out.println("\n 5. Сортируемые объекты \n");

        System.out.println("Сортировка по возрасту: ");
        Sortable[] array = new Sortable[]{
                new Person(25),
                new Person(20),
                new Person(30),
                new Person(10)
        };

        sort(array);

        for (Sortable a : array) {
            System.out.println(a);
        }
        System.out.println();

        System.out.println("Сортировка по размеру файла: ");
        Sortable[] array1 = new Sortable[]{
                new FileSize(1024),
                new FileSize(512),
                new FileSize(73),
                new FileSize(10724)
        };

        sort(array1);

        for (Sortable a : array1) {
            System.out.println(a);
        }
    }
}