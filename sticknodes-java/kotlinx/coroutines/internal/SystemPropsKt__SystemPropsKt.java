package kotlinx.coroutines.internal;

/* compiled from: SystemProps.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class SystemPropsKt__SystemPropsKt {
    private static final int AVAILABLE_PROCESSORS = 0;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS = r0
            return
    }

    public static final int getAVAILABLE_PROCESSORS() {
            int r0 = kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS
            return r0
    }

    public static final java.lang.String systemProp(java.lang.String r0) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
