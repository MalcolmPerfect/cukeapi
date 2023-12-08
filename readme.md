## Cucumber template
### Purpose
This is a skeleton project to allow a quick-start using maven/java/cucumber.

It includes logging (log4j2) and DI (spring) as both are must-have. DI may seem OTT here but it's the only good way to share state between steps. Cucumber recommend picocontainer, I've used spring just because it seems a bit more commonly-used.

Should be good for providing the scaffolding to go and test something.

### Pre-requisite installs
All other dependencies in the pom

* Java JDK
* Maven

### Running the tests
Execute the tests
```dos
mvn verify
```
Execute in dry-run mode (useful when the tests take longer to run)
```dos
mvn verify -Dcucumber.execution.dry-run="true"
```
More options [on the cucumber site here](https://cucumber.io/docs/cucumber/api/?lang=java#options)


### ide usage
Use what you want, but vscode with the following extensions works well:
* extension pack for java
* cucumber

### other notes
#### maven
Using the failsafe plugin (as typically integration tests)

#### spring
Opted not for a spring boot project, just so you can see (I think more easily) what's needed. Actually most of the docs are aligned to spring boot so easier if you want to go that way. [More here on the cucumber-spring page](https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-spring).

Config is fairly minimal, you need a config class (in this case [CucumberSpringConfiguration](src/test/java/cukeskeleton/CucumberSpringConfiguration.java)) and also annotate _one and only one_ stepdef class.