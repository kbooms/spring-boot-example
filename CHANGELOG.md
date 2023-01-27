# Spring Boot 3 Playground Changelog
## Building a new project in Spring Boot 3 to adapt Web MVC, JWT, JPA, and whatever else I realize I need to understand along the way.

### Day 1:

Used Spring Inilializr (https://start.spring.io/) to set up project:
- Set to Maven project, Java, Spring Boot 3.0.2, Jar, Java 17
- Made project bare-bones:
	+ deleted .mvn folder (wrapper classes). Reason being Maven is installed on my computer within IntelliJ. Otherwise this could have been left in.
	+ deleted contents of the resources folder and started a application.yml properties file
	+ rewrote main Spring Application class, standardized a greeting, set the environment up to playtest JSON using records
	+ deleted the Spring Application test within the test folder. As far as I can tell it doesn't really do anything.
- Wrote an example JSON response and used @GetMapping to set the path where it can be accessed in the browser.

### Day 2:

Application is set up to implement JPA. I have written a docker-compose.yml file. But now it seems I need to set up Docker. The Terminal can be found in the toolbar in the bottom of the IDE.

### Day 3:

Documenting the process of setting up Docker on the computer. The goal is to get it installed a runnable within the IntelliJ terminal window. I think I'm almost there.

#### [ --- Docker Notes --- ] (eventually separate this insto a different file)
Docker is a container technology: A tool for creating and managing containers.

What is a Container?
- A standardized unit of software. A package of code and dependencies to run that code. (e.g. NodeJS code + the NodeJS runtime)
- The same container always yields the exact same application and execution behavior. No matter where or by whom it might be executed.
- Self contained an isolated

Support for containers is built into modern operating systems. Docker simplifies the creation and management of such containers

Why containers?
> Why would we want **independent, standardized "application packages"**?
- We often have different development & production environments
- We want to build and test in exactly (!) the same environment as we later run our app in
	+ Environment: The runtimes, languages, and frameworks you need for development
- Containerization allows different versions of a project to easily run without having to manually change, add, or drop dependencies.
- Low impact on OS, very fast, minimal disk space usage
- Sharing, re-building, and distribution is easy
- Encapsulated apps/environments instead of "whole machines"

Setting up Docker:
- go to: https://www.docker.com
- From the menu choose: 'Developers' > 'Docs'
- On that page choose 'Download and Install'
- Choose Docker Desktop for your OS *(I'm on Windows)*
- **BEFORE** downloading and installing Docker Desktop make sure you have:
	+ WSL 2 for Windows enabled
		* Hyper-V: From Start Menu search "Settings" > "Apps" > "Optional Features" > "Related Settings" > "More Windows Features"
		* Check on "Windows Hypervisor Platform"
	+ Hyper-V backend & Windows containers enabled
		* Same path into "More Windows Features"
		* Check on "Virtual Machine Platform"
	+ **NOTE**: changing these settings will require a restart of your computer.