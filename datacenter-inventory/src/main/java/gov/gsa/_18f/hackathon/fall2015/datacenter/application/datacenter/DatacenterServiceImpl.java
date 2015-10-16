package gov.gsa._18f.hackathon.fall2015.datacenter.application.datacenter;

import gov.gsa._18f.hackathon.fall2015.datacenter.application.ApplicationErrorCode;
import gov.gsa._18f.hackathon.fall2015.datacenter.application.ApplicationException;
import gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter.Datacenter;
import gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter.DatacenterSearchCriteria;
import gov.gsa._18f.hackathon.fall2015.datacenter.infrastructure.persistence.datacenter.DatacenterRepository;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dfladung
 *
 */
@Service("datacenterServiceImpl")
@Transactional
public class DatacenterServiceImpl implements DatacenterService {

	private static final Log logger = LogFactory.getLog(DatacenterServiceImpl.class);

	@Autowired
	DatacenterRepository repo;

	@Override
	public List<Datacenter> retrieveByCriteria(DatacenterSearchCriteria criteria) throws ApplicationException {
		try {
			return repo.findAll();
		} catch (Exception e) {
			logger.error(e);
			throw new ApplicationException(ApplicationErrorCode.E_Unknown, "Retrieve failed", e);

		}
	}

	@Override
	public Datacenter retrieve(Long id) throws ApplicationException {
		try {
			return repo.find(id);
		} catch (Exception e) {
			logger.error(e);
			throw new ApplicationException(ApplicationErrorCode.E_Unknown, "Retrieve failed", e);

		}
	}

	@Override
	public Long create(Datacenter datacenter) throws ApplicationException {
		try {
			return repo.save(datacenter);
		} catch (Exception e) {
			logger.error(e);
			throw new ApplicationException(ApplicationErrorCode.E_Unknown, "Create failed", e);

		}
	}
}
