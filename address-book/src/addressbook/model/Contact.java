package addressbook.model;

public class Contact implements Comparable<Contact>  {
	private long id;
	private String name;
	private String city;
	private String address;
	private String phone;
	private String email;
	private boolean person = true;
	
	public Contact() {
	}

	public Contact(String name, String city, String address, String phone, String email) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Contact(String name, String city, String address, String phone, String email, boolean person) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.person = person;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPerson() {
		return person;
	}

	public void setPerson(boolean person) {
		this.person = person;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Contact other) {
		return Long.compare(getId(), other.getId());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [id=").append(id).append(", name=").append(name).append(", address=").append(address)
				.append(", phone=").append(phone).append(", email=").append(email).append(", person=").append(person)
				.append("]");
		return builder.toString();
	}

}
