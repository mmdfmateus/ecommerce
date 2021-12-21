/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author mmdfm
 */
public class User extends IdentifiableModel {
    private String Name;
    private String Cpf;
    private String Cnpj;
    private String Email;
    private String HashedPassword;
    private Address Address;
    private String PhoneNumber;

    public User(String Name, String Cpf, String Cnpj, String Email, String HashedPassword, Address Address, String PhoneNumber) {
        this.Name = Name;
        this.Cpf = Cpf;
        this.Cnpj = Cnpj;
        this.Email = Email;
        this.HashedPassword = HashedPassword;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getHashedPassword() {
        return HashedPassword;
    }

    public void setHashedPassword(String HashedPassword) {
        this.HashedPassword = HashedPassword;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    
}
