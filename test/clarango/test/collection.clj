(ns clarango.test.collection
  (:require [clojure.test :refer :all]
            [clarango.core :as cla-core]
            [clarango.collection :as cla-coll]
            [clarango.database :as cla-db])
  (:use clojure.pprint))

(defn setup []
  (cla-core/set-connection!)
  (pprint (meta (cla-db/create "test-DB" [{:username "test-user"}])))
  (cla-core/set-default-db! "test-DB"))

(defn teardown []
  (pprint (cla-db/delete "test-DB"))
  (cla-core/set-connection! nil))

(defn fixture [f]
  (setup)
  (f)
  (teardown))

(use-fixtures :once fixture)

(deftest collection-test

  (testing "get all documents"
    (is (true? true))))
