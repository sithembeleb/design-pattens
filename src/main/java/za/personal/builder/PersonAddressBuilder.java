package za.personal.builder;

public class PersonAddressBuilder extends PersonBuilder {

    protected Address address;

    public PersonAddressBuilder(final Person person) {
        super(person);
        this.address = person.getAddress();
    }

    private String streetAddress;
    private String suburb;
    private String postalCode;

    public PersonAddressBuilder streetAddress(final String streetAddress){
        address.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder suburb(final String suburb){
        address.setSuburb(suburb);
        return this;
    }

    public PersonAddressBuilder postalCode(final String postalCode){
        address.setPostalCode(postalCode);
        return this;
    }


}
