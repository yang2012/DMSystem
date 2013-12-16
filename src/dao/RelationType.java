package dao;

// Generated Dec 16, 2013 7:25:34 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * RelationType generated by Justin Yang
 */
@Entity
@Table(name = "RelationType", catalog = "mydb")
public class RelationType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7965059147597962153L;
	private int id;
	private String name;
	private Set<DocumentRelation> documentRelations = new HashSet<DocumentRelation>(0);

	public RelationType() {
	}

	public RelationType(int id) {
		this.id = id;
	}

	public RelationType(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.relationType", cascade=CascadeType.ALL)
	public Set<DocumentRelation> getDocumentRelations() {
		return documentRelations;
	}

	public void setDocumentRelations(Set<DocumentRelation> documentRelations) {
		this.documentRelations = documentRelations;
	}

}
