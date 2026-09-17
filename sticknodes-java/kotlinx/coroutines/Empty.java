package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
final class Empty implements kotlinx.coroutines.Incomplete {
    private final boolean isActive;

    public Empty(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isActive = r1
            return
    }

    @Override // kotlinx.coroutines.Incomplete
    public kotlinx.coroutines.NodeList getList() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isActive
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Empty{"
            r0.append(r1)
            boolean r1 = r2.isActive()
            if (r1 == 0) goto L13
            java.lang.String r1 = "Active"
            goto L15
        L13:
            java.lang.String r1 = "New"
        L15:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
