public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Alex Man", 100); // Создаем команду
        person[1] = new Person("Jane Doe", 200);
        person[2] = new Person("John Watson", 300);
        person[3] = new Person("Bilbo Baggins", 90);
        Team team = new Team("Победители", person);


        Course course = new Course(100,50,200);
        String result = course.doIt(team);
        System.out.println(result);
    }
}