pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            label 'master'
        }
    }
    options {
        skipDefaultCheckout(true)
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
            cleanWs deleteDirs: true
        }
    }
}