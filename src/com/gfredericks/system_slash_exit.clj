(ns com.gfredericks.system-slash-exit)

(defn exit
  "Calls (System/exit exit-status) to exit the JVM."
  [exit-status]
  (System/exit exit-status))
