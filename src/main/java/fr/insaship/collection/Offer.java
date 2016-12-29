package fr.insaship.collection;


import java.io.Serializable;

public abstract class Offer implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract String getDescription();

	public abstract void setDescription(String description);
	

}
