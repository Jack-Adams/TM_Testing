pipeline {
    agent any
	tools {
		maven 'Maven 3.6.0'
		jdk 'jdk8'
	}
    stages {
        stage('Initialise') {
            steps {
                bat "echo var: $PATH"
				bat "echo var: $MAVEN_HOME"
            }
        }
		
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
    }
}