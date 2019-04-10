pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'echo "Hello, World!"'
                bat 'echo "This is a test"'
				bat 'echo "Third line test"'
            }
        }
        stage('Run') {
            steps {
                bat 'echo "This is a different stage"'
            }
        }
    }
}