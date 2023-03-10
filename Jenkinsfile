pipeline {

    agent any

    tools{
        maven 'MAVEN_3_9_0'
    }

    stages{
        stage("Build Maven") {
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/Abdulhafiz/calculator']])
                sh 'mvn clean install'
            }
        }

        stage("Build Image") {
            steps{
                script {
                    sh 'docker build -t abdulhafizdocker/calculator_integration.jar .'

                }
            }
        }

        stage("Push Image") {
            steps{
                script {
                    withCredentials([string(credentialsId: 'dockercred', variable: 'dockerpwd')]) {
                        sh 'docker login -u abdulhafizdocker -p ${dockerpwd}'
                    }

                    sh 'docker tag d390771aba78 abdulhafizdocker/calculator_integration:calculator_integration'

                    sh 'docker push abdulhafizdocker/calculator_integration:calculator_integration'

                }
            }
        }
    }




}