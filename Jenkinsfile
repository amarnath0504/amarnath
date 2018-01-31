pipeline {
  agent any
  stages {
    stage('SCM') {
      steps {
        git(url: 'https://github.com/amarnath0504/amarnath.git', branch: 'master', poll: true)
      }
    }
    stage('BUILD') {
      steps {
        sh 'mvn clean compile package'
      }
    }
    stage('DEPLOY') {
      steps {
        sh 'mvn deploy'
      }
    }
  }
  environment {
    SCM = ''
  }
}