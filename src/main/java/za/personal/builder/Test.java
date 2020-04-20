package za.personal.builder;

public class Test {

    public static void main(String[] args) {

        Address address = new Address();
        Person person = new Person(address);
        PersonBuilder personBuilder = new PersonBuilder(person);
        personBuilder
                .age(44)
                .name("John")
                .surname("Wick")
                .address()
                    .postalCode("7777")
                    .streetAddress("1 Street Avenue")
                    .suburb("Suburb");

        System.out.println(person.toString());
    }
}
