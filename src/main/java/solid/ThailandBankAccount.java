package solid;

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.type = AccountType.Thailand;

        TransferProcessor processor = new TransferProcessor();
        processor.start(account);

    }
}

class TransferProcessor {

    TransferMoneyProcess transferMoneyProcess;

    public void start(BankAccount account) {
        if(account.type == AccountType.Thailand) {
            transferMoneyProcess = new ThailandBankAccount();
            transferMoneyProcess.transferMoney(account, 1000);
        }
    }
}

enum AccountType {
    Thailand,
    International
}

class BankAccount {
    public AccountType type;
}

// ======== Transfer process ======

interface TransferMoneyProcess {
    void transferMoney(BankAccount targetAccount, int amount);
}

public class ThailandBankAccount implements TransferMoneyProcess {
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Thailand");
    }
}

class InterBankAccount implements TransferMoneyProcess  {
    public void transferMoney(BankAccount targetAccount, int amount) {
        System.out.println("Transfer money Inter");
    }
}


class BaseXxxx {
}

class MyClass {
    BaseXxxx baseXxxx;
}

class MyClassV2{
    BaseXxxx baseXxxx;
    Object b;
}

