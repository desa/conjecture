(ns conjecture.views.account
  (:require [conjecture.views.common :as common])
  (:use noir.core
        hiccup.page))


;;;;;;;;;;;;;;;;;;;;
;;  Account stuff ;;
;;;;;;;;;;;;;;;;;;;;

(defpage "/account" []
  (html5 [:h1 "This is the account summary page."]))

(defpage "/account/info" []
  (html5 [:h1 "This is the account info page."]))

(defpage "/account/shipping" []
  (html5 [:h1 "This is the account shipping page."]))

(defpage "/account/billing" []
  (html5 [:h1 "This is the account billing page."]))

(defpage "/account/orders" []
  (html5 [:h1 "This is the account orders page."]))

