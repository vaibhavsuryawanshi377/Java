pipeline {
    agent any

    environment {
        GITHUB_TOKEN = credentials('GITHUB_PAT') // PAT stored in Jenkins
        TEST_REPO_URL = "https://github.com/vaibhavsuryawanshi377/TestP.git"
        TEST_REPO_BRANCH = "main"
    }

    stages {
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
            echo "✅ Selenium tests workflow triggered successfully!"
        }
        failure {
            echo "❌ Failed to trigger Selenium tests!"
        }
    }
}
