pipeline {
    agent any

    tools {
        maven 'Maven3'    // Name from "Manage Jenkins → Global Tool Configuration"
        jdk 'Java21'      // Name from "Manage Jenkins → Global Tool Configuration"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/vaibhavsuryawanshi377/Java.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "✅ Build Successful!"
        }
        failure {
            echo "❌ Build Failed!"
        }
    }
}
