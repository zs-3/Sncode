package kotlinx.coroutines.selects;

/* compiled from: Select.kt */
/* loaded from: classes2.dex */
public enum TrySelectDetailedResult extends java.lang.Enum<kotlinx.coroutines.selects.TrySelectDetailedResult> {
    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $VALUES = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult ALREADY_SELECTED = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult CANCELLED = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult REREGISTER = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult SUCCESSFUL = null;

    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $values() {
            r0 = 4
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult[r0]
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED
            r2 = 2
            r0[r2] = r1
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "SUCCESSFUL"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "REREGISTER"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "CANCELLED"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "ALREADY_SELECTED"
            r2 = 3
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = $values()
            kotlinx.coroutines.selects.TrySelectDetailedResult.$VALUES = r0
            return
    }

    TrySelectDetailedResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.selects.TrySelectDetailedResult> r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = (kotlinx.coroutines.selects.TrySelectDetailedResult) r1
            return r1
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult[] values() {
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = (kotlinx.coroutines.selects.TrySelectDetailedResult[]) r0
            return r0
    }
}
