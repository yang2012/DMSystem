package dao;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Document generated by Justin Yang
 */
@Embeddable
public class DocumentRelationId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 280079502377227751L;

	private Document referer;
	private Document referee;
	private RelationType relationType;

	@ManyToOne
	public Document getReferer() {
		return referer;
	}

	public void setReferer(Document referer) {
		this.referer = referer;
	}

	@ManyToOne
	public Document getReferee() {
		return referee;
	}

	public void setReferee(Document referee) {
		this.referee = referee;
	}

	@ManyToOne
	public RelationType getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationType relationType) {
		this.relationType = relationType;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		DocumentRelationId that = (DocumentRelationId) o;

		if (this.referer != null ? !this.referer.equals(that.referer)
				: that.referer != null)
			return false;
		if (this.referee != null ? !this.referee.equals(that.referee)
				: that.referee != null)
			return false;
		if (this.relationType != null ? !this.relationType
				.equals(that.relationType) : that.relationType != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = (this.referer != null ? this.referer.hashCode() : 0);
		result = 31 * result
				+ (this.referee != null ? this.referee.hashCode() : 0);
		result = 31 * result
				+ (this.relationType != null ? this.relationType.hashCode() : 0);
		return result;
	}
}
