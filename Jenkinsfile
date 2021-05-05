pipeline{
	agent any
	stages {
		stage('Clone resources') {
			steps {
				echo 'cloning ...'
				git branch: 'module06', url: 'https://github.com/frikki84/MJC_Module05.git'
			}
		}
		stage('Tests...') {
        		steps {
        			echo 'testing ...'
        			bat 'gradle test'
        		}
        }

		stage('Build') {
			steps {
				echo 'building ...'
				bat 'gradle clean build'
				bat 'gradle model'
			}
		}
		stage('Deploy') {
				steps {
            				echo 'Deploying ...'
            				dir ("build/libs") {
            					script{
            						withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
            							echo "&"
            							bat "start java -jar Module05-2.0.0.jar"
            						}
            					}
            				}
            			}
            		}

			stage('SonarQube analysis ') {
              steps {
        			echo 'SonarQube ...'
        			bat 'gradle sonarqube'
        			}
        }
	}
}