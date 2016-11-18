/*******************************************
    Author: Angel Carrillo
    Email: aa.ccp@outlook.com
    Title: Enumerations
    Description: Practice for Enumerations
********************************************/

public enum Apps{
	COURSERA("Coursera"),
	PLURALSIGHT("PluralSight"),
	LYNDA("Lynda"),
	DUOLINGO("Doulingo");

	private final String appsText;

	private Apps(String appsText){
		this.appsText = appsText;
	}

	public String print(){
		return this.appsText;
	}
}