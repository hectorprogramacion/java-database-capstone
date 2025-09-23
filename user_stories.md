# Format
**Title:**
_As a [user role], I want [feature/goal], so that [reason]._

**Acceptance Criteria:**
1. [Criteria 1]
2. [Criteria 2]
3. [Criteria 3]

**Priority:** [High/Medium/Low]
**Story Points:** [Estimated Effort in Points]
**Notes:**
- [Additional information or edge cases]

_As a Admin, I want to log into the portal, so that I can manage the platform securely._

**Acceptance Criteria:**
1. Admin can enter the login page
2. Admin is allowed to fill the required fields to log in
3. Admin is correctly logged in the portal

**Priority:** [High]
**Story Points:** 2
**Notes:**
_As a Admin, I want log out the portal, so that I can protect system access._

**Acceptance Criteria:**
1. Admin can find the logout button
2. Admin can interact with the logout button
3. Admin is correctly logged out after pressing the button and confirming it's exit

**Priority:** [High]
**Story Points:** 1
**Notes:**
- Should not be complicated unless the admin has some website rendering issues
  _As a Admin, I want to add doctors to the portal, so that the registry is updated._

**Acceptance Criteria:**
1. Correctly find doctors on the portal
2. Find the option to add or upload the new doctors entry
3. Perform updating without errors

**Priority:** [Medium]
**Story Points:** 3
**Notes:**
- Is 3 points assuming there is enough mastery to no dwandle too much
  _As a Admin, I want to delete doctor profiles from the portal, so that threats are mitigated._

**Acceptance Criteria:**
1. Find the existing doctor profiles in the portal
2. Apply the methods to delete the profiles
3. Check for the existing of profiles

**Priority:** [High]
**Story Points:** 3
**Notes:**
- This could be pretty important depending on the accesses the profile has
  _As a Admin, I want run a stored procedure in MySQL CLI to get the number of appointments per month, so that I can track usage statistics._

**Acceptance Criteria:**
1. Check for syntax mistakes on the stored procedure
2. Check the procedure actually get the number of appointments per month
3. Confirm the expected output

**Priority:** [Medium]
**Story Points:** 5
**Notes:**
- The priority could change drastically depending on the reason for tracking usage statistics
  _As a patient, I want to view a list of doctors without logging, so that I can explore options without registering._

**Acceptance Criteria:**
1. Patient can enter the page
2. Patient can skip login portal
3. Patient can find and see the list of doctors

**Priority:** [Medium]
**Story Points:** 4
**Notes:**
- skipping the login to portal could be troublesome
_As a Patient , I want to sign up using my email and password, so that I can book appointments._

**Acceptance Criteria:**
1. Patient can correctly fill the email and password fields
2. Patient can succesfully enter the portal
3. Patient can interact with the book appointments succesfully

**Priority:** [High]
**Story Points:** 4
**Notes:**
- The sign up process shouldn't be troublesome
  _As a Patient, I want to log into the portal, so that I can manage my bookings._

**Acceptance Criteria:**
1.  Patient can correctly fill the email and password fields
2. Patient can succesfully enter the portal
3. Patient can interact with the book appointments succesfully

**Priority:** [High]
**Story Points:** 3
**Notes:**
- It should be easier to login
    _As a Patient, I want to log out the portal, so that I can secure my account._

**Acceptance Criteria:**
1.  Patient can correctly find the logout button
2. Patient can interact with the button
3. Patient can't enter again without filling the appropiate fields

**Priority:** [High]
**Story Points:** 3
**Notes:**
- Most APIs do this functionality so it shouldn't be that hard
     _As a Patient, I want to Log in and book an hour-long appointment , so that I can consult with a doctor._

**Acceptance Criteria:**
1.  Patient can login correctly
2. Patient can interact with the book section, which is updated with other Books from external patients
3. Books are correctly passed to the doctor and a confirmation pop up is sent to the Patient

**Priority:** [High]
**Story Points:** 7
**Notes:**
- It involves creating functionality and managing dependencies across systems
    _As a Patient, I want to view my upcoming appointments , so that I can prepare accordingly._

**Acceptance Criteria:**
1.  Patient interact with the appointments section
2.  Appointments are correctly displayed from the record
3.  Appointments are correctly ordered through closeness on the date

**Priority:** [High]
**Story Points:** 6
**Notes:**
- It involves reusing functionality and manage dependencies across systems
    _As a Doctor, I want to Log into the portal , so that I can manage my appointments._

**Acceptance Criteria:**
1. Doctor can correctly join the page
2. Doctor can separate himself from patients login
3. Once succesfully login in, Doctor can enter and interact the appointments section

**Priority:** [High]
**Story Points:** 4
**Notes:**
- It involves reusing functionality and managing dependencies across systems
    _As a Doctor, I want to view my appointment calendar , so that I can stay organized._

**Acceptance Criteria:**
1. Doctor can find the calendar section on the app
2. The calendar section can store appointments across sessions
3. Doctor can interact with the calendar

**Priority:** [High]
**Story Points:** 4
**Notes:**
- If an API or prebuilt calendar is used, it shouldn't be complex( if it doesn't have connectivity issues with the databases)
    _As a Doctor, I want to mark my unavailability  , so that I can inform patients of available slots._

**Acceptance Criteria:**
1.  Doctor can interact with the calendar correctly
2.  The calendar is correctly synced with the Patients calendar
3.  Doctors can specify unavailability on the calendat

**Priority:** [High]
**Story Points:** 4
**Notes:**
- It involves creating functionality and managing dependencies across systems
    _As a Doctor, I want to view the patient details for upcoming appointments, so that I can be prepared._

**Acceptance Criteria:**
1.  Doctors can interact with the calendar correctly
2.  Calendar is correctly synced with Doctors and Patients
3.  Upcoming appointments are displayed according to closeness on date

**Priority:** [Medium]
**Story Points:** 6
**Notes:**
- It involves managing dependencies across systems
  
  
