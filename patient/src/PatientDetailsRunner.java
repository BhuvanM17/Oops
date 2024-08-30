import org.xworkz.patientdetails.dto.PatientDetailsDto;

public class PatientDetailsRunner {
    public static void main(String[] args) {
        PatientDetailsDto dto = new PatientDetailsDto();

        dto.setPatientId(101);
        dto.setPatientName("John Doe");
        dto.setOriginHospital("City Hospital");
        dto.setDestinationHospital("County Hospital");
        dto.setPatientWeight(75.0);
        dto.setTransferDate("2024-07-30");

        System.out.println("Patient ID: " + dto.getPatientId());
        System.out.println("Patient Name: " + dto.getPatientName());
        System.out.println("Origin Hospital: " + dto.getOriginHospital());
        System.out.println("Destination Hospital: " + dto.getDestinationHospital());
        System.out.println("Weight: " + dto.getPatientWeight() + " kg");
        System.out.println("Transfer Date: " + dto.getTransferDate());
    }
}
