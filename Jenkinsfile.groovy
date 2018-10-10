pipeline {
    agent any

    stages {
        stage('Restore') {
            steps {
                echo 'Restoring...'
                bat "dotnet restore"
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                bat "dotnet build"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
