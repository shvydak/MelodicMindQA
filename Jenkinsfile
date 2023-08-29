pipeline {
  agent any
  stages {
    stage('Clone Repository') {
      steps {
        git(url: 'https://github.com/shvydak/MelodicMindQA.git', branch: 'dev1')
      }
    }

    stage('Build The Project') {
      steps {
        withGradle() {
          bat 'gradlew clean melodic_mind_smoke'
        }

      }
    }

  }
}