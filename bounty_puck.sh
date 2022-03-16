#!/bin/bash

shadow(){

  npm i --no-package-lock
  clj -A:dev:$2 -M -m shadow.cljs.devtools.cli $1 $2

}

watch(){
  shadow watch $1
}

repl(){
  shadow cljs-repl $1
}

"$@"