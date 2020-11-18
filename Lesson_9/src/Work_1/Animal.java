package Work_1;

public class Animal {
    String name;
    int age;
    Boolean tail;

    public Animal (String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);

        System.out.println(animal);
    }
}
