node {
   stage('Preparation') {
      git 'https://github.com/afageary/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}
