package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public final class ForcedSender {
    private static final java.lang.String LOG_TAG = "ForcedSender";

    private ForcedSender() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"DiscouragedApi"})
    public static void sendBlocking(com.google.android.datatransport.Transport<?> r1, com.google.android.datatransport.Priority r2) {
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.TransportImpl
            if (r0 == 0) goto L1b
            com.google.android.datatransport.runtime.TransportImpl r1 = (com.google.android.datatransport.runtime.TransportImpl) r1
            com.google.android.datatransport.runtime.TransportContext r1 = r1.getTransportContext()
            com.google.android.datatransport.runtime.TransportContext r1 = r1.withPriority(r2)
            com.google.android.datatransport.runtime.TransportRuntime r2 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r2 = r2.getUploader()
            r0 = 1
            r2.logAndUpdateState(r1, r0)
            goto L22
        L1b:
            java.lang.String r2 = "ForcedSender"
            java.lang.String r0 = "Expected instance of `TransportImpl`, got `%s`."
            com.google.android.datatransport.runtime.logging.Logging.w(r2, r0, r1)
        L22:
            return
    }
}
