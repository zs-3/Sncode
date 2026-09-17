package kotlin.coroutines.jvm.internal;

/* compiled from: DebugMetadata.kt */
/* loaded from: classes2.dex */
public final class DebugMetadataKt {
    private static final void checkDebugMetadataVersion(int r3, int r4) {
            if (r4 > r3) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Debug metadata version mismatch. Expected: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", got "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ". Please update the Kotlin standard library."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final kotlin.coroutines.jvm.internal.DebugMetadata getDebugMetadataAnnotation(kotlin.coroutines.jvm.internal.BaseContinuationImpl r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r0 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r1 = (kotlin.coroutines.jvm.internal.DebugMetadata) r1
            return r1
    }

    private static final int getLabel(kotlin.coroutines.jvm.internal.BaseContinuationImpl r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "label"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L24
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L19
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L24
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L24
            goto L22
        L21:
            r2 = 0
        L22:
            int r2 = r2 - r1
            goto L25
        L24:
            r2 = -1
        L25:
            return r2
    }

    public static final java.lang.StackTraceElement getStackTraceElement(kotlin.coroutines.jvm.internal.BaseContinuationImpl r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = getDebugMetadataAnnotation(r4)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r1 = 1
            int r2 = r0.v()
            checkDebugMetadataVersion(r1, r2)
            int r1 = getLabel(r4)
            if (r1 >= 0) goto L1d
            r1 = -1
            goto L23
        L1d:
            int[] r2 = r0.l()
            r1 = r2[r1]
        L23:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever r2 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE
            java.lang.String r4 = r2.getModuleName(r4)
            if (r4 != 0) goto L30
            java.lang.String r4 = r0.c()
            goto L48
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            java.lang.String r4 = r0.c()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L48:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r4, r3, r0, r1)
            return r2
    }
}
