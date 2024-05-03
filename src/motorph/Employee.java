package motorph;

public class Employee {
    // Attributes
    public String employeeID;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address; // Added address attribute
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private String position;

    // Constructor
    public Employee(String employeeID, String lastName, String firstName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagibigNumber, String status, String position) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address; // Initialize address attribute
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
    }

    // Getter for employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for birthday
    public String getBirthday() {
        return birthday;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Methods
    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }
}
