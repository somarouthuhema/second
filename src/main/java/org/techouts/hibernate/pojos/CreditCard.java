package org.techouts.hibernate.pojos;
import javax.persistence.*;  

@Entity  
@DiscriminatorValue("creditcard")  

public class CreditCard extends Payment{
	@Column(name="cardType")
	public String cardType;
	public CreditCard()
	{
		
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
