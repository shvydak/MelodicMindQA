pipeline {
  agent any
  stages {
    stage('Base Site') {
      steps {
        withGradle() {
          sh 'clean melodic_mind_smoke'
        }

      }
    }

  }
}