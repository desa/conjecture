(ns conjecture.views.common
  (:use noir.core
       hiccup.core
       hiccup.page
       hiccup.element))


;;;;;;;;;;;;;;;;
;;  Includes  ;;
;;;;;;;;;;;;;;;;

;; Put all js and css files that will need to be included in the website here

(def includes {:jquery (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js")})



;; Helper Partials

(defpartial build-head [incls]
  [:head
   [:title "Conjecture"]
   (map #(get includes %) incls)])

(defpartial link-item [{:keys [url cls text]}]
  [:li
   (link-to {:class cls} url text)])

;; Site Layout

(defpartial main-layout [& content]
  (html5
   (build-head [:jquery])
   [:body
    [:div#wrapper content]]))



(defpartial layout [& content]
  (html5
   [:head
    [:title "conjecture"]
    (include-css "/css/reset.css")]
   [:body
    [:div#wrapper
     content]]))
