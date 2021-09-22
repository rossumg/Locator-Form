package org.itech.locator.form.webapp.fhir.service;

import java.util.List;
import java.util.Optional;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ServiceRequest;
import org.hl7.fhir.r4.model.Task;

public interface FhirPersistingService {

	Bundle executeTransaction(Bundle transactionBundle);

	Optional<Task> getTaskFromServiceRequest(String serviceRequestId);

	List<Patient> searchPatientByValue(String searchValue);

	Optional<ServiceRequest> getServiceRequestForPatient(Patient patient);

	List<ServiceRequest> getServiceRequestsForPatients(List<Patient> patients);

	Optional<Task> getTaskById(String taskId);

}
