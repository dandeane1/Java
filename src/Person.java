

public class Person {
       private String name;

        public void setName(String name) {
            this.name = name;
        }
public String getName()  {
        return name;
    }
        public void sayHello() {
            System.out.printf("Hello there %s!", this.name);
        }

        public Person(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Person joeSmith = new Person("Joe Smith");

            joeSmith.sayHello();
        }


    }
