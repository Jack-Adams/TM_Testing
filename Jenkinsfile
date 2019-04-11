pipeline {
    agent any
	tools {
		maven 'Maven 3.6.0'
		jdk 'jdk11'
	}
    stages {
        stage('Initialise') {
            steps {
                bat '''
				    echo "PATH = $(PATH)"
					echo "MAVEN_HOME = $(MAVEN_HOME)"
				'''
            }
        }
		
        stage('Build') {
            steps {
                bat 'echo "This is a placeholder"'
            }
        }
    }
}