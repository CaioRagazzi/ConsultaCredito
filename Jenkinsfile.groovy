pipeline {
    agent any

    stages {
        stage('Restore') {
            steps {
                echo 'Restoring...'
                bat "dotnet restore"
            }
        }
        stage('Dir teste') {
            steps {
                echo 'Diring...'
                dir('teste')
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
