pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(url: 'https://github.com/amarnath0504/amarnath.git', branch: 'master', poll: true)
      }
    }
  }
  environment {
    SCM = ''
  }
}