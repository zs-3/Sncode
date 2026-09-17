package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdir implements com.google.android.gms.internal.ads.zzcth {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;
    private final com.google.android.gms.internal.ads.zzdla zze;

    zzdir(java.util.Map r1, java.util.Map r2, java.util.Map r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzdla r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcth
    public final com.google.android.gms.internal.ads.zzegk zza(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.ads.zzegk r0 = (com.google.android.gms.internal.ads.zzegk) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L33
            r0 = 4
            if (r3 == r0) goto L13
            return r1
        L13:
            java.util.Map r3 = r2.zzc
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.internal.ads.zzeiy r3 = (com.google.android.gms.internal.ads.zzeiy) r3
            if (r3 == 0) goto L28
            com.google.android.gms.internal.ads.zzegl r1 = new com.google.android.gms.internal.ads.zzegl
            com.google.android.gms.internal.ads.zzctj r4 = new com.google.android.gms.internal.ads.zzctj
            r4.<init>()
            r1.<init>(r3, r4)
            goto L32
        L28:
            java.util.Map r3 = r2.zzb
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.internal.ads.zzegk r3 = (com.google.android.gms.internal.ads.zzegk) r3
            if (r3 != 0) goto L4b
        L32:
            return r1
        L33:
            com.google.android.gms.internal.ads.zzdla r0 = r2.zze
            com.google.android.gms.internal.ads.zzbhn r0 = r0.zze()
            if (r0 != 0) goto L3c
            goto L4a
        L3c:
            com.google.android.gms.internal.ads.zzhja r0 = r2.zzd
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzcth r0 = (com.google.android.gms.internal.ads.zzcth) r0
            com.google.android.gms.internal.ads.zzegk r3 = r0.zza(r3, r4)
            if (r3 != 0) goto L4b
        L4a:
            return r1
        L4b:
            com.google.android.gms.internal.ads.zzegl r4 = new com.google.android.gms.internal.ads.zzegl
            com.google.android.gms.internal.ads.zzctk r0 = new com.google.android.gms.internal.ads.zzctk
            r0.<init>()
            r4.<init>(r3, r0)
            return r4
    }
}
