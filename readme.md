## API testing with cucumber
### Purpose
Show how to test an api (happy path) with cucumber. Will start with rest assured and add other mechanisms over time

### Setup
Create new repo from the [cukeskeleton template repo](https://github.com/MalcolmPerfect/cukeskeleton)

### API
Using [postcodes.io](https://postcodes.io/) as this provides a few different (fairly standard) styles of API call

### RestAssured
Have kept this simple: 
* Only 1 line of code per stepdef
* Using a state object to hold the response, and so avoiding using RA's own given/when/then
and instead allowing cucumber to handle it

### Running the tests
#### Locally
Execute the tests
```dos
mvn verify
```
Execute in dry-run mode (useful when the tests take longer to run)
```dos
mvn verify -D"cucumber.execution.dry-run=true"
```
More options [on the cucumber site here](https://cucumber.io/docs/cucumber/api/?lang=java#options)

#### ci/cd
Project is built on circleci - configuration in [.circleci/config.yml](.circleci/config.yml)
[![MalcolmPerfect](https://circleci.com/gh/MalcolmPerfect/cukeapi.svg?style=svg)](https://app.circleci.com/pipelines/github/MalcolmPerfect/cukeapi)
