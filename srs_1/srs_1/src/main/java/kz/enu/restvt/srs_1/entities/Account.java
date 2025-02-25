package kz.enu.restvt.srs_1.entities;

public class Account
{
    // перечисление содержит типы банковских счётов
    public enum AccountType
    {
        SAVINGS,    // сберегательный счёт
        CHECKING,   // расчетный счёт
        CREDIT,     // кредитный счёт
        DEPOSIT     // депозитный счёт
    }

    int id;                     // id (для БД)
    private String number;      // номер счёта
    private double balance;     // баланс на счёте
    private AccountType type;    // тип счёта
    private boolean isActive;    // состояние счёта

    public Account()
    {

    }
    public Account(int id, String number, double balance, AccountType type, boolean isActive)
    {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public AccountType getType()
    {
        return type;
    }

    public void setType(AccountType type)
    {
        this.type = type;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                ", isActive=" + isActive +
                '}';
    }
}
