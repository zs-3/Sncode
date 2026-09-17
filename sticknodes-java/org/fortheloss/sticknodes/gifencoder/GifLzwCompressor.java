package org.fortheloss.sticknodes.gifencoder;

/* loaded from: classes2.dex */
class GifLzwCompressor {

    private static final class DictionaryEncoder {
        public int codeBits;
        private org.fortheloss.sticknodes.gifencoder.GifLzwCompressor.DictionaryEncoder.Node root;
        private int size;

        private static class Node {
            public org.fortheloss.sticknodes.gifencoder.GifLzwCompressor.DictionaryEncoder.Node[] children;
            public int symbol;

            public Node(int r1) {
                    r0 = this;
                    r0.<init>()
                    r0.symbol = r1
                    r1 = 256(0x100, float:3.59E-43)
                    org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node[] r1 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor.DictionaryEncoder.Node[r1]
                    r0.children = r1
                    return
            }
        }

        public DictionaryEncoder(int r6) {
                r5 = this;
                r5.<init>()
                r0 = 2
                if (r6 < r0) goto L31
                r1 = 8
                if (r6 > r1) goto L31
                r1 = 1
                int r2 = r1 << r6
                r5.size = r2
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r2 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node
                r3 = -1
                r2.<init>(r3)
                r5.root = r2
                r2 = 0
            L18:
                int r3 = r5.size
                if (r2 >= r3) goto L2a
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r3 = r5.root
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node[] r3 = r3.children
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r4 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node
                r4.<init>(r2)
                r3[r2] = r4
                int r2 = r2 + 1
                goto L18
            L2a:
                int r3 = r3 + r0
                r5.size = r3
                int r6 = r6 + r1
                r5.codeBits = r6
                return
            L31:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>()
                throw r6
        }

        public int encodeNext(int[] r5, int r6, int r7, org.fortheloss.sticknodes.gifencoder.BitOutputStream r8) throws java.io.IOException {
                r4 = this;
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r0 = r4.root
                r1 = r6
            L3:
                if (r1 >= r7) goto L14
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node[] r2 = r0.children
                r3 = r5[r1]
                r3 = r3 & 255(0xff, float:3.57E-43)
                r2 = r2[r3]
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r1 + 1
                r0 = r2
                goto L3
            L14:
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r2 = r4.root
                if (r0 == r2) goto L47
                int r2 = r0.symbol
                int r3 = r4.codeBits
                r8.writeBits(r2, r3)
                int r8 = r4.size
                r2 = 4096(0x1000, float:5.74E-42)
                if (r8 >= r2) goto L45
                if (r1 >= r7) goto L34
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node[] r7 = r0.children
                r5 = r5[r1]
                r5 = r5 & 255(0xff, float:3.57E-43)
                org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node r0 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder$Node
                r0.<init>(r8)
                r7[r5] = r0
            L34:
                int r5 = r4.size
                int r7 = r5 + (-1)
                r7 = r7 & r5
                if (r7 != 0) goto L41
                int r7 = r4.codeBits
                int r7 = r7 + 1
                r4.codeBits = r7
            L41:
                int r5 = r5 + 1
                r4.size = r5
            L45:
                int r1 = r1 - r6
                return r1
            L47:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Byte value out of range"
                r5.<init>(r6)
                throw r5
        }
    }

