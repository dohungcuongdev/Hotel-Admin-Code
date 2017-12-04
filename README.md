# Cuong cdo7@csc.com

# This is source code. Not a project

$ You can use this source code to import into netbeans or eclipse to deploy on server.

$ In eclipse, if code not running 
=> 
Alt+f5 on project => Add out-of-date => ok.
Then right click on project => Deployment Assembly => Add => Java Build Path Entries => Maven Dependancy 
Then in Menu Bar click Window => Show view => Server => Remove tomcat (if exist) => Add again

$  To reload resource on tomcat server
Open the resource in new tab => enter 2 times to reload
Example: open resource below on new tab
http://localhost:8080/Hotel-booking-and-reservations-system-admin/resources/custom/myscripts.js
=> enter 2 times on the address bar