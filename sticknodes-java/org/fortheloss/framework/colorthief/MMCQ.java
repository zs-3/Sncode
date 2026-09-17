package org.fortheloss.framework.colorthief;

/* loaded from: classes2.dex */
public class MMCQ {
    private static final java.util.Comparator<org.fortheloss.framework.colorthief.MMCQ.VBox> COMPARATOR_COUNT = null;
    private static final java.util.Comparator<org.fortheloss.framework.colorthief.MMCQ.VBox> COMPARATOR_PRODUCT = null;



    public static class CMap {
        public final java.util.ArrayList<org.fortheloss.framework.colorthief.MMCQ.VBox> vboxes;

        public CMap() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.vboxes = r0
                return
        }

        public int[][] palette() {
                r5 = this;
                java.util.ArrayList<org.fortheloss.framework.colorthief.MMCQ$VBox> r0 = r5.vboxes
                int r0 = r0.size()
                int[][] r1 = new int[r0][]
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r0) goto L1d
                java.util.ArrayList<org.fortheloss.framework.colorthief.MMCQ$VBox> r4 = r5.vboxes
                java.lang.Object r4 = r4.get(r3)
                org.fortheloss.framework.colorthief.MMCQ$VBox r4 = (org.fortheloss.framework.colorthief.MMCQ.VBox) r4
                int[] r4 = r4.avg(r2)
                r1[r3] = r4
                int r3 = r3 + 1
                goto La
            L1d:
                return r1
        }

        public void push(org.fortheloss.framework.colorthief.MMCQ.VBox r2) {
                r1 = this;
                java.util.ArrayList<org.fortheloss.framework.colorthief.MMCQ$VBox> r0 = r1.vboxes
                r0.add(r2)
                return
        }
    }

    public static class VBox {
        private int[] _avg;
        private java.lang.Integer _count;
        private java.lang.Integer _volume;
        int b1;
        int b2;
        int g1;
        int g2;
        private final int[] histo;
        int r1;
        int r2;

        public VBox(int r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
                r0 = this;
                r0.<init>()
                r0.r1 = r1
                r0.r2 = r2
                r0.g1 = r3
                r0.g2 = r4
                r0.b1 = r5
                r0.b2 = r6
                r0.histo = r7
                return
        }

        public int[] avg(boolean r21) {
                r20 = this;
                r0 = r20
                int[] r1 = r0._avg
                if (r1 == 0) goto L8
                if (r21 == 0) goto L96
            L8:
                int r1 = r0.r1
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
            Lf:
                int r7 = r0.r2
                if (r1 > r7) goto L54
                int r7 = r0.g1
            L15:
                int r8 = r0.g2
                if (r7 > r8) goto L51
                int r8 = r0.b1
            L1b:
                int r9 = r0.b2
                if (r8 > r9) goto L4e
                int r9 = org.fortheloss.framework.colorthief.MMCQ.getColorIndex(r1, r7, r8)
                int[] r10 = r0.histo
                r9 = r10[r9]
                int r3 = r3 + r9
                double r10 = (double) r4
                double r12 = (double) r9
                double r14 = (double) r1
                r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r14 = r14 + r16
                double r14 = r14 * r12
                r18 = 4620693217682128896(0x4020000000000000, double:8.0)
                double r14 = r14 * r18
                double r10 = r10 + r14
                int r4 = (int) r10
                double r9 = (double) r5
                double r14 = (double) r7
                double r14 = r14 + r16
                double r14 = r14 * r12
                double r14 = r14 * r18
                double r9 = r9 + r14
                int r5 = (int) r9
                double r9 = (double) r6
                double r14 = (double) r8
                double r14 = r14 + r16
                double r12 = r12 * r14
                double r12 = r12 * r18
                double r9 = r9 + r12
                int r6 = (int) r9
                int r8 = r8 + 1
                goto L1b
            L4e:
                int r7 = r7 + 1
                goto L15
            L51:
                int r1 = r1 + 1
                goto Lf
            L54:
                r1 = 3
                r8 = 2
                r9 = 1
                if (r3 <= 0) goto L6d
                int[] r1 = new int[r1]
                int r4 = r4 / r3
                int r4 = ~r4
                int r4 = ~r4
                r1[r2] = r4
                int r5 = r5 / r3
                int r2 = ~r5
                int r2 = ~r2
                r1[r9] = r2
                int r6 = r6 / r3
                int r2 = ~r6
                int r2 = ~r2
                r1[r8] = r2
                r0._avg = r1
                goto L96
            L6d:
                int[] r1 = new int[r1]
                int r3 = r0.r1
                int r3 = r3 + r7
                int r3 = r3 + r9
                int r3 = r3 * 8
                int r3 = r3 / r8
                int r3 = ~r3
                int r3 = ~r3
                r1[r2] = r3
                int r2 = r0.g1
                int r3 = r0.g2
                int r2 = r2 + r3
                int r2 = r2 + r9
                int r2 = r2 * 8
                int r2 = r2 / r8
                int r2 = ~r2
                int r2 = ~r2
                r1[r9] = r2
                int r2 = r0.b1
                int r3 = r0.b2
                int r2 = r2 + r3
                int r2 = r2 + r9
                int r2 = r2 * 8
                int r2 = r2 / r8
                int r2 = ~r2
                int r2 = ~r2
                r1[r8] = r2
                r0._avg = r1
            L96:
                int[] r1 = r0._avg
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                org.fortheloss.framework.colorthief.MMCQ$VBox r0 = r1.m181clone()
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public org.fortheloss.framework.colorthief.MMCQ.VBox m181clone() {
                r9 = this;
                org.fortheloss.framework.colorthief.MMCQ$VBox r8 = new org.fortheloss.framework.colorthief.MMCQ$VBox
                int r1 = r9.r1
                int r2 = r9.r2
                int r3 = r9.g1
                int r4 = r9.g2
                int r5 = r9.b1
                int r6 = r9.b2
                int[] r7 = r9.histo
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public int count(boolean r6) {
                r5 = this;
                java.lang.Integer r0 = r5._count
                if (r0 == 0) goto L6
                if (r6 == 0) goto L31
            L6:
                r6 = 0
                int r0 = r5.r1
            L9:
                int r1 = r5.r2
                if (r0 > r1) goto L2b
                int r1 = r5.g1
            Lf:
                int r2 = r5.g2
                if (r1 > r2) goto L28
                int r2 = r5.b1
            L15:
                int r3 = r5.b2
                if (r2 > r3) goto L25
                int r3 = org.fortheloss.framework.colorthief.MMCQ.getColorIndex(r0, r1, r2)
                int[] r4 = r5.histo
                r3 = r4[r3]
                int r6 = r6 + r3
                int r2 = r2 + 1
                goto L15
            L25:
                int r1 = r1 + 1
                goto Lf
            L28:
                int r0 = r0 + 1
                goto L9
            L2b:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5._count = r6
            L31:
                java.lang.Integer r6 = r5._count
                int r6 = r6.intValue()
                return r6
        }

        public java.lang.String toString() {
                r8 = this;
                int r0 = r8.r1
                int r1 = r8.r2
                int r2 = r8.g1
                int r3 = r8.g2
                int r4 = r8.b1
                int r5 = r8.b2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "r1: "
                r6.append(r7)
                r6.append(r0)
                java.lang.String r0 = " / r2: "
                r6.append(r0)
                r6.append(r1)
                java.lang.String r0 = " / g1: "
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = " / g2: "
                r6.append(r0)
                r6.append(r3)
                java.lang.String r0 = " / b1: "
                r6.append(r0)
                r6.append(r4)
                java.lang.String r0 = " / b2: "
                r6.append(r0)
                r6.append(r5)
                java.lang.String r0 = r6.toString()
                return r0
        }

        public int volume(boolean r3) {
                r2 = this;
                java.lang.Integer r0 = r2._volume
                if (r0 == 0) goto L6
                if (r3 == 0) goto L25
            L6:
                int r3 = r2.r2
                int r0 = r2.r1
                int r3 = r3 - r0
                int r3 = r3 + 1
                int r0 = r2.g2
                int r1 = r2.g1
                int r0 = r0 - r1
                int r0 = r0 + 1
                int r3 = r3 * r0
                int r0 = r2.b2
                int r1 = r2.b1
                int r0 = r0 - r1
                int r0 = r0 + 1
                int r3 = r3 * r0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2._volume = r3
            L25:
                java.lang.Integer r3 = r2._volume
                int r3 = r3.intValue()
                return r3
        }
    }

    static {
            org.fortheloss.framework.colorthief.MMCQ$1 r0 = new org.fortheloss.framework.colorthief.MMCQ$1
            r0.<init>()
            org.fortheloss.framework.colorthief.MMCQ.COMPARATOR_COUNT = r0
            org.fortheloss.framework.colorthief.MMCQ$2 r0 = new org.fortheloss.framework.colorthief.MMCQ$2
            r0.<init>()
            org.fortheloss.framework.colorthief.MMCQ.COMPARATOR_PRODUCT = r0
            return
    }

    private static org.fortheloss.framework.colorthief.MMCQ.VBox[] doCut(char r16, org.fortheloss.framework.colorthief.MMCQ.VBox r17, int[] r18, int[] r19, int r20) {
            r0 = r16
            r1 = r17
            r2 = 103(0x67, float:1.44E-43)
            r3 = 114(0x72, float:1.6E-43)
            if (r0 != r3) goto Lf
            int r4 = r1.r1
            int r5 = r1.r2
            goto L1a
        Lf:
            if (r0 != r2) goto L16
            int r4 = r1.g1
            int r5 = r1.g2
            goto L1a
        L16:
            int r4 = r1.b1
            int r5 = r1.b2
        L1a:
            r6 = r4
        L1b:
            if (r6 > r5) goto L86
            r7 = r18[r6]
            r8 = 2
            int r9 = r20 / 2
            if (r7 <= r9) goto L83
            org.fortheloss.framework.colorthief.MMCQ$VBox r7 = r17.m181clone()
            org.fortheloss.framework.colorthief.MMCQ$VBox r9 = r17.m181clone()
            int r1 = r6 - r4
            int r10 = r5 - r6
            r11 = 1
            if (r1 > r10) goto L3d
            int r5 = r5 - r11
            int r10 = r10 / r8
            int r6 = r6 + r10
            int r1 = ~r6
            int r1 = ~r1
            int r1 = java.lang.Math.min(r5, r1)
            goto L4b
        L3d:
            int r6 = r6 - r11
            double r5 = (double) r6
            double r12 = (double) r1
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 / r14
            double r5 = r5 - r12
            int r1 = (int) r5
            int r1 = ~r1
            int r1 = ~r1
            int r1 = java.lang.Math.max(r4, r1)
        L4b:
            if (r1 < 0) goto L80
            r4 = r18[r1]
            if (r4 > 0) goto L52
            goto L80
        L52:
            r4 = r19[r1]
        L54:
            if (r4 != 0) goto L63
            if (r1 <= 0) goto L63
            int r4 = r1 + (-1)
            r4 = r18[r4]
            if (r4 <= 0) goto L63
            int r1 = r1 + (-1)
            r4 = r19[r1]
            goto L54
        L63:
            if (r0 != r3) goto L6b
            r7.r2 = r1
            int r1 = r1 + r11
            r9.r1 = r1
            goto L78
        L6b:
            if (r0 != r2) goto L73
            r7.g2 = r1
            int r1 = r1 + r11
            r9.g1 = r1
            goto L78
        L73:
            r7.b2 = r1
            int r1 = r1 + r11
            r9.b1 = r1
        L78:
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r0 = new org.fortheloss.framework.colorthief.MMCQ.VBox[r8]
            r1 = 0
            r0[r1] = r7
            r0[r11] = r9
            return r0
        L80:
            int r1 = r1 + 1
            goto L4b
        L83:
            int r6 = r6 + 1
            goto L1b
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VBox can't be cut"
            r0.<init>(r1)
            throw r0
    }

    static int getColorIndex(int r0, int r1, int r2) {
            int r0 = r0 << 10
            int r1 = r1 << 5
            int r0 = r0 + r1
            int r0 = r0 + r2
            return r0
    }

    private static int[] getHisto(int[][] r9) {
            r0 = 32768(0x8000, float:4.5918E-41)
            int[] r0 = new int[r0]
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r1) goto L26
            r4 = r9[r3]
            r5 = r4[r2]
            int r5 = r5 >> 3
            r6 = 1
            r7 = r4[r6]
            int r7 = r7 >> 3
            r8 = 2
            r4 = r4[r8]
            int r4 = r4 >> 3
            int r4 = getColorIndex(r5, r7, r4)
            r5 = r0[r4]
            int r5 = r5 + r6
            r0[r4] = r5
            int r3 = r3 + 1
            goto L8
        L26:
            return r0
    }

    private static void iter(java.util.List<org.fortheloss.framework.colorthief.MMCQ.VBox> r6, java.util.Comparator<org.fortheloss.framework.colorthief.MMCQ.VBox> r7, int r8, int[] r9) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r2) goto L51
            int r3 = r6.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r6.get(r3)
            org.fortheloss.framework.colorthief.MMCQ$VBox r3 = (org.fortheloss.framework.colorthief.MMCQ.VBox) r3
            int r5 = r3.count(r0)
            if (r5 != 0) goto L1e
            java.util.Collections.sort(r6, r7)
            int r1 = r1 + 1
            goto L2
        L1e:
            int r5 = r6.size()
            int r5 = r5 - r4
            r6.remove(r5)
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r3 = medianCutApply(r9, r3)
            r5 = r3[r0]
            r3 = r3[r4]
            if (r5 == 0) goto L49
            r6.add(r5)
            if (r3 == 0) goto L38
            r6.add(r3)
        L38:
            java.util.Collections.sort(r6, r7)
            int r3 = r6.size()
            if (r3 < r8) goto L42
            return
        L42:
            int r3 = r1 + 1
            if (r1 <= r2) goto L47
            return
        L47:
            r1 = r3
            goto L2
        L49:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "vbox1 not defined; shouldn't happen!"
            r6.<init>(r7)
            throw r6
        L51:
            return
    }

    private static org.fortheloss.framework.colorthief.MMCQ.VBox[] medianCutApply(int[] r14, org.fortheloss.framework.colorthief.MMCQ.VBox r15) {
            r0 = 0
            int r1 = r15.count(r0)
            r2 = 0
            if (r1 != 0) goto L9
            return r2
        L9:
            int r1 = r15.count(r0)
            r3 = 1
            if (r1 != r3) goto L1c
            r14 = 2
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r14 = new org.fortheloss.framework.colorthief.MMCQ.VBox[r14]
            org.fortheloss.framework.colorthief.MMCQ$VBox r15 = r15.m181clone()
            r14[r0] = r15
            r14[r3] = r2
            return r14
        L1c:
            int r1 = r15.r2
            int r2 = r15.r1
            int r1 = r1 - r2
            int r1 = r1 + r3
            int r2 = r15.g2
            int r4 = r15.g1
            int r2 = r2 - r4
            int r2 = r2 + r3
            int r4 = r15.b2
            int r5 = r15.b1
            int r4 = r4 - r5
            int r4 = r4 + r3
            int r3 = java.lang.Math.max(r1, r2)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 32
            int[] r5 = new int[r4]
            r6 = -1
            java.util.Arrays.fill(r5, r6)
            int[] r7 = new int[r4]
            java.util.Arrays.fill(r7, r6)
            if (r3 != r1) goto L6c
            int r8 = r15.r1
            r9 = 0
        L48:
            int r10 = r15.r2
            if (r8 > r10) goto Lbc
            int r10 = r15.g1
            r11 = 0
        L4f:
            int r12 = r15.g2
            if (r10 > r12) goto L66
            int r12 = r15.b1
        L55:
            int r13 = r15.b2
            if (r12 > r13) goto L63
            int r13 = getColorIndex(r8, r10, r12)
            r13 = r14[r13]
            int r11 = r11 + r13
            int r12 = r12 + 1
            goto L55
        L63:
            int r10 = r10 + 1
            goto L4f
        L66:
            int r9 = r9 + r11
            r5[r8] = r9
            int r8 = r8 + 1
            goto L48
        L6c:
            if (r3 != r2) goto L95
            int r8 = r15.g1
            r9 = 0
        L71:
            int r10 = r15.g2
            if (r8 > r10) goto Lbc
            int r10 = r15.r1
            r11 = 0
        L78:
            int r12 = r15.r2
            if (r10 > r12) goto L8f
            int r12 = r15.b1
        L7e:
            int r13 = r15.b2
            if (r12 > r13) goto L8c
            int r13 = getColorIndex(r10, r8, r12)
            r13 = r14[r13]
            int r11 = r11 + r13
            int r12 = r12 + 1
            goto L7e
        L8c:
            int r10 = r10 + 1
            goto L78
        L8f:
            int r9 = r9 + r11
            r5[r8] = r9
            int r8 = r8 + 1
            goto L71
        L95:
            int r8 = r15.b1
            r9 = 0
        L98:
            int r10 = r15.b2
            if (r8 > r10) goto Lbc
            int r10 = r15.r1
            r11 = 0
        L9f:
            int r12 = r15.r2
            if (r10 > r12) goto Lb6
            int r12 = r15.g1
        La5:
            int r13 = r15.g2
            if (r12 > r13) goto Lb3
            int r13 = getColorIndex(r10, r12, r8)
            r13 = r14[r13]
            int r11 = r11 + r13
            int r12 = r12 + 1
            goto La5
        Lb3:
            int r10 = r10 + 1
            goto L9f
        Lb6:
            int r9 = r9 + r11
            r5[r8] = r9
            int r8 = r8 + 1
            goto L98
        Lbc:
            if (r0 >= r4) goto Lcb
            r14 = r5[r0]
            if (r14 == r6) goto Lc8
            r14 = r5[r0]
            int r14 = r9 - r14
            r7[r0] = r14
        Lc8:
            int r0 = r0 + 1
            goto Lbc
        Lcb:
            if (r3 != r1) goto Ld4
            r14 = 114(0x72, float:1.6E-43)
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r14 = doCut(r14, r15, r5, r7, r9)
            goto Le3
        Ld4:
            if (r3 != r2) goto Ldd
            r14 = 103(0x67, float:1.44E-43)
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r14 = doCut(r14, r15, r5, r7, r9)
            goto Le3
        Ldd:
            r14 = 98
            org.fortheloss.framework.colorthief.MMCQ$VBox[] r14 = doCut(r14, r15, r5, r7, r9)
        Le3:
            return r14
    }

    public static org.fortheloss.framework.colorthief.MMCQ.CMap quantize(int[][] r6, int r7) {
            int r0 = r6.length
            if (r0 == 0) goto L55
            r0 = 2
            if (r7 < r0) goto L55
            r0 = 256(0x100, float:3.59E-43)
            if (r7 <= r0) goto Lb
            goto L55
        Lb:
            int[] r0 = getHisto(r6)
            org.fortheloss.framework.colorthief.MMCQ$VBox r6 = vboxFromPixels(r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r6)
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r4 = (double) r7
            double r4 = r4 * r2
            double r2 = java.lang.Math.ceil(r4)
            int r6 = (int) r2
            java.util.Comparator<org.fortheloss.framework.colorthief.MMCQ$VBox> r2 = org.fortheloss.framework.colorthief.MMCQ.COMPARATOR_COUNT
            iter(r1, r2, r6, r0)
            java.util.Comparator<org.fortheloss.framework.colorthief.MMCQ$VBox> r6 = org.fortheloss.framework.colorthief.MMCQ.COMPARATOR_PRODUCT
            java.util.Collections.sort(r1, r6)
            int r2 = r1.size()
            if (r7 <= r2) goto L38
            iter(r1, r6, r7, r0)
        L38:
            java.util.Collections.reverse(r1)
            org.fortheloss.framework.colorthief.MMCQ$CMap r6 = new org.fortheloss.framework.colorthief.MMCQ$CMap
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r7.next()
            org.fortheloss.framework.colorthief.MMCQ$VBox r0 = (org.fortheloss.framework.colorthief.MMCQ.VBox) r0
            r6.push(r0)
            goto L44
        L54:
            return r6
        L55:
            r6 = 0
            return r6
    }

    private static org.fortheloss.framework.colorthief.MMCQ.VBox vboxFromPixels(int[][] r13, int[] r14) {
            int r0 = r13.length
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r2 = 0
            r1 = 0
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r5 = 0
            r6 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 0
            r8 = 1000000(0xf4240, float:1.401298E-39)
            r9 = 0
        L12:
            if (r1 >= r0) goto L3c
            r3 = r13[r1]
            r10 = r3[r2]
            int r10 = r10 >> 3
            r11 = 1
            r11 = r3[r11]
            int r11 = r11 >> 3
            r12 = 2
            r3 = r3[r12]
            int r3 = r3 >> 3
            if (r10 >= r4) goto L28
            r4 = r10
            goto L2b
        L28:
            if (r10 <= r5) goto L2b
            r5 = r10
        L2b:
            if (r11 >= r6) goto L2f
            r6 = r11
            goto L32
        L2f:
            if (r11 <= r7) goto L32
            r7 = r11
        L32:
            if (r3 >= r8) goto L36
            r8 = r3
            goto L39
        L36:
            if (r3 <= r9) goto L39
            r9 = r3
        L39:
            int r1 = r1 + 1
            goto L12
        L3c:
            org.fortheloss.framework.colorthief.MMCQ$VBox r13 = new org.fortheloss.framework.colorthief.MMCQ$VBox
            r3 = r13
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r13
    }
}
