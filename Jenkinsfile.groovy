pipeline {
    agent any

    stages {
         stage('Load Parameters') {
            steps {
                    println "=======Load Parameters"
                    checkout ([$class: 'GitSCM', userRemoteConfigs: [[url: "https://github.com/CaioRagazzi/ConsultaCredito/edit/master/Jenkinsfile.groovy.git", credentialsId: credential]])
            }
        }
        stage('Restore') {
            steps {
                echo 'Restoring...'
                bat "dotnet restore"
            }
        }
        stage('Pwd') {
            steps {
                echo 'Pwding...'
                println(pwd())
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                bat "dotnet clean"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
