pipeline {
    agent any

    tools {
        maven 'maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/bharatchhajer/sb_mvc_rest_jpa_simple_container.git'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean package'
            }
        }

    }

    post {
        success {
            echo 'creation successful'
        }
        failure {
            echo 'Build failed'
        }
    }
}
