package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnd {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    zzcnd(java.util.Map r1, java.util.Map r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzfgt r7) throws java.lang.Exception {
            r6 = this;
            com.google.android.gms.internal.ads.zzfgs r7 = r7.zzb
            java.util.List r7 = r7.zzc
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r7.next()
            com.google.android.gms.internal.ads.zzfgr r0 = (com.google.android.gms.internal.ads.zzfgr) r0
            java.util.Map r1 = r6.zza
            java.lang.String r2 = r0.zza
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L2e
            java.util.Map r1 = r6.zza
            java.lang.String r2 = r0.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzcng r1 = (com.google.android.gms.internal.ads.zzcng) r1
            org.json.JSONObject r0 = r0.zzb
            r1.zza(r0)
            goto L8
        L2e:
            java.util.Map r1 = r6.zzb
            java.lang.String r2 = r0.zza
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L8
            java.util.Map r1 = r6.zzb
            java.lang.String r2 = r0.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzcnf r1 = (com.google.android.gms.internal.ads.zzcnf) r1
            org.json.JSONObject r0 = r0.zzb
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r0.keys()
        L4d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r0.optString(r4)
            if (r5 == 0) goto L4d
            r2.put(r4, r5)
            goto L4d
        L63:
            r1.zza(r2)
            goto L8
        L67:
            return
    }
}
