package kotlinx.coroutines.selects;

/* compiled from: Select.kt */
/* loaded from: classes2.dex */
public final class SelectKt {
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> DUMMY_PROCESS_RESULT_FUNCTION = null;
    private static final kotlinx.coroutines.internal.Symbol NO_RESULT = null;
    private static final kotlinx.coroutines.internal.Symbol PARAM_CLAUSE_0 = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_CANCELLED = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_COMPLETED = null;
    private static final kotlinx.coroutines.internal.Symbol STATE_REG = null;

    static {
            kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1 r0 = kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE
            kotlinx.coroutines.selects.SelectKt.DUMMY_PROCESS_RESULT_FUNCTION = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_REG"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_REG = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_COMPLETED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "STATE_CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.NO_RESULT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PARAM_CLAUSE_0"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.PARAM_CLAUSE_0 = r0
            return
    }

    private static final kotlinx.coroutines.selects.TrySelectDetailedResult TrySelectDetailedResult(int r3) {
            if (r3 == 0) goto L2f
            r0 = 1
            if (r3 == r0) goto L2c
            r0 = 2
            if (r3 == r0) goto L29
            r0 = 3
            if (r3 != r0) goto Le
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED
            goto L31
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected internal result: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L29:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED
            goto L31
        L2c:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            goto L31
        L2f:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
        L31:
            return r3
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult access$TrySelectDetailedResult(int r0) {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = TrySelectDetailedResult(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_RESULT$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.NO_RESULT
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_CANCELLED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_COMPLETED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSTATE_REG$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.selects.SelectKt.STATE_REG
            return r0
    }

    public static final /* synthetic */ boolean access$tryResume(kotlinx.coroutines.CancellableContinuation r0, kotlin.jvm.functions.Function1 r1) {
            boolean r0 = tryResume(r0, r1)
            return r0
    }

    private static final boolean tryResume(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 0
            java.lang.Object r3 = r2.tryResume(r0, r1, r3)
            if (r3 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            r2.completeResume(r3)
            r2 = 1
            return r2
    }
}
