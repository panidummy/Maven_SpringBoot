
//Establishing SSH connection to GCP VM. Created the GCP VM as slave node in Jenkins through SSH private key and Jenkins run this job using that slave node.
node{
    def docker=tool name: 'docker', type: 'org.jenkinsci.plugins.docker.commons.tools.DockerTool'
    def dockerCMD = "$docker/bin/docker"

    stage('Checkout GIT Project'){
        git credentialsId: 'git credentials', url: 'https://github.com/panidummy/DynamicWeb.git'
    }

    stage('build and Test'){
       def MAVEN_HOME = tool name: 'maven-3', type: 'maven'
       sh "${MAVEN_HOME}/bin/mvn clean package"
    }

    stage('Build docker image'){
        sh "${dockerCMD} build -t panikumar1001/dynamicpro:3 ."
    }

    stage('Push docker image'){
        withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerPassword')]) {
           sh "${dockerCMD} login -u panikumar1001 -p ${dockerPassword}"
        }
        sh "${dockerCMD} push panikumar1001/dynamicpro:3"
    }

    stage('Run docker image'){
        sh "${dockerCMD} run -p 8082:8080 -d panikumar1001/dynamicpro:3"
    }
}
