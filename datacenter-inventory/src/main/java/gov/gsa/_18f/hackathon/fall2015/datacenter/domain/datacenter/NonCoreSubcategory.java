package gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import gov.gsa._18f.hackathon.fall2015.datacenter.domain.common.BaseEntity;

/**
 * @author dfladung
 *
 */
@Entity
@Access(AccessType.FIELD)
@Table(name = "non_core_subcategories")
public class NonCoreSubcategory extends BaseEntity {

	private static final long serialVersionUID = 1L;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
