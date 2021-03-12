node('docker') {
  stage('Poll') {
    checkout scm
  }
  stage('Build & Unit test'){
    sh 'mvn clean verify -DskipITs=true';
    junit '**/target/surefire-reports/TEST-*.xml'
    archive 'target/*.jar'
  }
  stage('Static Code Analysis'){
    sh 'mvn clean verify sonar:sonar -Dsonar.projectName=spring-boot-maven-example -Dsonar.host.url=http://129.213.112.244:9000 -Dsonar.projectKey=spring-boot-maven-example -Dsonar.projectVersion=$BUILD_NUMBER -Dsonar.login=0aaf9354664ab1c598974309a84131418def077d';
  }
  stage ('Publish'){
    def server = Artifactory.server 'Default Artifactory Server'
    def uploadSpec = """{
      "files": [
        {
          "pattern": "target/spring-boot-maven-example-0.0.1-SNAPSHOT.war",
          "target": "spring-boot-maven-example/${BUILD_NUMBER}/",
          "props": "Integration-Tested=Yes;Performance-Tested=No"
        }
      ]
    }"""
    server.upload(uploadSpec)
  }
}
