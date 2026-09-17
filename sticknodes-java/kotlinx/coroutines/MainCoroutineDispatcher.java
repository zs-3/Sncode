package kotlinx.coroutines;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class MainCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    public MainCoroutineDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract kotlinx.coroutines.MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toStringInternalImpl()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L22:
            return r0
    }

    protected final java.lang.String toStringInternalImpl() {
            r2 = this;
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            return r0
        L9:
            r1 = 0
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r2 != r0) goto L15
            java.lang.String r0 = "Dispatchers.Main.immediate"
            return r0
        L15:
            return r1
    }
}
