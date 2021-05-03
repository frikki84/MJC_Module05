pipeline{
	agent any
	stages {
		stage('Clone resources') {
			steps {
				echo 'cloning ...'
				git branch: 'module06', url: 'https://github.com/frikki84/MJC_Module05.git'
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
				bat 'ls'
				cd ("build/libs") {
					script{
						withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
							echo "&"
							bat "java -jar Module05-snapshot-1.0.0.jar &"
						}
					}
				}
			}
		}
	}
}