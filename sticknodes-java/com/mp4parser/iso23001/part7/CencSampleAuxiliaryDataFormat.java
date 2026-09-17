package com.mp4parser.iso23001.part7;

/* loaded from: classes2.dex */
public class CencSampleAuxiliaryDataFormat {
    public byte[] iv;
    public com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[] pairs;

    /* renamed from: com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private abstract class AbstractPair implements com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair {
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        private AbstractPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ AbstractPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r1, com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L2d
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L12
                goto L2d
            L12:
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair r7 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair) r7
                int r2 = r6.clear()
                int r3 = r7.clear()
                if (r2 == r3) goto L1f
                return r1
            L1f:
                long r2 = r6.encrypted()
                long r4 = r7.encrypted()
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L2c
                return r1
            L2c:
                return r0
            L2d:
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "P("
                r0.<init>(r1)
                int r1 = r3.clear()
                r0.append(r1)
                java.lang.String r1 = "|"
                r0.append(r1)
                long r1 = r3.encrypted()
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private class ByteBytePair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private byte clear;
        private byte encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ByteBytePair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                byte r2 = (byte) r3
                r1.clear = r2
                int r2 = (int) r4
                byte r2 = (byte) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                byte r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                byte r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class ByteIntPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private byte clear;
        private int encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ByteIntPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                byte r2 = (byte) r3
                r1.clear = r2
                int r2 = (int) r4
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                byte r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                int r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class ByteLongPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private byte clear;
        private long encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ByteLongPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                byte r2 = (byte) r3
                r1.clear = r2
                r1.encrypted = r4
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                byte r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                long r0 = r2.encrypted
                return r0
        }
    }

    private class ByteShortPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private byte clear;
        private short encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ByteShortPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                byte r2 = (byte) r3
                r1.clear = r2
                int r2 = (int) r4
                short r2 = (short) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                byte r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                short r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class IntBytePair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private int clear;
        private byte encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public IntBytePair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                r1.clear = r3
                int r2 = (int) r4
                byte r2 = (byte) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                int r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                byte r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class IntIntPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private int clear;
        private int encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public IntIntPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                r1.clear = r3
                int r2 = (int) r4
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                int r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                int r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class IntLongPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private int clear;
        private long encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public IntLongPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                r1.clear = r3
                r1.encrypted = r4
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                int r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                long r0 = r2.encrypted
                return r0
        }
    }

    private class IntShortPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private int clear;
        private short encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public IntShortPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                r1.clear = r3
                int r2 = (int) r4
                short r2 = (short) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                int r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                short r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    public interface Pair {
        int clear();

        long encrypted();
    }

    private class ShortBytePair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private short clear;
        private byte encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ShortBytePair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                short r2 = (short) r3
                r1.clear = r2
                int r2 = (int) r4
                byte r2 = (byte) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                short r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                byte r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class ShortIntPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private short clear;
        private int encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ShortIntPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                short r2 = (short) r3
                r1.clear = r2
                int r2 = (int) r4
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                short r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                int r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    private class ShortLongPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private short clear;
        private long encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ShortLongPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                short r2 = (short) r3
                r1.clear = r2
                r1.encrypted = r4
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                short r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                long r0 = r2.encrypted
                return r0
        }
    }

    private class ShortShortPair extends com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.AbstractPair {
        private short clear;
        private short encrypted;
        final /* synthetic */ com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat this$0;

        public ShortShortPair(com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r2, int r3, long r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                short r2 = (short) r3
                r1.clear = r2
                int r2 = (int) r4
                short r2 = (short) r2
                r1.encrypted = r2
                return
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public int clear() {
                r1 = this;
                short r0 = r1.clear
                return r0
        }

        @Override // com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair
        public long encrypted() {
                r2 = this;
                short r0 = r2.encrypted
                long r0 = (long) r0
                return r0
        }
    }

    public CencSampleAuxiliaryDataFormat() {
            r1 = this;
            r1.<init>()
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.iv = r0
            r0 = 0
            r1.pairs = r0
            return
    }

    public com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair createPair(int r8, long r9) {
            r7 = this;
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2 = 32767(0x7fff, double:1.6189E-319)
            r4 = 127(0x7f, double:6.27E-322)
            r6 = 127(0x7f, float:1.78E-43)
            if (r8 > r6) goto L2f
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L15
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteBytePair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteBytePair
            r0.<init>(r7, r8, r9)
            return r0
        L15:
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L1f
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteShortPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteShortPair
            r0.<init>(r7, r8, r9)
            return r0
        L1f:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L29
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteIntPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteIntPair
            r0.<init>(r7, r8, r9)
            return r0
        L29:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteLongPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ByteLongPair
            r0.<init>(r7, r8, r9)
            return r0
        L2f:
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r8 > r6) goto L57
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L3d
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortBytePair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortBytePair
            r0.<init>(r7, r8, r9)
            return r0
        L3d:
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L47
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortShortPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortShortPair
            r0.<init>(r7, r8, r9)
            return r0
        L47:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L51
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortIntPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortIntPair
            r0.<init>(r7, r8, r9)
            return r0
        L51:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortLongPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$ShortLongPair
            r0.<init>(r7, r8, r9)
            return r0
        L57:
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntBytePair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntBytePair
            r0.<init>(r7, r8, r9)
            return r0
        L61:
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L6b
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntShortPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntShortPair
            r0.<init>(r7, r8, r9)
            return r0
        L6b:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L75
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntIntPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntIntPair
            r0.<init>(r7, r8, r9)
            return r0
        L75:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntLongPair r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$IntLongPair
            r0.<init>(r7, r8, r9)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L3a
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L12
            goto L3a
        L12:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r6 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r6
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r3 = r5.iv
            r2.<init>(r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r6.iv
            r3.<init>(r4)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L29
            return r1
        L29:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = r5.pairs
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r6 = r6.pairs
            if (r2 == 0) goto L36
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 != 0) goto L39
            goto L38
        L36:
            if (r6 == 0) goto L39
        L38:
            return r1
        L39:
            return r0
        L3a:
            return r1
    }

    public int getSize() {
            r3 = this;
            byte[] r0 = r3.iv
            int r0 = r0.length
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r1 = r3.pairs
            if (r1 == 0) goto L10
            int r2 = r1.length
            if (r2 <= 0) goto L10
            int r0 = r0 + 2
            int r1 = r1.length
            int r1 = r1 * 6
            int r0 = r0 + r1
        L10:
            return r0
    }

    public int hashCode() {
            r3 = this;
            byte[] r0 = r3.iv
            r1 = 0
            if (r0 == 0) goto La
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = r3.pairs
            if (r2 == 0) goto L15
            int r1 = java.util.Arrays.hashCode(r2)
        L15:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Entry{iv="
            r0.<init>(r1)
            byte[] r1 = r2.iv
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
            r0.append(r1)
            java.lang.String r1 = ", pairs="
            r0.append(r1)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r1 = r2.pairs
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
