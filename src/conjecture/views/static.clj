(ns conjecture.views.static
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))

;;;;;;;;;;;;;;;;;;;;
;;  Static Pages  ;;
;;;;;;;;;;;;;;;;;;;;

(defpage "/about" []
  (html5 [:h1 "This is the about page."]))

(defpage "/contact" []
  (html5 [:h1 "This is the contact page."]))