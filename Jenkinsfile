pipeline {
    agent any
    stages {
        stage('Initialise') {
            steps {
                bat "mvn clean"
			
            }
		}
		
		stage('Compile') {
			steps{
				bat "mvn compile"
				bat "echo var: $CLASSPATH"
			}
        }

		stage('Test') {
			steps{
				bat "cd target/classes"
				bat "java HeadlessTesting"
				bat "cd ../.."
				bat "mvn test"
			}
        }
	}
}
