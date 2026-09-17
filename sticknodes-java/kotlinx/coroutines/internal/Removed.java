package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
final class Removed {
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode ref;

    public Removed(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0 = this;
            r0.<init>()
            r0.ref = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Removed["
            r0.append(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r2.ref
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
