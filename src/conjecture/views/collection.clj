(ns conjecture.views.collection
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;  This is the men and womens section  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defpage "/mens" []
  (html5 [:h1 "This is the mens page."]))

(defpage "/mens/product" []
  (html5 [:h1 "This is the mens product page."]))

(defpage "/womens" []
  (html5 [:h1 "This is the womens page."]))

(defpage "/womens/product" []
  (html5 [:h1 "This is the womens product page."]))
