(ns conjecture.views.checkout
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;; This is the checkout section  ;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defpage "/checkout" []
  (html5 [:h1 "This is the basic checkout/login page."]))

(defpage "/checkout/shipping" []
  (html5 [:h1 "This is the checkout shipping page."]))

(defpage "/checkout/payment" []
  (html5 [:h1 "This is the checkout payment page."]))

(defpage "/checkout/confirmation" []
  (html5 [:h1 "This is the checkout confirmation page."]))

;;This is the gues subsection for checkout
(defpage "/checkout/guest" []
  (html5 [:h1 "This is the checkout guest option."]))

(defpage "/checkout/guest/shipping" []
  (html5 [:h1 "This is the guest checkout shipping page."]))

(defpage "/checkout/guest/payment" []
  (html5 [:h1 "This is the guest checkout payment page."]))

(defpage "/checkout/guest/confirmation" []
  (html5 [:h1 "This is the guest checkout confirmation page."]))

(defpage "/checkout/guest/join" []
  (html5 [:h1 "This is the guest checkout join page."]))
