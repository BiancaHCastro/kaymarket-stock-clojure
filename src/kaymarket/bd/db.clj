(ns kaymarket.bd.db)

;; atom que armazena todas as transacoes
(def transacoes (atom '()))

(defn registrar-transacao! [transacao]
  (swap! transacoes conj transacao)
  @transacoes)

(defn ler-transacoes []
  @transacoes)