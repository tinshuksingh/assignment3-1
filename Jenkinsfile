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
}

stage 'Unit Test'
node{
  sh './gradlew test --info'
}

//5
stage 'JaCoCo-Coverage-report'
node{
    sh './gradlew jacoco --info'
}

