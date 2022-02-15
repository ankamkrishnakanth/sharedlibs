
def call(name){
  sh 'docker build -t ${name} .'
}
