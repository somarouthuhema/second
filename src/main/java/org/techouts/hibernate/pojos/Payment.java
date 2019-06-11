package org.techouts.hibernate.pojos;
import javax.persistence.*;  

@Entity  
@Table(name="employee") 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="payment")  
  

public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="payId")
	public int payId;
	@Column(name="amount")
	public int amount;
	public Payment(){
		
	}
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
