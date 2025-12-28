public class Person {
private String name;
private int ID;
private String emailAddress;
private String Gender;
private int nationalID;
private String password;
public Person(String name, int iD, String emailAddress, String gender, int nationalID, String password) {
    this.name = name;
    ID = iD;
    this.emailAddress = emailAddress;
    Gender = gender;
    this.nationalID = nationalID;
    this.password = password;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getID() {
    return ID;
}
public void setID(int iD) {
    ID = iD;
}
public String getEmailAddress() {
    return emailAddress;
}
public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
}
public String getGender() {
    return Gender;
}
public void setGender(String gender) {
    Gender = gender;
}
public int getNationalID() {
    return nationalID;
}
public void setNationalID(int nationalID) {
    this.nationalID = nationalID;
}
public String getPassword() {
    return password;
}
public void setPasword(String pasword) {
    this.password = pasword;
}    
public boolean login(String inputPassword){
    if(inputPassword == this.password){
        System.out.println("LOGIN SUCCESSFUL");
    return inputPassword == this.password;
}

return false;
}

public void UpdateProfile(String newEmail, int nationalID){
this.emailAddress = newEmail;
this.ID = nationalID;
System.out.println("INFO got updated");
}
@Override
public String toString() {
    return "Person [name=" + name + ", ID=" + ID + ", emailAddress=" + emailAddress + ", Gender=" + Gender
            + ", nationalID=" + nationalID + ", pasword=" + password + "]";
}

}