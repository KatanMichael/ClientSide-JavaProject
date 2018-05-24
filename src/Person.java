import java.util.Arrays;

public class Person {
    int id;
    String name;
    Address address;
    boolean gander;
    int phones[];

    public Person(int id, String name, Address address, boolean gander, int[] phones) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gander = gander;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isGander() {
        return gander;
    }

    public void setGander(boolean gander) {
        this.gander = gander;
    }

    public int[] getPhones() {
        return phones;
    }

    public void setPhones(int[] phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", gander=" + gander +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}