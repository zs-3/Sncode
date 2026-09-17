package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes2.dex */
final class WaiterEB {
    public final kotlinx.coroutines.Waiter waiter;

    public WaiterEB(kotlinx.coroutines.Waiter r1) {
            r0 = this;
            r0.<init>()
            r0.waiter = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WaiterEB("
            r0.append(r1)
            kotlinx.coroutines.Waiter r1 = r2.waiter
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
