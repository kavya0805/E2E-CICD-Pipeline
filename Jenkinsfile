node{
    
    stage('git checkout'){
        git credentialsId: 'github-cred', url: 'https://github.com/kavya0805/E2E-CICD-Pipeline.git'
        
    }
    
    stage('maven clean'){
       def mavenHome = tool name: 'maven3', type: 'maven'
       def mavenCMD = "${mavenHome}/bin/mvn"
       sh "${mavenCMD} clean"
    }
    
    stage('maven build/test/package'){
       def mavenHome = tool name: 'maven3', type: 'maven'
       def mavenCMD = "${mavenHome}/bin/mvn"
       sh "${mavenCMD} package"
    }
    
    stage('build docker image'){
       sh 'docker build -t kavikarthic/bootcamp:2.0 .'
    }
    
    stage('Push docker image') {
        withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerPWD')]){
            sh "docker login -u kavikarthic -p ${dockerPWD}"
        }
        sh 'docker push kavikarthic/bootcamp:2.0'
    }
    
    stage ('Create EC2 Instance'){
        ansiblePlaybook installation: 'ansible', playbook: '/root/.jenkins/workspace/CICD-Pipeline/task.yml'
    }

    stage ('fecth EC2 IP Address') {
        def command = 'aws ec2 describe-instances --query "Reservations[*].Instances[*].PublicIpAddress[]"'
        def output = sh script : "${command}", returnStdout:true
        print output
        def myIp = output.split('"')
        def ipAddress = myIp[1]
        print ipAddress
    }
    
    stage('Installing Docker on EC2'){
        def dockerCMD = "sudo yum install docker -y"
        def command = 'aws ec2 describe-instances --query "Reservations[*].Instances[*].PublicIpAddress[]"'
        def output = sh script : "${command}", returnStdout:true
        def myIp = output.split('"')
        def ipAddress = myIp[1]
        sshagent(['aws-dev-server']){
            sh "ssh -o StrictHostKeyChecking=no ec2-user@${ipAddress} ${dockerCMD}"
        }
    }
    
    stage('starting docker engine service on EC2 Instance'){
        def dockerCMD = "sudo service docker start"
        def command = 'aws ec2 describe-instances --query "Reservations[*].Instances[*].PublicIpAddress[]"'
        def output = sh script : "${command}", returnStdout:true
        def myIp = output.split('"')
        def ipAddress = myIp[1]
        sshagent(['aws-dev-server']){
            sh "ssh -o StrictHostKeyChecking=no ec2-user@${ipAddress} ${dockerCMD}"
        }
    }
    
    stage('Run the docker Image'){
        def dockerCMD = "sudo docker run --name=myapp -p 8885:8080 kavikarthic/bootcamp:2.0"
        def command = 'aws ec2 describe-instances --query "Reservations[*].Instances[*].PublicIpAddress[]"'
        def output = sh script : "${command}", returnStdout:true
        def myIp = output.split('"')
        def ipAddress = myIp[1]
        sshagent(['aws-dev-server']){
            sh "ssh -o StrictHostKeyChecking=no ec2-user@${ipAddress} ${dockerCMD}"
        }
    }
}
