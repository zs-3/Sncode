package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbcn {
    private final java.util.List zza;
    private final java.util.List zzb;
    private final java.util.List zzc;

    public zzbcn() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzc = r0
            return
    }

    public final java.util.List zza() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r4.zzb
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzbcm r2 = (com.google.android.gms.internal.ads.zzbcm) r2
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lb
            r0.add(r2)
            goto Lb
        L2b:
            java.util.List r1 = com.google.android.gms.internal.ads.zzbcw.zza()
            r0.addAll(r1)
            return r0
    }

    public final java.util.List zzb() {
            r4 = this;
            java.util.List r0 = r4.zza()
            java.util.List r1 = r4.zzc
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzbcm r2 = (com.google.android.gms.internal.ads.zzbcm) r2
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto La
            r0.add(r2)
            goto La
        L2a:
            java.util.List r1 = com.google.android.gms.internal.ads.zzbcw.zzb()
            r0.addAll(r1)
            return r0
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbcm r2) {
            r1 = this;
            java.util.List r0 = r1.zzb
            r0.add(r2)
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzbcm r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            r0.add(r2)
            return
    }

    public final void zze(android.content.SharedPreferences.Editor r4, int r5, org.json.JSONObject r6) {
            r3 = this;
            java.util.List r5 = r3.zza
            java.util.Iterator r5 = r5.iterator()
        L6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.ads.zzbcm r0 = (com.google.android.gms.internal.ads.zzbcm) r0
            int r1 = r0.zze()
            r2 = 1
            if (r1 != r2) goto L6
            java.lang.Object r1 = r0.zza(r6)
            r0.zzd(r4, r1)
            goto L6
        L21:
            if (r6 == 0) goto L2d
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "flag_configuration"
            r4.putString(r6, r5)
            return
        L2d:
            java.lang.String r4 = "Flag Json is null."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return
    }
}
