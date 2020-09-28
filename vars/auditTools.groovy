def call() {
    node("slave_dotnet") {
      sh '''
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
      '''
    }
}
