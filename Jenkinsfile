pipeline {
    environment {
        JAVA_TOOL_OPTIONS = '-Duser.home=/home/jenkins'
    }
    agent {
        dockerfile {
            label 'master'
            args '-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'ssh -V'
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