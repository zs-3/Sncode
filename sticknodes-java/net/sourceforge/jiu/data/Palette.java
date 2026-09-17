package net.sourceforge.jiu.data;

/* loaded from: classes2.dex */
public class Palette {
    private int[][] data;
    private int maxValue;
    private int numEntries;

    public Palette(int r2) {
            r1 = this;
            r0 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r0)
            return
    }

    public Palette(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 1
            if (r4 < r0) goto L1c
            r3.numEntries = r4
            r3.maxValue = r5
            r5 = 3
            int[][] r0 = new int[r5][]
            r3.data = r0
            r0 = 0
        L10:
            if (r0 >= r5) goto L1b
            int[][] r1 = r3.data
            int[] r2 = new int[r4]
            r1[r0] = r2
            int r0 = r0 + 1
            goto L10
        L1b:
            return
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Error -- numEntries must be larger than 0."
            r4.<init>(r5)
            throw r4
    }

    public java.lang.Object clone() {
            r5 = this;
            net.sourceforge.jiu.data.Palette r0 = new net.sourceforge.jiu.data.Palette
            int r1 = r5.getNumEntries()
            int r2 = r5.getMaxValue()
            r0.<init>(r1, r2)
            r1 = 0
            r2 = 0
        Lf:
            int r3 = r5.getNumEntries()
            if (r2 >= r3) goto L2f
            int r3 = r5.getSample(r1, r2)
            r0.putSample(r1, r2, r3)
            r3 = 1
            int r4 = r5.getSample(r3, r2)
            r0.putSample(r3, r2, r4)
            r3 = 2
            int r4 = r5.getSample(r3, r2)
            r0.putSample(r3, r2, r4)
            int r2 = r2 + 1
            goto Lf
        L2f:
            return r0
    }

    public int getMaxValue() {
            r1 = this;
            int r0 = r1.maxValue
            return r0
    }

    public int getNumEntries() {
            r1 = this;
            int r0 = r1.numEntries
            return r0
    }

    public int getSample(int r3, int r4) {
            r2 = this;
            int[][] r0 = r2.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7
            r3 = r0[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7
            r3 = r3[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7
            return r3
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r4 = r2.numEntries
            int r4 = r4 + (-1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Entry must be from 0 to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", channel from 0 to 2."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public void put(int r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 0
            r1.putSample(r0, r2, r3)
            r3 = 1
            r1.putSample(r3, r2, r4)
            r3 = 2
            r1.putSample(r3, r2, r5)
            return
    }

    public void putSample(int r3, int r4, int r5) {
            r2 = this;
            if (r5 < 0) goto L2d
            int r0 = r2.maxValue
            if (r5 > r0) goto L2d
            int[][] r0 = r2.data     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            r3 = r0[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            r3[r4] = r5     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r4 = r2.numEntries
            int r4 = r4 + (-1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Entry must be from 0 to "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ", channel from 0 to 2."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r4 = r2.maxValue
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value must be from 0 to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "; argument is "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
