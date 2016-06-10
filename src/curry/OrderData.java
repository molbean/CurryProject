package curry;
import java.util.Date;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrderData {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String product, quantity, deliverytime;
	@Persistent
	private Date date;

	public OrderData(String product, String quantity, String deliverytime, Date date) {
        //this.userId = userId;
		super();
        this.product = product;
        this.quantity = quantity;
        this.deliverytime = deliverytime;
        this.date = date;
    }
	public Long getId() {
        return id;
    }
	public void setId(Long id) {
		this.id = id;
	}
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
		this.product = product;
	}
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
     public String getDeliverytime() {
        return deliverytime;
    }
    public void setDeliverytime(String deliverytime) {
 		this.deliverytime = deliverytime;
 	}
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
    	this.date = date;
    }
}
