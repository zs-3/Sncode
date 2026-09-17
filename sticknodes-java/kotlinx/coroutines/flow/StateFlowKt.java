package kotlinx.coroutines.flow;

/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
public final class StateFlowKt {
    private static final kotlinx.coroutines.internal.Symbol NONE = null;
    private static final kotlinx.coroutines.internal.Symbol PENDING = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NONE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.NONE = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PENDING"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.PENDING = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.MutableStateFlow<T> MutableStateFlow(T r1) {
            kotlinx.coroutines.flow.StateFlowImpl r0 = new kotlinx.coroutines.flow.StateFlowImpl
            if (r1 != 0) goto L6
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L6:
            r0.<init>(r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNONE$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.NONE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPENDING$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.PENDING
            return r0
    }
}
