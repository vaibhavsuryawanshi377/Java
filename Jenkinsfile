pipeline {
    agent any

    environment {
        GITHUB_TOKEN = credentials('GITHUB_PAT') // PAT stored in Jenkins
        TEST_REPO_URL = "https://github.com/vaibhavsuryawanshi377/TestP.git"
        TEST_REPO_BRANCH = "main"
    }

    stages {

        // ====================
        // 1️⃣ BUILD Stage
        // ====================
        stage('Build') {
            steps {
                echo "Building the main application..."
                // Add your build commands here, for example Maven build
                bat 'mvn clean package'
            }
        }

        // ====================
        // 2️⃣ DEPLOY Stage
        // ====================
        stage('Deploy') {
            steps {
                echo "Deploying the application..."
                // Add your deployment commands here
                // For example, copy files, deploy to server, start services, etc.
                // Example:
                // bat 'xcopy /E /Y target\\*.jar D:\\Deployments\\App\\'
            }
        }

        // ====================
        // 3️⃣ TEST Stage
        // ====================
        stage('Trigger Selenium Tests') {
            steps {
                script {
                    echo "Cloning Selenium repo..."
                    dir('selenium-tests') {
                        git branch: "${TEST_REPO_BRANCH}", url: "${TEST_REPO_URL}"
                    }

                    echo "Triggering GitHub Actions workflow..."
                    withEnv(["GITHUB_TOKEN=${GITHUB_TOKEN}"]) {
                        bat """
                        curl -X POST ^
                        -H "Accept: application/vnd.github.v3+json" ^
                        -H "Authorization: token %GITHUB_TOKEN%" ^
                        https://api.github.com/repos/vaibhavsuryawanshi377/TestP/dispatches ^
                        -d "{\\"event_type\\": \\"run-selenium-tests\\"}"
                        """
                    }
                }
            }
        }
    }

    post {
        success {
            echo "✅ Pipeline completed successfully!"
        }
        failure {
            echo "❌ Pipeline failed!"
        }
    }
}
