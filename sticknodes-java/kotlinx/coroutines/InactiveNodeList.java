package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class InactiveNodeList implements kotlinx.coroutines.Incomplete {
    private final kotlinx.coroutines.NodeList list;

    public InactiveNodeList(kotlinx.coroutines.NodeList r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    @Override // kotlinx.coroutines.Incomplete
    public kotlinx.coroutines.NodeList getList() {
            r1 = this;
            kotlinx.coroutines.NodeList r0 = r1.list
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
