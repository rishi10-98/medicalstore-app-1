pipeline{
agent{
label 'master'
}
tools{
maven 'Maven'
}
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

stage('Package'){
steps{
bat 'mvn package'
}
}
}
}
