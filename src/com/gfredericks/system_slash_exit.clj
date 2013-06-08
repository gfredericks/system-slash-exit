(ns com.gfredericks.system-slash-exit)

(defn exit
  "Calls (System/exit exit-status) to exit the JVM. Argument defaults
   to 0."
  ([] (exit 0))
  ([exit-status]
     (System/exit exit-status)))
