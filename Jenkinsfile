pipeline {
  agent any
  stages {
    stage('Clone Repository') {
      steps {
        git(url: 'https://github.com/shvydak/MelodicMindQA.git', branch: 'dev2')
      }
    }

    stage('MelodicMind Smoke Test') {
      steps {
        withGradle() {
          bat 'gradlew clean melodic_mind_smoke'
        }
      }
    }
    stage('LaVocal Smoke Test') {
      steps {
        withGradle() {
          bat 'gradlew clean la_vocal_smoke'
        }
      }
    }
    stage('LaVocal Main Test') {
      steps {
        withGradle() {
          bat 'gradlew clean la_vocal'
        }
      }
    }

  }
}
