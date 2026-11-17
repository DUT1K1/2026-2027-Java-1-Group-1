public class Person {
    String name;
    char middleName;
    double grade;
    int age;

    public Person(
            String name,
            char middleName,
            double grade,
            int age
    ) {
        this.name = name;
        this.middleName = middleName;
        this.grade = grade;
        this.age = age;
    }

    public Person(int age) {
        this.name = "Jon Doe";
        this.middleName = 'J';
        this.grade = 4.0;
        this.age = age;
    }

    public void introduce() {
        System.out.println(
                "My name is " + name + ",\nmy middle name" +
                        "is " + middleName + "\nmy grade " +
                        "is " + grade + "\nmy age is " + age
        );
    }

    public void wakeUp() {
        System.out.println(name + " woke up!");
    }

    public void eat() {
        System.out.println(name + " is eating!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + "!");
    }
}
