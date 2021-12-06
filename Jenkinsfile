pipeline
{
    agent any 
stages 
{
stage('Verify Branch')
{
    steps
{
    echo "@GIT_BRANCH"
}
    
}
stage('Checkout')
{
    steps
{
    git branch: 'main', url: 'https://github.com/pratikkashid/medicalstore-app.git'
}
    
}
stage('Build')
{
    steps
    {
        bat 'mvn compile'
        
    }
    
}
    stage('Package')
    {
        steps
    {
        bat 'mvn package'
    }
    
}
stage('Deploy')
{
    steps
{
    bat 'java -jar C:/ProgramData/Jenkins/.jenkins/workspace/docker/target/medstoreapp-docker.jar'
    
}
    
}
    
}
    
}
