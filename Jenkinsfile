#!groovy

//1
stage 'clone_AssignmentProject'
node {
checkout scm
}

//2
stage 'Clean'
node{
  sh 'chmod +x gradlew'
  sh './gradlew clean --info'
  
   stash excludes: 'build/', includes: '**', name: 'source'
}

stage 'Unit Test'
node{
  sh './gradlew test --info'
  
  stash includes: 'build/jacoco/*.exec', name: 'unitCodeCoverage'
  stash includes: 'integration-test/build/jacoco/*.exec', name: 'commitIntegrationCodeCoverage'

   // publish JUnit results to Jenkins
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
}

stage 'Code Quality'

node {

   parallel (
       'jacoco': {
            // jacoco report rendering
            unstash 'source'
            unstash 'unitCodeCoverage'
            unstash 'commitIntegrationCodeCoverage'

            gradle.aggregateJaCoCoReports()
            publishHTML(target: [reportDir:'build/reports/jacoco/jacocoRootTestReport/html', reportFiles: 'index.html', reportName: 'Code Coverage'])
        }
      )
}

