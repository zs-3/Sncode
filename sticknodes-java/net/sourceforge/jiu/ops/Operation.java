package net.sourceforge.jiu.ops;

/* loaded from: classes2.dex */
public abstract class Operation {
    private boolean abort;
    private java.util.Vector progressListeners;

    public Operation() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.abort = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.progressListeners = r0
            return
    }

    public void setProgress(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L26
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L26
            r0 = 0
        Lc:
            java.util.Vector r1 = r3.progressListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            java.util.Vector r1 = r3.progressListeners
            int r2 = r0 + 1
            java.lang.Object r0 = r1.elementAt(r0)
            net.sourceforge.jiu.ops.ProgressListener r0 = (net.sourceforge.jiu.ops.ProgressListener) r0
            if (r0 == 0) goto L23
            r0.setProgress(r4)
        L23:
            r0 = r2
            goto Lc
        L25:
            return
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progress values must be from 0.0f to 1.0f; got "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setProgress(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto Le
            if (r4 >= r5) goto Le
            r0 = 1
            if (r5 < r0) goto Le
            float r4 = (float) r4
            float r5 = (float) r5
            float r4 = r4 / r5
            r3.setProgress(r4)
            return
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No valid arguments  zeroBasedIndex="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", totalItems="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
