package homework.sortable;

public class Person implements Sortable{

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compare(Sortable other){
        if (other instanceof Person) {
            Person otherPerson = (Person) other;
            return Integer.compare(this.age, otherPerson.age);
        } else {
            throw new IllegalArgumentException("Не сравниваемые объекты " + other.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "Person(age = " + age + ")";
    }
}