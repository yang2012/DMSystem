package dao;

// Generated Dec 16, 2013 7:25:34 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * EvaluationExtraPropertyType generated by Justin Yang
 */
@Entity
@Table(name = "EvaluationExtraProperty", catalog = "mydb")
public class EvaluationExtraProperty implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4893004450009980422L;
	private int id;
	private String propertyName;
	private Set<EvaluationWithExtraProperty> extraProperties = new HashSet<EvaluationWithExtraProperty>(0);

	public EvaluationExtraProperty() {
	}

	public EvaluationExtraProperty(int id) {
		this.id = id;
	}

	public EvaluationExtraProperty(int id, String propertyName) {
		this.id = id;
		this.propertyName = propertyName;
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

	@Column(name = "propertyName", length = 45)
	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.evaluationExtraProperty")
	public Set<EvaluationWithExtraProperty> getExtraProperties() {
		return extraProperties;
	}

	public void setExtraProperties(Set<EvaluationWithExtraProperty> extraProperties) {
		this.extraProperties = extraProperties;
	}

}
