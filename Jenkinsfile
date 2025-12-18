
pipeline {
  agent any
  environment {
    IMAGE = "spacejet/api-health-monitor-ui:${env.BUILD_NUMBER}"
    REPO  = "spacejet/api-health-monitor-ui"
  }
  stages {
    stage('Build & Test') { steps { sh 'mvn -B clean package' } }
    stage('Docker Build') { steps { sh 'docker build -t $IMAGE .' } }
    stage('Tag & Push') {
      steps {
        sh 'docker tag $IMAGE $REPO:latest'
        sh 'docker push $IMAGE'
        sh 'docker push $REPO:latest'
      }
    }
    stage('Deploy') {
      steps {
        sh 'kubectl apply -f k8s/'
        sh 'kubectl set image deployment/api-health-monitor api-health-monitor=$IMAGE'
        sh 'kubectl rollout status deployment/api-health-monitor'
      }
    }
  }
}
