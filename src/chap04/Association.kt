package chap04

class Patient(val name: String) {
    fun doctorList(d: Doctor) {  // 인자로 참조
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) { // 인자로 참조
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val docter = Doctor("KimSabu")
    val patient = Patient("Adam")
    docter.patientList(patient)
    patient.doctorList(docter)
}