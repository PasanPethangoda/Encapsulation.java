public class Person {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Main{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pasan Pethangoda");
        p.setAge(23);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}