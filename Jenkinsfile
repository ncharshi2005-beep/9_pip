pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling the Calculator application...'
                // Command to compile the Java code
                bat 'javac Calculator.java' 
            }
        }
        stage('Test') {
            steps {
                echo 'Running the Calculator application...'
                // Command to run the Java application and check output
                bat 'java Calculator'
            }
        }
        stage('Archive') {
            steps {
                echo 'Archiving build artifacts...'
                // In a real setup, we would archive the .class or .jar files
                archiveArtifacts artifacts: '*.class', fingerprint: true
            }
        }
    }
}