package dominio.pagamento;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double taxaMaquininha(double valor) {
            return valor * 1.03;
        }

        @Override
        public double descontoPagamento(double valor) {
            return 0;
        }
    },
    CREDITO{
        @Override
        public double taxaMaquininha(double valor) {
            return valor * 1.05;
        }

        @Override
        public double descontoPagamento(double valor) {
            return 0;
        }
    },
    PIX {
        @Override
        public double taxaMaquininha(double valor) {
            return 0;
        }

        @Override
        public double descontoPagamento(double valor) {
            return valor - (valor * 0.1);
        }
    };

    public abstract double descontoPagamento(double valor);

    public abstract double taxaMaquininha(double valor);
}
