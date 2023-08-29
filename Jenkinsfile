pipeline {
  agent any
  stages {
    stage('MM smoke') {
      steps {
        withGradle() {
          sh 'clean melodic_mind_smoke'
        }

      }
    }

    stage('La-Vocal Smoke') {
      steps {
        withGradle() {
          sh 'clean la_vocal_smoke'
        }

      }
    }

  }
}