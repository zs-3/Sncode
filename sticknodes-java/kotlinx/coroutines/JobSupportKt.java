package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class JobSupportKt {
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_ALREADY = null;
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_RETRY = null;
    public static final kotlinx.coroutines.internal.Symbol COMPLETING_WAITING_CHILDREN = null;
    private static final kotlinx.coroutines.Empty EMPTY_ACTIVE = null;
    private static final kotlinx.coroutines.Empty EMPTY_NEW = null;
    private static final kotlinx.coroutines.internal.Symbol SEALED = null;
    private static final kotlinx.coroutines.internal.Symbol TOO_LATE_TO_CANCEL = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_ALREADY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SEALED"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.SEALED = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_NEW = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_ALREADY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_RETRY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_ACTIVE$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_NEW$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_NEW
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSEALED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.SEALED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTOO_LATE_TO_CANCEL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL
            return r0
    }

    public static final java.lang.Object boxIncomplete(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto Lc
            kotlinx.coroutines.IncompleteStateBox r0 = new kotlinx.coroutines.IncompleteStateBox
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            r0.<init>(r1)
            r1 = r0
        Lc:
            return r1
    }

    public static final java.lang.Object unboxState(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.IncompleteStateBox
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.IncompleteStateBox r0 = (kotlinx.coroutines.IncompleteStateBox) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            kotlinx.coroutines.Incomplete r0 = r0.state
            if (r0 != 0) goto L10
            goto L11
        L10:
            r1 = r0
        L11:
            return r1
    }
}
