package model;
import javax.persistence.*;
@Entity
@Table(name ="items")
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Sep 2, 2021
 */
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	/**
	 * 
	 */
	public ListItem() {
		super();
	}
	/**
	 * @param id
	 * @param store
	 * @param item
	 */
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}
	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "ListItem [id=" + id + ", store=" + store + ", item=" + item + "]";
	}
	
	public String returnItemDetails() {
		return this.store + ":" + this.item;
	}
	

}
