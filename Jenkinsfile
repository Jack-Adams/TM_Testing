pipeline {
    agent any
	tools {
		maven 'Maven 3.6.0'
		jdk 'jdk11'
	}
    stages {
        stage('Initialise') {
            steps {
                bat "echo var: $PATH"
				bat "echo var: $MAVEN_HOME"
            }
        }
		
        stage('Build') {
            steps {
                bat 'echo "This is a placeholder"'
            }
        }
    }
}