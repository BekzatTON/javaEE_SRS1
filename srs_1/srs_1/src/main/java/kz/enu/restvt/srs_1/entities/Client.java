package kz.enu.restvt.srs_1.entities;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    int id;                         // для БД
    private String name;            // имя клиента
    private String email;           // адрес электронной почты
    private String phoneNumber;     // номер телефона
    private List<Account> accounts;     // список счетов клиента

    public Client()
    {

    }
    public Client(int id, String name, String email, String phoneNumber, List<Account> accounts)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accounts = accounts;
    }

    public Client(int id, String name, String email, String phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>();
    }

    // добавляет новый счёт для клиента
    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public List<Account> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(List<Account> accounts)
    {
        this.accounts = accounts;
    }

    @Override
    public String toString()
    {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
