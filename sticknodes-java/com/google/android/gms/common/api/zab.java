package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    zab(com.google.android.gms.common.api.Batch r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r5) {
            r4 = this;
            com.google.android.gms.common.api.Batch r0 = r4.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.Batch.zab(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L66
            boolean r1 = r1.isCanceled()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            return
        L11:
            boolean r1 = r5.isCanceled()     // Catch: java.lang.Throwable -> L66
            r2 = 1
            if (r1 == 0) goto L1e
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.api.Batch.zad(r5, r2)     // Catch: java.lang.Throwable -> L66
            goto L29
        L1e:
            boolean r5 = r5.isSuccess()     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L29
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.api.Batch.zac(r5, r2)     // Catch: java.lang.Throwable -> L66
        L29:
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L66
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L66
            int r1 = r1 + (-1)
            com.google.android.gms.common.api.Batch.zae(r5, r1)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.api.Batch r5 = r4.zaa     // Catch: java.lang.Throwable -> L66
            int r1 = com.google.android.gms.common.api.Batch.zaa(r5)     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L64
            boolean r1 = com.google.android.gms.common.api.Batch.zah(r5)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L46
            com.google.android.gms.common.api.Batch.zaf(r5)     // Catch: java.lang.Throwable -> L66
            goto L64
        L46:
            boolean r5 = com.google.android.gms.common.api.Batch.zag(r5)     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L54
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L66
            r1 = 13
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L66
            goto L56
        L54:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L66
        L56:
            com.google.android.gms.common.api.Batch r1 = r4.zaa     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.api.PendingResult[] r3 = com.google.android.gms.common.api.Batch.zai(r1)     // Catch: java.lang.Throwable -> L66
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L66
            r1.setResult(r2)     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            return
        L66:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r5
    }
}
