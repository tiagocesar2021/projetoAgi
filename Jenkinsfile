pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'Dtest=runner.RunnerCucumber'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
            // Arquivar artefatos, se necessário
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
        failure {
            // Notificar sobre falhas, se necessário
            echo 'Testes falharam!'
        }
        success {
            echo 'Testes passaram com sucesso!'
        }
    }
}
