pipeline{
	agent any
	stages {
		stage('Clone resources') {
			steps {
				echo 'cloning ...'
				git branch: 'module06', url: 'https://github.com/frikki84/MJC_Module05.git'
			}
		}
		stage('Tests') {
			steps {
				echo 'Testing ...'
				bat 'gradle test'
			}
		}

		stage('Build') {
			steps {
				echo 'Building ...'
				bat 'gradle clean build'
				bat 'gradle model'
			}
		}

		stage('SonarQube analysis') {
			steps {
				echo 'SonarQube ...'
				bat 'gradle sonarqube'
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

 stage('Build & Generate Test Report') {
          steps {
              script {
                 try {
                        bat 'chmod +x gradle'
                        bat 'gradle build -x test --no-daemon'
                        bat 'gradle test jacocoTestReport --no-daemon'
                    } finally {
                        junit 'build/test-results/test/*.xml'
                    }
                }
            }
        }

       stage('Publish Test Coverage Report') {
         steps {
           step([$class: 'JacocoPublisher',
                execPattern: '**/build/jacoco/*.exec',
                classPattern: '**/build/classes',
                sourcePattern: 'src/main/java',
                exclusionPattern: 'src/test*'
                ])
            }
        }
	}
}