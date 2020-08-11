package org.itech.locator.form.webapp.fhir.service.transform;

import java.util.List;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ServiceRequest;
import org.hl7.fhir.r4.model.Task;
import org.itech.locator.form.webapp.api.dto.LocatorFormDTO;
import org.itech.locator.form.webapp.api.dto.Traveller;
import org.itech.locator.form.webapp.barcode.LabelContentPair;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface FhirTransformService {

	TransactionObjects createTransactionObjects(LocatorFormDTO locatorFormDTO) throws JsonProcessingException;

	Task createFhirTask();

	ServiceRequestPatientPair createFhirServiceRequestPatient(Traveller comp);

	Patient createFhirPatient(Traveller traveller);

	public class TransactionObjects {
		public Bundle bundle;
		public Task task;
		public List<ServiceRequestPatientPair> serviceRequestPatientPairs;
	}

	public class ServiceRequestPatientPair {
		public ServiceRequest serviceRequest;
		public Patient patient;

		public ServiceRequestPatientPair(ServiceRequest sRequest, Patient patient) {
			this.serviceRequest = sRequest;
			this.patient = patient;
		}
	}

	List<LabelContentPair> createLabelContentPair(TransactionObjects transactionObjects);

}
