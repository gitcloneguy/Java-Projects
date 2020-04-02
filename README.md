# Java-Projects
My java projects
[![CodeFactor](https://www.codefactor.io/repository/github/gitcloneguy/java-projects/badge)](https://www.codefactor.io/repository/github/gitcloneguy/java-projects)
[![Build Status](https://dev.azure.com/gitcloneguy-java-projects/java-projects/_apis/build/status/gitcloneguy.Java-Projects?branchName=master)](https://dev.azure.com/gitcloneguy-java-projects/java-projects/_build/latest?definitionId=4&branchName=master)

# Tests
We use travis ci to test with maven test and azure pipelines to test with javac
#  Azure pipelines with wora and compiling
 since java is run write once, run anywhare (WORA) if it compiles on inux it compiles everywhere
 if there is a problem in the code, that program shouldnt compile
 # Pipeline failure wwhen compiling failed
 if any errors are spit out by javac (compiler) the pipeline will fail because of failOnStderr: true.
 feel free to read the pipeline YAML it is at ```https://github.com/gitcloneguy/Java-Projects/blob/master/azure-pipelines.yml```
