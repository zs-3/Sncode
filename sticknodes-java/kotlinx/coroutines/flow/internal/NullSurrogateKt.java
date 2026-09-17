package kotlinx.coroutines.flow.internal;

/* compiled from: NullSurrogate.kt */
/* loaded from: classes2.dex */
public final class NullSurrogateKt {
    public static final kotlinx.coroutines.internal.Symbol DONE = null;
    public static final kotlinx.coroutines.internal.Symbol NULL = null;
    public static final kotlinx.coroutines.internal.Symbol UNINITIALIZED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NULL"
            r0.<init>(r1)
            kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNINITIALIZED"
            r0.<init>(r1)
            kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "DONE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE = r0
            return
    }
}
