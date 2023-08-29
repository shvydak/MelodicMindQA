pipeline{
    agent any
    tools{
        gradle "gradle-8.2.1"
    }
    stages{
        stage('Clone Repository'){
            steps{
                git branch: 'my', url: 'https://github.com/shvydak/MelodicMindQA.git'
            }
        }
        stage('Build the Project'){
            withGradle {
                sh './gradlew clean melodic_mind_smoke'
            }
        }
    }
}
