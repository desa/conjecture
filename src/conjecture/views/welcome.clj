(ns conjecture.views.welcome
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to conjecture"]))

(defpage "/" []
  (html5 [:h1 "This is my first page!"]))
