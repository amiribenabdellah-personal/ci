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
                bat "mvn clean package"
            }
        }

        stage("Test") {
            steps {
                bat "mvn test"
            }
        }
        
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
        
        stage("DEPLOY") {
            steps {
				
                bat "mvn clean install deploy:deploy-file -DgroupId=tn.esprit.spring -DartifactId=timesheet -Dversion=1.8 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/timesheet-1.8.jar"           
            }
        }
    }
   
    post {
        always {
            cleanWs()
        }
    }
    
}
