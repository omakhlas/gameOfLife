pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn -version"
                sh "mcn clean install"
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}