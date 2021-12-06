pipeline{
agent{label 'master'}
tools{maven 'm3'}
stages{
stage('Checkout'){
steps{
git branch: 'main', url: 'https://github.com/pratikkashid/medicalstore-app.git'
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
}
