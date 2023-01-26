# Spring Boot 3 Playground Changelog
## Building a new project in Spring Boot 3 to adapt Web MVC, JWT, JPA, and whatever else I realize I need to understand along the way.

Day 1:

Used Spring Inilializr (https://start.spring.io/) to set up project:
- Set to Maven project, Java, Spring Boot 3.0.2, Jar, Java 17
- Made project bare-bones:
	+ deleted .mvn folder (wrapper classes). Reason being Maven is installed on my computer within IntelliJ. Otherwise this could have been left in.
	+ deleted contents of the resources folder and started a application.yml properties file
	+ rewrote main Spring Application class, standardized a greeting, set the environment up to playtest JSON using records
	+ deleted the Spring Application test within the test folder. As far as I can tell it doesn't really do anything.
- Wrote an example JSON response and used @GetMapping to set the path where it can be accessed in the browser.

Day 2:

Application is set up to implement JPA. I have written a docker-compose.yml file. But now it seems I need to set up Docker.