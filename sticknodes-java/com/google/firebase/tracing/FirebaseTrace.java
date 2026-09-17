package com.google.firebase.tracing;

/* loaded from: classes2.dex */
public final class FirebaseTrace {
    public static void popTrace() {
            android.os.Trace.endSection()
            return
    }

    public static void pushTrace(java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }
}
