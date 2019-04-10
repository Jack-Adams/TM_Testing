pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'echo "Hello, World!"'
                bat 'echo "This is a test"'
            }
            steps {
                bat 'echo "This is a different step"'
        }
        stage('Run') {
            steps {
                bat 'echo "This is a different stage"'
            }
        }
    }
}