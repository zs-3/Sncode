package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public final class EventLoop_commonKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED_EMPTY = null;
    private static final kotlinx.coroutines.internal.Symbol DISPOSED_TASK = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVED_TASK"
            r0.<init>(r1)
            kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1)
            kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED_EMPTY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.CLOSED_EMPTY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getDISPOSED_TASK$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.DISPOSED_TASK
            return r0
    }
}
