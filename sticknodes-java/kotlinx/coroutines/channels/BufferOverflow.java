package kotlinx.coroutines.channels;

/* compiled from: BufferOverflow.kt */
/* loaded from: classes2.dex */
public enum BufferOverflow extends java.lang.Enum<kotlinx.coroutines.channels.BufferOverflow> {
    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $VALUES = null;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_LATEST = null;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_OLDEST = null;
    public static final kotlinx.coroutines.channels.BufferOverflow SUSPEND = null;

    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $values() {
            r0 = 3
            kotlinx.coroutines.channels.BufferOverflow[] r0 = new kotlinx.coroutines.channels.BufferOverflow[r0]
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "SUSPEND"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.SUSPEND = r0
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "DROP_OLDEST"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST = r0
            kotlinx.coroutines.channels.BufferOverflow r0 = new kotlinx.coroutines.channels.BufferOverflow
            java.lang.String r1 = "DROP_LATEST"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST = r0
            kotlinx.coroutines.channels.BufferOverflow[] r0 = $values()
            kotlinx.coroutines.channels.BufferOverflow.$VALUES = r0
            return
    }

    BufferOverflow(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.channels.BufferOverflow valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.channels.BufferOverflow> r0 = kotlinx.coroutines.channels.BufferOverflow.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.channels.BufferOverflow r1 = (kotlinx.coroutines.channels.BufferOverflow) r1
            return r1
    }

    public static kotlinx.coroutines.channels.BufferOverflow[] values() {
            kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.channels.BufferOverflow[] r0 = (kotlinx.coroutines.channels.BufferOverflow[]) r0
            return r0
    }
}
