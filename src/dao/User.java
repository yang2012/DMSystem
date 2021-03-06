package dao;

// Generated Dec 16, 2013 7:25:34 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * User generated by Justin Yang
 */
@Entity
@Table(name = "User", catalog = "mydb")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8173965168787037049L;

	private int id;
	private String username;
	private String password;
	private String name;
	private Integer authority;
	private Set<Document> documents = new HashSet<Document>(0);
	private Set<Evaluation> evaluations = new HashSet<Evaluation>(0);

	public User() {
	}

	public User(int id) {
		this.id = id;
	}

	public User(int id, String username, String password, String name,
			Integer authority) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.authority = authority;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "authority")
	public Integer getAuthority() {
		return this.authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(Set<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

}
