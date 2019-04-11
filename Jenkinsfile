pipeline {
    agent any
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