    private static void encodeLzwBlock(int[] r3, int r4, int r5, int r6, int r7, org.fortheloss.sticknodes.gifencoder.BitOutputStream r8) throws java.io.IOException {
            if (r4 < 0) goto L3a
            if (r4 > r5) goto L3a
            if (r5 > r6) goto L3a
            int r0 = r3.length
            if (r6 > r0) goto L3a
            r0 = 2
            if (r7 < r0) goto L34
            r0 = 8
            if (r7 > r0) goto L34
            org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder r0 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder
            r0.<init>(r7)
            r1 = 1
            int r7 = r1 << r7
            int r1 = r7 + 1
        L1a:
            if (r4 >= r5) goto L22
            int r2 = r0.encodeNext(r3, r4, r5, r8)
            int r4 = r4 + r2
            goto L1a
        L22:
            if (r4 != r5) goto L2e
            if (r5 >= r6) goto L27
            goto L28
        L27:
            r7 = r1
        L28:
            int r3 = r0.codeBits
            r8.writeBits(r7, r3)
            return
        L2e:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L34:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L3a:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public static void encodeMonolithic(int[] r6, int r7, int r8, int r9, org.fortheloss.sticknodes.gifencoder.BitOutputStream r10) throws java.io.IOException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r8
            r4 = r9
            r5 = r10
            encodeLzwBlock(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void encodeOptimized(int[] r19, int r20, int r21, int r22, int r23, org.fortheloss.sticknodes.gifencoder.BitOutputStream r24, boolean r25) throws java.io.IOException {
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            if (r7 < 0) goto Ldf
            if (r8 < r7) goto Ldf
            int r0 = r6.length
            if (r8 > r0) goto Ldf
            r0 = 2
            if (r9 < r0) goto Ld9
            r1 = 8
            if (r9 > r1) goto Ld9
            if (r10 <= 0) goto Ld9
            int r1 = r8 - r7
            int r1 = r1 + r10
            r2 = 1
            int r1 = r1 - r2
            int r12 = r1 / r10
            if (r12 != 0) goto L2e
            int r0 = r2 << r9
            int r0 = r0 + r2
            int r1 = r9 + 1
            r11.writeBits(r0, r1)
            return
        L2e:
            long[][] r1 = new long[r12][]
            r3 = 0
            r5 = r7
            r4 = 0
        L33:
            if (r4 >= r12) goto L56
            if (r25 == 0) goto L4c
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            r14[r3] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r14[r2] = r15
            java.lang.String r15 = "\rOptimizing: %d of %d blocks"
            r13.printf(r15, r14)
        L4c:
            long[] r13 = getLzwEncodedSizes(r6, r5, r10, r9)
            r1[r4] = r13
            int r4 = r4 + 1
            int r5 = r5 + r10
            goto L33
        L56:
            if (r25 == 0) goto L5d
            java.io.PrintStream r0 = java.lang.System.out
            r0.println()
        L5d:
            long[] r0 = new long[r12]
            int[] r13 = new int[r12]
            int r4 = r12 + (-1)
        L63:
            if (r4 < 0) goto L8c
            r5 = r1[r4]
            int r14 = r12 - r4
            r15 = r5[r14]
            r0[r4] = r15
            r13[r4] = r14
            r5 = 1
        L70:
            int r14 = r5 + r4
            if (r14 >= r12) goto L89
            r15 = r1[r4]
            r16 = r15[r5]
            r14 = r0[r14]
            long r16 = r16 + r14
            r14 = r0[r4]
            int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r18 >= 0) goto L86
            r0[r4] = r16
            r13[r4] = r5
        L86:
            int r5 = r5 + 1
            goto L70
        L89:
            int r4 = r4 + (-1)
            goto L63
        L8c:
            if (r25 == 0) goto L95
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Writing pixels - breakpoints: 0"
            r0.print(r1)
        L95:
            int r0 = r2 << r9
            int r1 = r9 + 1
            r11.writeBits(r0, r1)
            r14 = 0
        L9d:
            if (r14 >= r12) goto Ld1
            int r0 = r14 * r10
            int r1 = r7 + r0
            r15 = r13[r14]
            int r0 = r15 * r10
            int r0 = r0 + r1
            int r2 = java.lang.Math.min(r0, r8)
            if (r25 == 0) goto Lc4
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.print(r3)
        Lc4:
            r0 = r19
            r3 = r21
            r4 = r22
            r5 = r24
            encodeLzwBlock(r0, r1, r2, r3, r4, r5)
            int r14 = r14 + r15
            goto L9d
        Ld1:
            if (r25 == 0) goto Ld8
            java.io.PrintStream r0 = java.lang.System.out
            r0.println()
        Ld8:
            return
        Ld9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        Ldf:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    private static long[] getLzwEncodedSizes(int[] r8, int r9, int r10, int r11) {
            int r0 = r8.length     // Catch: java.io.IOException -> L3b
            int r0 = r0 - r9
            int r0 = r0 + r10
            r1 = 1
            int r0 = r0 - r1
            int r0 = r0 / r10
            int r0 = r0 + r1
            long[] r2 = new long[r0]     // Catch: java.io.IOException -> L3b
            org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder r3 = new org.fortheloss.sticknodes.gifencoder.GifLzwCompressor$DictionaryEncoder     // Catch: java.io.IOException -> L3b
            r3.<init>(r11)     // Catch: java.io.IOException -> L3b
            org.fortheloss.sticknodes.gifencoder.CountingBitOutputStream r11 = new org.fortheloss.sticknodes.gifencoder.CountingBitOutputStream     // Catch: java.io.IOException -> L3b
            r11.<init>()     // Catch: java.io.IOException -> L3b
            int r4 = r3.codeBits     // Catch: java.io.IOException -> L3b
            r5 = 0
            r11.writeBits(r5, r4)     // Catch: java.io.IOException -> L3b
            long r6 = r11.length     // Catch: java.io.IOException -> L3b
            r2[r5] = r6     // Catch: java.io.IOException -> L3b
            r4 = r9
            r5 = 1
        L1f:
            int r6 = r8.length     // Catch: java.io.IOException -> L3b
            if (r4 >= r6) goto L35
            int r6 = r8.length     // Catch: java.io.IOException -> L3b
            int r6 = r3.encodeNext(r8, r4, r6, r11)     // Catch: java.io.IOException -> L3b
            int r4 = r4 + r6
        L28:
            int r6 = r4 - r9
            int r7 = r5 * r10
            if (r6 < r7) goto L1f
            long r6 = r11.length     // Catch: java.io.IOException -> L3b
            r2[r5] = r6     // Catch: java.io.IOException -> L3b
            int r5 = r5 + 1
            goto L28
        L35:
            int r0 = r0 - r1
            long r8 = r11.length     // Catch: java.io.IOException -> L3b
            r2[r0] = r8     // Catch: java.io.IOException -> L3b
            return r2
        L3b:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
    }
}
