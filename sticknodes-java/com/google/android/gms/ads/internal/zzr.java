package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzr extends android.os.AsyncTask {
    final /* synthetic */ com.google.android.gms.ads.internal.zzt zza;

    /* synthetic */ zzr(com.google.android.gms.ads.internal.zzt r1, com.google.android.gms.ads.internal.zzq r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            java.lang.String r1 = r0.zza(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.ads.internal.zzt r0 = r2.zza
            java.lang.String r3 = (java.lang.String) r3
            android.webkit.WebView r1 = com.google.android.gms.ads.internal.zzt.zze(r0)
            if (r1 == 0) goto L13
            if (r3 == 0) goto L13
            android.webkit.WebView r0 = com.google.android.gms.ads.internal.zzt.zze(r0)
            r0.loadUrl(r3)
        L13:
            return
    }

    protected final java.lang.String zza(java.lang.Void... r6) {
            r5 = this;
            java.lang.String r6 = ""
            com.google.android.gms.ads.internal.zzt r0 = r5.zza     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            java.util.concurrent.Future r1 = com.google.android.gms.ads.internal.zzt.zzu(r0)     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            r2 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            java.lang.Object r1 = r1.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            com.google.android.gms.internal.ads.zzavn r1 = (com.google.android.gms.internal.ads.zzavn) r1     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            com.google.android.gms.ads.internal.zzt.zzv(r0, r1)     // Catch: java.util.concurrent.TimeoutException -> L16 java.util.concurrent.ExecutionException -> L1b java.lang.InterruptedException -> L1d
            goto L21
        L16:
            r0 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r0)
            goto L21
        L1b:
            r0 = move-exception
            goto L1e
        L1d:
            r0 = move-exception
        L1e:
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r0)
        L21:
            com.google.android.gms.ads.internal.zzt r6 = r5.zza
            java.lang.String r6 = r6.zzp()
            return r6
    }
}
