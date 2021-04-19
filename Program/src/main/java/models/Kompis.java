package models;



import javax.persistence.*;



@Entity
public class Kompis
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String email;
	private Long telephoneNumber;
	
	
	
	public Kompis()
	{}
	
	public Kompis(String name, String email, long telephoneNumber)
	{
		setName(name);
		setEmail(email);
		setTelephoneNumber(telephoneNumber);
	}
	
	
	
	@Override
	public String toString()
	{
		return String.format
		(
			"Kompis[id=%d, name='%s', email='%s', telephoneNumber=%d]",
			id, name, email, telephoneNumber
		);
	}
	
	
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setTelephoneNumber(Long telephoneNumber)
	{
		this.telephoneNumber = telephoneNumber;
	}
	
	
	
	
	public Long getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public Long getTelephoneNumber()
	{
		return telephoneNumber;
	}
	
}