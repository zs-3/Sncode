package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzekg {
    private final com.google.android.gms.internal.ads.zzfhu zza;
    private final com.google.android.gms.internal.ads.zzdrr zzb;
    private final com.google.android.gms.internal.ads.zzdud zzc;

    public zzekg(com.google.android.gms.internal.ads.zzfhu r1, com.google.android.gms.internal.ads.zzdrr r2, com.google.android.gms.internal.ads.zzdud r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzfgk r3, com.google.android.gms.internal.ads.zzfgh r4, int r5, com.google.android.gms.internal.ads.zzego r6, long r7) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdud r0 = r2.zzc
            com.google.android.gms.internal.ads.zzduc r0 = r0.zza()
            r0.zzd(r3)
            r0.zzc(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.zzb(r3, r1)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "adapter_l"
            r0.zzb(r7, r3)
            java.lang.String r3 = java.lang.Integer.toString(r5)
            java.lang.String r5 = "sc"
            r0.zzb(r5, r3)
            if (r6 == 0) goto L47
            com.google.android.gms.ads.internal.client.zze r3 = r6.zzb()
            int r3 = r3.zza
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r5 = "arec"
            r0.zzb(r5, r3)
            com.google.android.gms.internal.ads.zzfhu r3 = r2.zza
            java.lang.String r5 = r6.getMessage()
            java.lang.String r3 = r3.zza(r5)
            if (r3 == 0) goto L47
            java.lang.String r5 = "areec"
            r0.zzb(r5, r3)
        L47:
            com.google.android.gms.internal.ads.zzdrr r3 = r2.zzb
            java.util.List r4 = r4.zzt
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzdrq r5 = r3.zza(r5)
            if (r5 == 0) goto L4f
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 == 0) goto L86
            java.lang.String r3 = r5.zza
            java.lang.String r4 = "ancn"
            r0.zzb(r4, r3)
            com.google.android.gms.internal.ads.zzbrz r3 = r5.zzb
            if (r3 == 0) goto L79
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "adapter_v"
            r0.zzb(r4, r3)
        L79:
            com.google.android.gms.internal.ads.zzbrz r3 = r5.zzc
            if (r3 == 0) goto L86
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "adapter_sv"
            r0.zzb(r4, r3)
        L86:
            r0.zzf()
            return
    }
}
