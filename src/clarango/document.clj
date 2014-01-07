(ns clarango.document
  (:require [clarango.core :as clarango.core]
            [clarango.core-utility :as core-utility]
            [clarango.document-utility :as document-utility]))

(defn get-by-key
  "Gets a document by its key.

  Takes the document key as first argument. 

  Takes optional a collection name and a db name as further arguments.
  If omitted by user, the default db and collection will be used."
  [& args]
  (core-utility/get-uri (apply document-utility/build-document-uri args)))

(defn create
  "Creates a document. 

  First argument: A hash-map that represents the document.

  Takes optional a collection name and a db name as further arguments.
  If omitted by user, the default db and collection will be used.

  Also optional as argument is another hash containing further options:
  {createCollection: true/false, waitForSync: true/false}
  - createCollection meaning if the collection should be created if it does not exist yet;
  - waitForSync meaning if the server response should wait until the document is saved to disk;
  This hash might be passed in an arbitrary position after the first argument."
  [document &args]
  nil)

(defn replace-by-key
  "Replaces a document with a hash-map representing the new document.

  First argument: A hash representing the new document.
  Second argument: The document key.

  Takes optional a collection name and a db name as further arguments.
  If omitted by user, the default db and collection will be used.

  Also optional as argument is another hash containing further options:
  {waitForSync: true/false, rev: 'revision_id', policy: 'desired_behaviour'}
  - waitForSync meaning if the server response should wait until the document is saved to disk;
  - rev is the document revision
  - policy meanins the desired behaviour in case the given revision number does not match the latest document revision
  This hash might be passed in an arbitrary position after the first two arguments."
  [document &args]
  nil)

(defn update-by-key
  "Updates a document with a number of key value pairs. Inserts them into the existing document.

  First argument: A hash-map containing the new key/value pairs.
  Second argument: The document key.

  Takes optional a collection name and a db name as further arguments.
  If omitted by user, the default db and collection will be used.

  Also optional as argument is another hash containing further options:
  {waitForSync: true/false, keepNull: true/false, rev: 'revision_id', policy: 'desired_behaviour'}
  - waitForSync meaning if the server response should wait until the document is saved to disk;
  - keepNull meaning if the key/value pair should be deleted in the document 
    if the argument hash contains it with a null as value;
  - rev is the document revision
  - policy meanins the desired behaviour in case the given revision number does not match the latest document revision
  This hash might be passed in an arbitrary position after the first two arguments."
  [document &args]
  nil)

(defn delete-by-key
  "Deletes a document by its id.

  Takes the document key as first argument. 

  Takes optional a collection name and a db name as further arguments.
  If omitted by user, the default db and collection will be used.

  Also optional as argument is another hash containing further options:
  {waitForSync: true/false, rev: 'revision_id', policy: 'desired_behaviour'}
  - waitForSync meaning if the server response should wait until the document is saved to disk;
  - rev is the document revision
  - policy meanins the desired behaviour in case the given revision number does not match the latest document revision
  This hash might be passed in an arbitrary position after the first argument."
  [& args]
  nil)