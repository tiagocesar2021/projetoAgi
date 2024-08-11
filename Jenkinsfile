pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout do repositório na branch 'development'
                git branch: 'development', url: 'https://github.com/seu-usuario/seu-repositorio.git'
            }
        }
        stage('Build') {
            steps {
                // Executar o build e os testes unitários (se houver)
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Executar os testes Cucumber com Selenium
                sh 'mvn -Dtest=runner.RunnerCucumber'
            }
        }
    }
    post {
        always {
            // Publicar resultados dos testes
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
