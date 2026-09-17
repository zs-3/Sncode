package com.google.android.gms.ads.identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
final class zza extends java.lang.Thread {
    final /* synthetic */ java.util.Map zza;

    zza(com.google.android.gms.ads.identifier.AdvertisingIdClient r1, java.util.Map r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r5 = this;
            java.util.Map r0 = r5.zza
            java.lang.String r1 = "xGN4Vue"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r1.appendQueryParameter(r3, r4)
            goto L14
        L2a:
            android.net.Uri r0 = r1.build()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.identifier.zzc.zza(r0)
            return
    }
}
