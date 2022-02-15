
def call(name){
  sh "docker ${name} -t ankamkrishnakanth/krish:$BUILD_ID ."
}
