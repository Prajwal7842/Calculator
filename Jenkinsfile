pipeline {
    agent any

    stages {
        stage('Github Pull') {
            steps {
                git branch: 'main', credentialsId: 'git_credential', url: 'https://github.com/Prajwal7842/Calculator'
            }
        }
        stage('Maven build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker build') {
            steps{
                script {
                    imageName=docker.build "prajwal7842/calculator_spe"
                }
            }
        }
        stage('Docker push img') {
            steps {
                script{
                    docker.withRegistry('','docker_credentials'){
                    imageName.push()
                    }
                }    
            }
        }
        stage('ansible pull img') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'p2.yml', sudoUser: null
            }    
        }
    }
}
