package za.personal.builder;

public class Person {

    private String name;
    private String surname;
    private int age;

    //

    private Address address;


    private Person() {
    }

    public Person(final Address address) {
        this.address = address;
    }

    public Person(final String name, final String surname, final int age, final  Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
