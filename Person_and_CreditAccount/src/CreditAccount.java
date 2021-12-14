public class CreditAccount {


    // fields
    public final int default_limit = 0 ;
    private int limit;
    private int balance;
    public final Person owner;
    private final long id ;

    // getMethods

    public int getBalance() {
        return this.balance;
    }

    public Person getOwner() {
        return this.owner;
    }

    public long getId() {
        return this.id;
    }

    public int getLimit() {
        return this.limit;
    }
    //-----------------------------------------------------
    // set methods


    public CreditAccount(Person owner, long id) {
        this.owner = owner;

        if (id < 0) throw new IllegalArgumentException();
        else this.id = id;
    }

   public void setLimit(int limit) {

        this.limit = limit * 100;
        if (this.balance < this.limit)throw new IllegalArgumentException();
    }

    private void setBalance(int balance) {
        if(balance < getLimit()) throw new IllegalArgumentException();
        else this.balance = balance;
    }


    //---------------------------------------------------------
    //Main methods


    //method that allows you to pay a sum of money on the deposit
    public int deposit ( int amount){

        if( amount < 0) throw new IllegalArgumentException();
        else this.balance += (amount*100) ; //express in cent

        return this.balance;
    }



    // metodo che permette di prelevare una somma di denaro
    public int withdraw(int amount){
        if( amount < 0) throw new IllegalArgumentException();
        else this.balance -= amount *100;

        if ( this.balance < getLimit()) throw new IllegalArgumentException();
        return this.balance;
    }




    public CreditAccount newOfLimitBalanceOwner(int limit, int balance, Person owner){
        CreditAccount p = new CreditAccount(owner, owner.socialSN);
        p.setLimit(limit);
        p.setBalance(balance);
        return p;

    }

    public CreditAccount newOfBalanceOwner(int balance, Person owner){

        CreditAccount p = new CreditAccount(owner, owner.socialSN);
        p.setLimit(default_limit);
        p.setBalance(balance);
        return this;
    }


}


