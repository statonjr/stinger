(ns app.renderer.core
  (:require [reagent.core :as reagent :refer [atom]]
            [clojure.string :as string :refer [split-lines]]))

(enable-console-print!)

(defonce state        (atom 0))

(defn root-component []
  [:div
   [:div.logos
    [:img.electron {:src "img/electron-logo.png"}]
    [:img.cljs {:src "img/cljs-logo.svg"}]
    [:img.reagent {:src "img/reagent-logo.png"}]]
   [:pre "Versions:"
    [:p (str "Node     " js/process.version)]
    [:p (str "Electron " ((js->clj js/process.versions) "electron"))]
    [:p (str "Chromium " ((js->clj js/process.versions) "chrome"))]]
   [:button
    {:on-click #(swap! state inc)}
    (str "Clicked " @state " times")]])


(defn start! []
  (reagent/render
    [root-component]
    (js/document.getElementById "app-container")))

(start!)
