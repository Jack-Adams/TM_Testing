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
			}
        }

		stage('Test') {
			steps{
				bat "java -cp target/classes HeadlessTesting"
				bat "mvn test"
			}
        }
	}
}
