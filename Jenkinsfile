pipeline{
	agent any
	stages {
		steps {
			echo 'cloning ...'
			git branch: 'module06'
			url: 'https://github.com/frikki84/MJC_Module05.git'

		}
	}
	stage('Build') {
		steps {
			sh 'gradle clean build'
			sh 'gradle model'
		}
	}
	stage('Deploy') {
		steps {
			echo 'Deploying ...'
			sh 'ls'
			dir("build/libs") {
				script{
					withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
						echo "&"
						sh "java -jar Module05-snapshot-1.0.0.jar &"
					}
				}
			}
		}
	}
}