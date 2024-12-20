/* Develop a credit card transaction validator which validates transactions and classifies them as void and good transactions. 
A collection of transactions can be hardcoded in the program to process the data,

Txn template - credit card number #,credit Balance , Txn_amount, Debit Indicator (Y/N) if Y represents debit txn, N represents Credit txn
Rule 1: Creditcard # should be a valid 8 digit card number. It should start with either 36 or 37 and the sum of the rest 6 digits should be always less than 36 or 37.
Rule 2: If Debit indicator is Y then txn_amount should not be greater than the account balance.
Rule 3: all transactions should have all the four fields.

If any of the above rules fails in a record the record needs to be displayed as void transactions
If all the rules passes the txn should be displayed as successful transactions.

Sample Data
Txn Record 1 - 36345621,20000,1000,Y
Txn Record 2 - 37347621,40000,10000,Y
Txn Record 3 - 37347898,20000,1000,Y
Txn Record 4 - 37347191,2000,10000,Y
Txn Record 5 - 37347191,20000,1000,N

For the above given input Txn 1,2,5 are valid and displayed as valid records. Txn 3,4 should be displayed as invalid records as the credit card # validation fails 
and the txn amount is greater than the balance amount.*/

package test;

import java.util.*;

public class card {

	private String card_Number;
	private int credit_balance;
	private int amount;
	private char debit_indicator;

//	const
	public card() {

	}

//	overloaded const
	public card(String card_Number, int credit_balance, int amount, char debit_indicator) {
		this.card_Number = card_Number;
		this.credit_balance = credit_balance;
		this.amount = amount;
		this.debit_indicator = debit_indicator;
	}

	public String getCard_Number() {
		return card_Number;
	}

	public void setCard_Number(String card_Number) {
		this.card_Number = card_Number;
	}

	public int getCredit_balance() {
		return credit_balance;
	}

	public void setCredit_balance(int credit_balance) {
		this.credit_balance = credit_balance;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public char getDebit_indicator() {
		return debit_indicator;
	}

	public void setDebit_indicator(char debit_indicator) {
		this.debit_indicator = debit_indicator;
	}

	@Override
	public String toString() {
		return "card [card_Number=" + card_Number + ", credit_balance=" + credit_balance + ", amount=" + amount
				+ ", debit_indicator=" + debit_indicator + "]";
	}
}
