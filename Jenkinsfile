pipeline {
    agent {
        docker {
            image "maven:3.6.0-jdk-13"
            label "docker"
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}