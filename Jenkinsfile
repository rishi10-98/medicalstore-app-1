pipeline{
agent{label 'master'}
tools{maven 'apache-maven-3.8.4'}
stages{
stage('Checkout'){
steps{
git branch: 'main', url: 'https://github.com/AKASHKASAR/Ebugtracker.git'
}
}
stage('Build'){
steps{
bat 'mvn compile'
}
}
stage('Test'){
steps{
bat 'mvn test'
}
}
stage('Package'){
steps{
bat 'mvn package'
}
}
}
