package lk.sliit.PAF.user.dto;

import java.util.Objects;

public class ResearcherDTO {
    private int id;
    private String fName;
    private String lName;
    private String email;
    private String contactNo;
    private String address;
    private String zipCode;
    private String rate;
    private String password;

    public ResearcherDTO() {
    }

    public ResearcherDTO(int id, String fName, String lName, String email, String contactNo, String address, String zipCode, String rate, String password) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.contactNo = contactNo;
        this.address = address;
        this.zipCode = zipCode;
        this.rate = rate;
        this.password = password;
    }

    public ResearcherDTO(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        ResearcherDTO other = (ResearcherDTO) o;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getfName(), getlName(), getEmail(), getContactNo(), getAddress(), getZipCode(), getRate(), getPassword());
    }
}