public class Student {
    private String Name;

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
}
class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Gawesh");
        System.out.println(s.getName());
    }
}
