pipeline {
    agent any

    stages {
        stage('Restore') {
            steps {
                echo 'Restoring..'
                bat "dotnet build"
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
