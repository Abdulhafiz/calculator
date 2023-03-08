node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/Abdulhafiz/calculator.git'
  }

  stage("Compilation") {
    bat "./mvnw clean install -DskipTests"
  }

  stage("Tests") {

    stage("Runing unit tests") {
      bat "./mvnw test -Punit"
    }

    

  }
}
