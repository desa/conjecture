(ns conjecture.views.cart
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))

;;;;;;;;;;;;;;;;;;;;;
;;  Shopping Cart  ;;
;;;;;;;;;;;;;;;;;;;;;

(defpage "/cart" []
  (html5 [:h1 "This is the page for the shopping cart."]))