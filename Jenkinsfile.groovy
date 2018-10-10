pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Restoring..'
                bat "dotnet restore"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
