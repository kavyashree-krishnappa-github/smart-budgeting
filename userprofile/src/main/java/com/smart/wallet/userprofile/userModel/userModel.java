package main.java.com.smart.wallet.userprofile.userModel;

@entity
public class userModel {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @column
    private String name;

    @column
    private String email;

    @column
    private String phoneNumber;

    @column
    private String address;

    @column 
    private String dateOfBirth;

    @column     
    private String gender;

    @column
    private List<String> bankAccounts;

    @column
    private List<String> creditCards;

    @column 
    private List<String> investmentAccounts;

    @column
    private List<String> loans;

    @column 
    private List<String> expenses;

    @column 
    private List<String> incomeSources;
}
