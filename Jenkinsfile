pipeline {

    agent any

    stages {
       stage ('GIT') {
            steps {
		bat "git clone https://github.com/amiribenabdellah-personal/ci" 
            }
        }

        stage("Build") {
            steps {
                bat "mvn -version"
                bat "mvn clean package"
            }
        }
        //hello
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
        stage("Email Notification") {
            steps {
              mail bcc: '', body: 'Bonjour , pipeline est en cours d\'execution ', cc: '', from: '', replyTo: '', subject: 'Jenkins', to: 'amir.ibenabdellah@esprit.tn'
            }
        }
        
        stage("DEPLOY") {
            steps {
				
                bat "mvn clean install deploy:deploy-file  -DgroupId=tn.esprit.spring -DartifactId=timesheet -Dversion=1.2 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/timesheet-1.2.jar"
            }
        }
        stage('Publish Test Coverage Report') {
         steps {
           step([$class: 'JacocoPublisher', 
                execPattern: '*/build/jacoco/.exec',
                classPattern: '**/build/classes',
                sourcePattern: 'src/main/java',
                exclusionPattern: 'src/test*'
                ])
            }
        }
    }
   
    post {
        always {
            cleanWs()
        }
    }
    
}
