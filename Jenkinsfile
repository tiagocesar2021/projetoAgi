pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package'
            }
        stage('Test'){
            steps{
                bat 'mvn -Dtest=runner.RunnerCucumber'
            }
        }
    }
}