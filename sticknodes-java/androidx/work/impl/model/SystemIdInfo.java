package androidx.work.impl.model;

/* loaded from: classes.dex */
public class SystemIdInfo {
    public final int systemId;
    public final java.lang.String workSpecId;

    public SystemIdInfo(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.workSpecId = r1
            r0.systemId = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof androidx.work.impl.model.SystemIdInfo
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.work.impl.model.SystemIdInfo r4 = (androidx.work.impl.model.SystemIdInfo) r4
            int r0 = r3.systemId
            int r2 = r4.systemId
            if (r0 == r2) goto L13
            return r1
        L13:
            java.lang.String r0 = r3.workSpecId
            java.lang.String r4 = r4.workSpecId
            boolean r4 = r0.equals(r4)
            return r4
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.workSpecId
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.systemId
            int r0 = r0 + r1
            return r0
    }
}
