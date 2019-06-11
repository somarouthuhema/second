package org.techouts.hibernate.pojos;
import javax.persistence.*;
@Entity  
@DiscriminatorValue("creditcard")  

public class ChequePayment extends Payment{
	@Column(name="chequeType")
	public String chequeType;
	public ChequePayment()
	{
		
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

}
