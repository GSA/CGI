package gov.gsa._18f.hackathon.fall2015.datacenter.application.datacenter;

import gov.gsa._18f.hackathon.fall2015.datacenter.application.ApplicationException;
import gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter.Datacenter;
import gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter.DatacenterSearchCriteria;
import gov.gsa._18f.hackathon.fall2015.datacenter.domain.datacenter.QuarterlyData;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author dfladung
 *
 */
@Service("mockDatacenterServiceImpl")
public class MockDatacenterServiceImpl implements DatacenterService {

	@Override
	public List<Datacenter> retrieveByCriteria(DatacenterSearchCriteria criteria) throws ApplicationException {
		List<Datacenter> results = new ArrayList<Datacenter>();

		Datacenter d1 = new Datacenter();
		d1.setId(1L);
		d1.getDatacenterInformation().setDatacenterId("FDCCI-DC-45736");
		d1.getDatacenterInformation().setAgencyDataCenterId("FDCCI-DC-2782");

		d1.getDatacenterInformation().setStatus("Existing");
		d1.getDatacenterInformation().setValidity("ValidFacility");
		d1.getDatacenterInformation().setAgencyAbbreviation("GSA");
		d1.getDatacenterInformation().setComponent("FAS");
		d1.getDatacenterInformation().setDatacenterName("3R-VA0080ZZ");
		d1.getDatacenterInformation().setPublishedName("Sterling, VA");
		d1.getDatacenterInformation().setClassification("NonCore");

		d1.getAddress().setCity("Sterling");
		d1.getAddress().setState("VA");
		d1.getAddress().setZip("20166");
		d1.getAddress().setState("MD");
		d1.getAddress().setCountry("US");

		QuarterlyData qd = new QuarterlyData();
		qd.setTotalDecomissionedServers(16);
		qd.setRealPropertyDisposition("Q2/2015");
		qd.setClosingStage("Not Closing");
		qd.setUsedStorage(new BigDecimal(101));
		qd.setTotalStorage(new BigDecimal(149));
		qd.setTotalVirtualOs(49);
		qd.setTotalVirtualHosts(7);
		qd.setOtherServers(0);
		qd.setTotalHpcClusterNodes(3);
		qd.setTotalLinuxServers(14);
		qd.setTotalUnixServers(3);
		qd.setTotalWindowsServers(7);
		qd.setTotalOtherMainframes(0);
		qd.setTotalIbmMainframes(0);
		qd.setRackCount(37);
		qd.setElectricityMetered(false);
		qd.setElectricityIndcluded(false);
		qd.setFte(new BigDecimal(40));
		d1.getQuarterlyData().add(qd);

		results.add(d1);

		return results;
	}

}
