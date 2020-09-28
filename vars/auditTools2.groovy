def call(Map config) {
    node("slave_dotnet") {
      echo "${config.message}"
      sh '''
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
      '''
    }
}
