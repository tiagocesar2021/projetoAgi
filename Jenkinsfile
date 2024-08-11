pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout do repositório na branch 'development'
                git branch: 'development', url: 'https://github.com/tiagocesar2021/projetoAgi'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -Dtest=runner.RunnerCucumber'
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
