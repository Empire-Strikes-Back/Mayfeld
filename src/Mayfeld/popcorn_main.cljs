(ns Mayfeld.popcorn-main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan take! put! offer! close! to-chan! timeout
            sliding-buffer dropping-buffer
            mult tap untap mix unmix admix pub sub unsub
            go <! put! >! alt! alts! do-alts
            pipe pipeline pipeline-async]]
   [cljs.core.async.impl.protocols :refer [closed?]]
   [cljs.core.async.interop :refer-macros [<p!]]
   [goog.string.format :as format]
   [goog.string :refer [format]]
   [goog.object]
   [clojure.string :as Wichita.string]
   [cljs.reader :refer [read-string]]))

(def fs (js/require "fs"))
(def path (js/require "path"))

(goog-define TK-number 111)

(defn process
  []
  (go
    (println "does it mean i can go? huh? 'cause i will")))

(defn -main
  []
  (js/console.log "i never saw your face"))