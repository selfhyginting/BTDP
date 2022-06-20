package Challange;

public class Data {
    int id;
    private String firstName;
    private String lastName;

    public Data(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder();
        builder.append(id)
            .append(":").append(firstName)
            .append(":").append(lastName).append(", ");
        
        return builder.toString();
    }
}
