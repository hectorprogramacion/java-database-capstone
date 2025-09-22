## Summary
This Spring Boot application uses both MVC and REST controllers. 
Thymeleaf templates are used for the Admin and Doctor dashboards, while REST APIs serve all other modules used. 
The application interacts with two databases of MySQL (for patient, doctor, appointment, and admin data) and MongoDB (for prescriptions).
All controllers route requests through a common service layer, which  for each turn delegates requests to the appropriate repositories. 
MySQL uses JPA entities while MongoDB uses document models.

## Steps
1. User accesses AdminDashboard or Appointment pages.
2. The action is routed to the Thymeleaf if  Admin or Doctor are used ,otherwise REST controller is used.
3. The service layer is called from either Thymeleaf or REST.
4. The service layer uses the repository, depending on the specified in step 3, could be either MongoDB or MySQL
5. The service layer acceses the appropiate database for the chosen repository, could be either MongoDB or MySQL
6. The model is decided if we are using MySQL, in MongoDB we have only 1 option
7. If the model was MySQL here we decide between the four JPA entities Patient,Doctor,Appointment and Admin
