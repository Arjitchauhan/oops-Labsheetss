package lab_sheet_10.Q09;

import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private final int id;
    private final String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name);
    }
}

class Clinic {
    private final Queue<Patient> patients = new LinkedList<>();

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void servePatient() {
        Patient patient = patients.poll();
        if (patient == null) {
            System.out.println("No patients are waiting.");
        } else {
            System.out.print("Serving: ");
            patient.display();
        }
    }
}

public class PatientQueue {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addPatient(new Patient(1, "Asha"));
        clinic.addPatient(new Patient(2, "Ravi"));
        clinic.addPatient(new Patient(3, "Maya"));

        clinic.servePatient();
        clinic.servePatient();
        clinic.servePatient();
        clinic.servePatient();
    }
}
