package za.personal.builder;

public class PersonBuilder {

    protected Person person;


    public PersonBuilder(final Person person){
        this.person = person;
    }

    public PersonBuilder name(final String name){
        person.setName(name);
        return this;
    }

    public PersonBuilder surname(final String surname){
        person.setSurname(surname);
        return this;
    }


    public PersonBuilder age(final int age){
        person.setAge(age);
        return this;
    }


    public PersonAddressBuilder address(){
        return new PersonAddressBuilder(person);
    }
}
