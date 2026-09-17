package kotlinx.coroutines.internal;

/* compiled from: Atomic.kt */
/* loaded from: classes2.dex */
public abstract class OpDescriptor {
    public OpDescriptor() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object perform(java.lang.Object r1);

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
