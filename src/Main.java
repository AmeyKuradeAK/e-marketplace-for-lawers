import java.util.ArrayList;

// A class to represent a lawyer
class Lawyer {
    // Instance variables
    private String name;
    private String email;
    private String phone;
    private String specialization;
    private double rating;
    private ArrayList<Client> clients;

    // Constructor
    public Lawyer(String name, String email, String phone, String specialization) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.specialization = specialization;
        this.rating = 0.0;
        this.clients = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    // A method to add a new client
    public void addClient(Client client) {
        clients.add(client);
    }

    // A method to remove an existing client
    public void removeClient(Client client) {
        clients.remove(client);
    }

}

// A class to represent a client
class Client {
    // Instance variables
    private String name;
    private String email;
    private String phone;
    private String issue;
    private Lawyer lawyer;

    // Constructor
    public Client(String name, String email, String phone, String issue) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.issue = issue;
        this.lawyer = null;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }
}

// A class to represent the software
class LegalServiceSoftware {

    // A main method to test the software
    public static void main(String[] args) {

        // Create some lawyers and clients
        Lawyer l1 = new Lawyer("Alice", "alice@gmail.com", "1234567890", "Family Law");
        Lawyer l2 = new Lawyer("Bob", "bob@gmail.com", "0987654321", "Criminal Law");
        Client c1 = new Client("Charlie", "charlie@gmail.com", "1111111111", "Divorce");
        Client c2 = new Client("David", "david@gmail.com", "2222222222", "Fraud");

        // Connect the clients with the lawyers
        c1.setLawyer(l1);
        l1.addClient(c1);
        c2.setLawyer(l2);
        l2.addClient(c2);

        // Print some information
        System.out.println("Client " + c1.getName() + " is connected with lawyer " + c1.getLawyer().getName());
        System.out.println("Client " + c2.getName() + " is connected with lawyer " + c2.getLawyer().getName());

    }
}
