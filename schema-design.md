## MySQL Database Design
### patients
- id: INT, Primary Key, Auto Increment
- admin_id: INT, Foreign Key → admin(id)
- doctor_id: INT, Foreign Key → doctors(id)
- motive: VARCHAR(100), Foreign Key → doctors(reason)
- date: DATETIME,  Foreign Key → appointment(appointment_time)
- status: INT,  Foreign Key → appointment(status)
 ### doctors
- id: INT, Primary Key, Auto Increment
- admin_id: INT, Foreign Key → admin(id)
- reason: VARCHAR(100), Foreign Key → patients(id)
- patient_id: INT, Foreign Key → patients(id)
- date: DATETIME,  Foreign Key → appointment(appointment_time)
- status: INT,  Foreign Key → appointment(status)
  ### appointments
- admin_id: INT, Foreign Key → admin(id)
- doctor_id: INT, Foreign Key → doctors(id)
- patient_id: INT, Foreign Key → patients(id)
- appointment_time: DATETIME, Not Null
- status: INT (0 = Scheduled, 1 = Completed, 2 = Cancelled
### admin
- id: INT, Primary Key, Auto Increment
- doctor_id: INT, Foreign Key → doctors(id)
- patient_id: INT, Foreign Key → patients(id)
- date: DATETIME,  Foreign Key → appointment(appointment_time)
- status: INT,  Foreign Key → appointment(status)


## MongoDB Collection Design
### Collection: prescriptions

```json
{
  "_id": "ObjectId('27fdn68701')",
  "patientName": "John Perez",
  "appointmentId": 51,
  "medication": "Paracetamol",
  "dosage": "250mg",
  "doctorNotes": "Take 1 tablet every 6 hours.",
  "refillCount": 2,
  "pharmacy": {
    "name": "Walgreens SF",
    "location": "John Street"
  }
}



