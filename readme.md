## API testing with cucumber
## Purpose
Try out a few different approaches for testing apis. Using cucumber as the running/reporting mechanism
but with a few different testing approaches.

## Setup
Done via the cukeskeleton template repo and going from there

## RestAssured
Implementation very simple: static imports helpful. Only 1 line of code per stepdef
Using a state object to hold the response, and so avoiding using RA's own given/when/then
and instead allowing cucumber to handle it

### Running the tests
Execute the tests
```dos
mvn verify
```
Execute in dry-run mode (useful when the tests take longer to run)
```dos
mvn verify -D"cucumber.execution.dry-run=true"
```
More options [on the cucumber site here](https://cucumber.io/docs/cucumber/api/?lang=java#options)


