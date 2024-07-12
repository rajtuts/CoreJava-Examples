final public class ImmutableExample {

    private String name;
    private Address address;

    public ImmutableExample(String name,Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        Address address1 = new Address();
        address1.setStreet(address.getStreet());
        address1.setAptno(address.getAptno());
        address1.setCity(address.getCity());
        address1.setZip(address.getZip());
        return address1;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableExample{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setAptno("1100");
        address.setStreet("5000 N MacArthur Blvd");
        address.setCity("Irving");
        address.setZip(75038L);
        ImmutableExample immutableExample = new ImmutableExample("test",address);
        ImmutableExample immutableExample2 = immutableExample;
        immutableExample2.getAddress().setZip(76000L);
        System.out.println(immutableExample);
        System.out.println(immutableExample2);

    }
}

class Address {
    private String street;
    private String aptno;
    private String city;
    private Long zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptno() {
        return aptno;
    }

    public void setAptno(String aptno) {
        this.aptno = aptno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", aptno='" + aptno + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }
}
