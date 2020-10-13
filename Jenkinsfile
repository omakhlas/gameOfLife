pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            label '/usr/bin/docker'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -version'
                sh 'mvn clean install'
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}