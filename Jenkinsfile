pipeline {
  agent any
  
  tools{
    maven 'maven_3_9_0'
  }

  stages{
    
    stage("Build Maven") {
      steps{
        checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/Abdulhafiz/calculator']])
        sh 'mvn clean install'
      }
    }

  
  }
  
  
  
}
